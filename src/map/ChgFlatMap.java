package map;

import model.Chg;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.util.Collector;

import util.Constant;

public class ChgFlatMap implements FlatMapFunction<String, Chg> {

	/**
* 
*/
	private static final long serialVersionUID = 1L;

	@Override
	public void flatMap(String in, Collector<Chg> out) throws Exception {
		// TODO Auto-generated method stub
		String[] lines = in.split("\n");

		for (String line : lines) {

			String[] items = line.split("\\|", -1);

			out.collect(new Chg(items[0], items[1], items[2], items[3],
					items[4], items[5], items[6], items[7], items[8], items[9],
					items[10], items[11], items[12], items[13], items[14],
					items[15], items[16], items[17], items[18], items[19],
					items[20], items[21], items[22], items[23], items[24],
					items[25], items[26], items[27], items[28], items[29],
					items[30], items[31], items[32], items[33], items[34],
					items[35], items[36], items[37], Constant.joinRule(
							items[38].replace(" ",""), 20), items[39], items[40], items[41],
					items[42], items[43], items[44], items[45], items[46],
					items[47], items[48], items[49], items[50], items[51],
					items[52], items[53], items[54], items[55], items[56],
					items[57], items[58], items[59], items[60], items[61],
					items[62], items[63], items[64], items[65], items[66],
					items[67], items[68], items[69], items[70], items[71],
					items[72], items[73], items[74], items[75], items[76],
					items[77], items[78], items[79], items[80], items[81],
					items[82], items[83], items[84], items[85], items[86],
					items[87], items[88], items[89], items[90], items[91],
					items[92], items[93], items[94], items[95], items[96],
					items[97], items[98], items[99], items[100], items[101],
					items[102], items[103], items[104], items[105], items[106],
					items[107], items[108], items[109], items[110], items[111],
					items[112], items[113], items[114], items[115], items[116],
					items[117], items[118], items[119], items[120], items[121],
					items[122], items[123], items[124], items[38]

			));

		}

	}

}
