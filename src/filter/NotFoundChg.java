package filter;

import model.Chg;
import model.Mapping;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.java.tuple.Tuple2;



public class NotFoundChg implements FilterFunction<Tuple2<Chg,Mapping>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Override
	public boolean filter(Tuple2<Chg,Mapping> in)
			throws Exception {
		return in.f1.f1.equalsIgnoreCase("");
	}

}