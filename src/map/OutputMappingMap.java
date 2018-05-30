package map;

import model.Mapping;
import model.NotFoundOutputMapping;

import org.apache.flink.api.common.functions.MapFunction;

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

public class OutputMappingMap implements
		MapFunction<Mapping, NotFoundOutputMapping> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public NotFoundOutputMapping map(Mapping in) throws Exception {
		// TODO Auto-generated method stub
		NotFoundOutputMapping out = new NotFoundOutputMapping();


		out.setFields(in.f3, in.f1, in.f2);

		return out;
	}
}
