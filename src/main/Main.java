package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import join.CHGLeftJoinMapping;
import join.CHGLeftJoinMappingFull;
import join.CHGLeftJoinMappingNULLOnly;
import map.ChgFlatMap;
import map.IncrementMappingMap;
import map.MappingFlatMap;
import map.OutputMap;
import map.OutputMappingMap;
import map.TempChgMap;
import map.TempMappingMap;
import map.TempMappingMap;
import model.Chg;
import model.Mapping;
import model.NotFoundOutputMapping;
import model.OutputChg;

import org.apache.flink.api.common.operators.base.JoinOperatorBase.JoinHint;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.core.fs.FileSystem.WriteMode;

import filter.FoundChg;
import filter.NotFoundChg;
import util.Constant;
import util.Helper;

public class Main {
	private HashMap<String, DataSet<String>> dataset_inputs = new HashMap<String, DataSet<String>>();
	private ExecutionEnvironment env;
	private int proses_paralel;
	private int sink_paralel;
	private Configuration parameter;
	private String outputPath;
	private String outputPath_notfound;
	private String max_mapping;

	// tuples variable
	private DataSet<Chg> chg_tuples;
	private DataSet<Tuple2<Chg, Mapping>> chg_mapping_tuples;
	private DataSet<Tuple2<Chg, Mapping>> chg_mapping_tuples_found;
	private DataSet<Tuple2<Chg, Mapping>> chg_mapping_tuples_notfound;

	private DataSet<Mapping> mapping_tuples;
	private DataSet<Mapping> mapping_tuples_notfound;

	private DataSet<OutputChg> output_chg_tuples;
	private DataSet<OutputChg> output_chg_found_tuples;
	private DataSet<OutputChg> output_chg_notfound_tuples;
	private DataSet<NotFoundOutputMapping> output_mapping_notfound_tuples;

	public Main(int proses_paralel, int sink_paralel, String outputPath,
			String outputPath_notfound, String max_mapping) {
		this.env = ExecutionEnvironment.getExecutionEnvironment();
		this.parameter = new Configuration();
		this.outputPath = outputPath;
		this.outputPath_notfound = outputPath_notfound;
		this.max_mapping = max_mapping;
		

		this.proses_paralel = proses_paralel;
		this.sink_paralel = sink_paralel;
		this.env.setParallelism(this.proses_paralel);
		this.parameter.setBoolean("recursive.file.enumeration", true);
		// BasicConfigurator.configure(); //remove log warn
	}
	
	

	public String getMax_mapping() {
		return max_mapping;
	}



	public void setMax_mapping(String max_mapping) {
		this.max_mapping = max_mapping;
	}



	public int getSink_paralel() {
		return sink_paralel;
	}

	public void setSink_paralel(int sink_paralel) {
		this.sink_paralel = sink_paralel;
	}

	public int getProses_paralel() {
		return proses_paralel;
	}

	public void setProses_paralel(int proses_paralel) {
		this.proses_paralel = proses_paralel;
	}

	public String getOutputPath_notfound() {
		return outputPath_notfound;
	}

	public void setOutputPath_notfound(String outputPath_notfound) {
		this.outputPath_notfound = outputPath_notfound;
	}

	private String getOutputPath() {
		return this.outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	private Configuration getParameter() {
		return this.parameter;
	}

	private ExecutionEnvironment getEnv() {
		return this.env;
	}

	private void setInput(HashMap<String, String> files) {

		for (Map.Entry<String, String> file : files.entrySet()) {
			dataset_inputs.put(
					file.getKey(),
					getEnv().readTextFile(file.getValue()).withParameters(
							getParameter()));
		}

	}

	public void processInput() {
		chg_tuples = dataset_inputs.get("source_chg").flatMap(new ChgFlatMap());
		mapping_tuples = dataset_inputs.get("ref_mapping").flatMap(
				new MappingFlatMap());

	}

	public void processAggregate() throws Exception {

		// get last subscriberID from mapping master
		chg_mapping_tuples = chg_tuples
				.leftOuterJoin(mapping_tuples, JoinHint.REPARTITION_HASH_FIRST)
				.where("Account_Owner").equalTo(0)
				.with(new CHGLeftJoinMappingFull());

		chg_mapping_tuples_found = chg_mapping_tuples.filter(new FoundChg());
		chg_mapping_tuples_notfound = chg_mapping_tuples
				.filter(new NotFoundChg());

		mapping_tuples_notfound = chg_mapping_tuples_notfound
				.map(new TempMappingMap()).distinct()
				.map(new IncrementMappingMap(getMax_mapping())).setParallelism(1);
		
//		Helper.max_subscriberID = Long.parseLong(getMax_mapping());
//		List<Mapping> tempList = chg_mapping_tuples_notfound.map(new TempMappingMap()).distinct().collect();
//		for (Mapping mapping : tempList) {
//			Helper.max_subscriberID += 1;
//			mapping.f1 = Long.toString(Helper.max_subscriberID);
//			mapping.f2 = "1/1/1900";			
//		}		
//		mapping_tuples_notfound = env.fromCollection(tempList);

		// OUPUT
		output_mapping_notfound_tuples = mapping_tuples_notfound.map(
				new OutputMappingMap()).setParallelism(getProses_paralel());

		output_chg_found_tuples = chg_mapping_tuples_found.map(new OutputMap());
		output_chg_notfound_tuples = chg_mapping_tuples_notfound
				.map(new TempChgMap())
				.join(mapping_tuples_notfound, JoinHint.REPARTITION_HASH_FIRST)
				.where("Account_Owner").equalTo(0).map(new OutputMap());

		output_chg_tuples = output_chg_found_tuples
				.union(output_chg_notfound_tuples);

	}

	public void sink() throws Exception {
		// dump notfound mapping to later append to master mapping
		output_mapping_notfound_tuples.writeAsCsv(getOutputPath_notfound(),
				"\n", "|", WriteMode.OVERWRITE).setParallelism(
				getSink_paralel());

		// dump chg anonymous
		output_chg_tuples.writeAsCsv(getOutputPath(), "\n", "|",
				WriteMode.OVERWRITE).setParallelism(getSink_paralel());

	}

	public static void main(String[] args) throws Exception {
		// set data input
		HashMap<String, String> files = new HashMap<String, String>();

		/** prod **/
		ParameterTool params = ParameterTool.fromArgs(args);

		int proses_paralel = params.getInt("slot");
		int sink_paralel = params.getInt("sink");
		String source = params.get("source");
		String mapping = params.get("mapping");
		String output = params.get("output");
		String output_notfound = params.get("output_notfound");
		String max_mapping = params.get("max_mapping");

		Main main = new Main(proses_paralel, sink_paralel, output,
				output_notfound, max_mapping);

		files.put("source_chg", source);
		files.put("ref_mapping", mapping);

		/** dev **/
//		 int proses_paralel = 2;
//		 int sink_paralel = 1;
//		
//		 Main main = new Main(proses_paralel, sink_paralel, Constant.OUTPUT,
//		 Constant.OUTPUT_NOTFOUND, "1000000");
//		 files.put("source_chg", Constant.FILE_CHG);
//		 files.put("ref_mapping", Constant.FILE_MAPPING);

		/****/

//		System.out.println("hehehehe start: "+Main.max_mapping);
//		TimeUnit.SECONDS.sleep(5);
		
		main.setInput(files);

		main.processInput();

		main.processAggregate();

		main.sink();

		// System.out.println(env.getExecutionPlan());
		try {
			main.getEnv().execute("job flink chg");
		} catch (Exception e) {
			// TODO Auto-generated catch blockF
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
