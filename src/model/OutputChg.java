package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.flink.api.java.tuple.Tuple10;
import org.apache.flink.api.java.tuple.Tuple11;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.api.java.tuple.Tuple7;
import org.apache.flink.api.java.tuple.Tuple8;
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

public class OutputChg
		extends
		Tuple8<String, String, String, String, String,String,String,String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void setFields(String str1, String aparty, String str2, String bparty, String str3, String accountOwner, String eventsource, String str4) {
		// TODO Auto-generated method stub


		super.setFields(str1, aparty, str2, bparty, str3, accountOwner, eventsource, str4);
	}

}
