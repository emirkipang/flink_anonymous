package model;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.api.java.tuple.Tuple4;

public class Mapping extends Tuple4<String, String, String,String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	@Override
	public void setFields(String msisdn, String subscriberid, String startDate, String msisdnBefore) {
		// TODO Auto-generated method stub


		super.setFields(msisdn, subscriberid, startDate, msisdnBefore);
	}

}
