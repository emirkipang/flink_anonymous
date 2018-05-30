package util;

public class Constant {
	public static final String BASEDIR = "D:/Data/GIA/output";

	public static final String FILE_CHG  = BASEDIR
			+ "/ref/HADOOP_2017-03-21_010117.000000_858618288_CHG_BJM_Pre_20170321140114_02530576_14.0_REG.csv";
	
//	public static final String FILE_MAPPING  = BASEDIR
//			+ "/ref/Mapping_MSISDN_SBCRBRID.txt";
	public static final String FILE_MAPPING  = BASEDIR
			+ "/ref/sse_mapping.txt";

	public static final String OUTPUT = BASEDIR + "/out/chg_anonymous.csv";
	public static final String OUTPUT_NOTFOUND = BASEDIR + "/out/notfound_mapping.csv";

	// public static String BASEDIR = "/data/hnat_qsr/data";
	//
	// public static String FILE_CHG = BASEDIR
	// +
	// "/ref/HADOOP_2017-03-21_010117.000000_858618288_CHG_BJM_Pre_20170321140114_02530576_14.0_REG.csv";
	//
	// public static String FILE_LACIMA = BASEDIR +
	// "/ref/run_laccima_query.csv";
	// public static String FILE_LACIMA_4G = BASEDIR
	// + "/ref/run_laccima_4g_query.csv";
	// public static String FILE_MDL = BASEDIR + "/ref/run_mst_query.csv";
	//
	// public static String OUTPUT = BASEDIR + "/out/chg_summary.csv";

	public static String joinRule(String in, int length) {
		int gap = length - in.length();

		if (gap != 0) {
			for (int i = 1; i <= gap; i++) {
				in = "0" + in;
			}
		}

		return in;
	}

}
