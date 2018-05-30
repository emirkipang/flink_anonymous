package dev;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.flink.api.java.tuple.Tuple10;
import org.apache.flink.api.java.tuple.Tuple11;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.api.java.tuple.Tuple5;


//
//this.Timestamp_R = Timestamp_R;
//this.lacci = lacci;
//this.A_Party = A_Party;
//this.Account_Delta = Account_Delta;
//this.trx = trx;

public class Output2
		extends
		Tuple5<String, String, String, String, String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void setFields(String col1, String col2, String col3,
			String col4, String col5) {
		// TODO Auto-generated method stub

		

		super.setFields(col1, col2, col3, col4, col5);
	}

}
