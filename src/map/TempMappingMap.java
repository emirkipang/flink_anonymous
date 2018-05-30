package map;

import model.Chg;
import model.Mapping;
import model.NotFoundOutputMapping;
import model.OutputChg;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;

import util.Constant;
import util.Helper;

//Channel
//Tanggal
//Area
//Region
//Branch
//SubBranch
//Cluster
//Tot_Amount
//Tot_Trx
//prc_date
//prc_hour

public class TempMappingMap implements
		MapFunction<Tuple2<Chg, Mapping>, Mapping> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Mapping map(Tuple2<Chg, Mapping> in) throws Exception {
		// TODO Auto-generated method stub

		return in.f1;

	}
}
