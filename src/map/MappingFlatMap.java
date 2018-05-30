package map;


import model.Mapping;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.util.Collector;

import util.Constant;

public class MappingFlatMap implements FlatMapFunction<String, Mapping> {

	/**
* 
*/
	private static final long serialVersionUID = 1L;

	@Override
	public void flatMap(String in, Collector<Mapping> out) throws Exception {
		// TODO Auto-generated method stub
		String[] lines = in.split("\n");

		for (String line : lines) {

			String[] items = line.split("\\|", -1);
			
			Mapping m = new Mapping();
			m.setFields(Constant.joinRule(items[0].replace(" ", ""),20),items[1].replace(" ", ""),items[2],items[0]);

			out.collect(m);

		}

	}

}
