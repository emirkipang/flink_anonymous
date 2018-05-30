package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.flink.api.java.tuple.Tuple10;
import org.apache.flink.api.java.tuple.Tuple11;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.api.java.tuple.Tuple9;

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

public class NotFoundOutputMapping
		extends
		Tuple3<String, String, String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void setFields(String msisdnBefore, String subscriberid, String date) {
		// TODO Auto-generated method stub


		super.setFields(msisdnBefore, subscriberid, date);
	}

}
