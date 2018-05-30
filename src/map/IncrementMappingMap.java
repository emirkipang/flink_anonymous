package map;

import main.Main;
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

public class IncrementMappingMap implements
		MapFunction<Mapping, Mapping> {
	private long subscriberid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncrementMappingMap(String substriberid){
		this.subscriberid  = Long.parseLong(substriberid);
	}

	@Override
	public Mapping map(Mapping in) throws Exception {
		// TODO Auto-generated method stub		
		
		subscriberid += 1;
		String subscriberID = Long.toString(subscriberid);
		String defaultDate = "1/1/1990";
		String AccountOwnerBefore = in.f3;
		String AccountOwner= in.f0;

		Mapping m = new Mapping();
		m.setFields(AccountOwner, subscriberID, defaultDate, AccountOwnerBefore);

		return m;

	}
}
