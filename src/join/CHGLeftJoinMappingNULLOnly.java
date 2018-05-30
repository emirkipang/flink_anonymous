package join;

import model.Chg;
import model.Mapping;
import model.NotFoundOutputMapping;

import org.apache.flink.api.common.functions.FlatJoinFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.util.Collector;

import util.Helper;

public class CHGLeftJoinMappingNULLOnly implements
		FlatJoinFunction<Chg, Mapping, Mapping> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void join(Chg leftElem, Mapping rightElem, Collector<Mapping> out)
			throws Exception {
		// TODO Auto-generated method stub

		if (rightElem == null) {
			Mapping mapping = new Mapping();
			
			
			mapping.setFields(leftElem.getAccount_Owner(), "", "",
					leftElem.getAccount_OwnerBefore());

			out.collect(mapping);
		}

	}

}
