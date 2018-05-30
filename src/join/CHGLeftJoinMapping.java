package join;

import model.Chg;
import model.Mapping;
import model.OutputChg;
import model.NotFoundOutputMapping;

import org.apache.flink.api.common.functions.FlatJoinFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.util.Collector;

import util.Constant;
import util.Helper;

public class CHGLeftJoinMapping implements
		FlatJoinFunction<Chg, Mapping, OutputChg> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void join(Chg leftElem, Mapping rightElem, Collector<OutputChg> out)
			throws Exception {
		// TODO Auto-generated method stub

		if (rightElem != null) {
			String str1 = leftElem.getTimestamp_R() + "|"
					+ leftElem.getT_Year() + "|" + leftElem.getT_Month() + "|"
					+ leftElem.getT_Day() + "|" + leftElem.getT_Hour() + "|"
					+ leftElem.getT_Mins() + "|" + leftElem.getT_Secs();			
			String str2 = leftElem.getLocationNumberTypeA() + "|"
					+ leftElem.getLocationNumberA();			
			String str3 = leftElem.getLocationNumberTypeB() + "|"
					+ leftElem.getLocationNumberB() + "|"
					+ leftElem.getNrOfReroutings() + "|" + leftElem.getIMSI()
					+ "|" + leftElem.getNrOfNetworkReroutings() + "|"
					+ leftElem.getRedirectingPartyID() + "|"
					+ leftElem.getPreCallDuration() + "|"
					+ leftElem.getCallDuration() + "|"
					+ leftElem.getChargingID() + "|"
					+ leftElem.getRoamingFlag() + "|"
					+ leftElem.getVLR_Number() + "|" + leftElem.getCell_ID()
					+ "|" + leftElem.getNegotiatedQoS() + "|"
					+ leftElem.getRequestedQoS() + "|"
					+ leftElem.getSubscribedQoS() + "|"
					+ leftElem.getDialled_APN() + "|" + leftElem.getEventType()
					+ "|" + leftElem.getProviderID() + "|"
					+ leftElem.getCurrency() + "|"
					+ leftElem.getSubscriber_status() + "|"
					+ leftElem.getForwarding_flag() + "|"
					+ leftElem.getFirst_call_flag() + "|"
					+ leftElem.getCAMEL_Roaming() + "|"
					+ leftElem.getTime_zone() + "|"
					+ leftElem.getAccount_Balance() + "|"
					+ leftElem.getAccount_Delta() + "|"
					+ leftElem.getAccount_Number();			
			String str4 = leftElem.getGuiding_resource_type() + "|"
					+ leftElem.getRounded_duration() + "|"
					+ leftElem.getTotal_volume() + "|"
					+ leftElem.getRounded_total_volume() + "|"
					+ leftElem.getEvent_start_period() + "|"
					+ leftElem.getCharge_including_free_alwnce() + "|"
					+ leftElem.getDiscount_amount() + "|"
					+ leftElem.getFree_total_volume() + "|"
					+ leftElem.getFree_duration() + "|"
					+ leftElem.getCall_direction() + "|"
					+ leftElem.getCharge_code_description() + "|"
					+ leftElem.getSpecial_number_ind() + "|"
					+ leftElem.getBonus_Information() + "|"
					+ leftElem.getInternalCause() + "|"
					+ leftElem.getBasicCause() + "|" + leftElem.getTime_band()
					+ "|" + leftElem.getCall_type() + "|"
					+ leftElem.getBonus_consumed() + "|"
					+ leftElem.getVAS_code() + "|"
					+ leftElem.getService_filter() + "|"
					+ leftElem.getNational_calling_zone() + "|"
					+ leftElem.getNational_called_zone() + "|"
					+ leftElem.getInternational_calling_zone() + "|"
					+ leftElem.getInternational_called_zone() + "|"
					+ leftElem.getCredit_indicator() + "|"
					+ leftElem.getEvent_ID() + "|" + leftElem.getAccess_code()
					+ "|" + leftElem.getCountry_name() + "|"
					+ leftElem.getCP_name() + "|" + leftElem.getContent_id()
					+ "|" + leftElem.getRating_Group() + "|"
					+ leftElem.getBFT_Indicator() + "|"
					+ leftElem.getUnapplied_amount() + "|"
					+ leftElem.getPartition_ID() + "|"
					+ leftElem.getRatedDateTime() + "|" + leftElem.getArea()
					+ "|" + leftElem.getCost_band() + "|"
					+ leftElem.getRating_Offer_Id() + "|"
					+ leftElem.getSettlement_Indicator() + "|"
					+ leftElem.getTap_Code() + "|" + leftElem.getMCC_MNC()
					+ "|" + leftElem.getRATINGPRICINGITEMID() + "|"
					+ leftElem.getFileIdentifier() + "|"
					+ leftElem.getRecordNumber() + "|"
					+ leftElem.getFutureString1() + "|"
					+ leftElem.getFutureString2() + "|"
					+ leftElem.getTSel_Cost_Band() + "|" + leftElem.getIMEI()
					+ "|" + leftElem.getLAC() + "|" + leftElem.getCI() + "|"
					+ leftElem.getBonus_consumed_1() + "|"
					+ leftElem.getBonus_consumed_2() + "|"
					+ leftElem.getBonus_consumed_3() + "|"
					+ leftElem.getBonus_consumed_4() + "|"
					+ leftElem.getBonus_consumed_5() + "|"
					+ leftElem.getBonus_consumed_6() + "|"
					+ leftElem.getBonus_consumed_7() + "|"
					+ leftElem.getBonus_consumed_8() + "|"
					+ leftElem.getBonus_consumed_9() + "|"
					+ leftElem.getBonus_consumed_10() + "|"
					+ leftElem.getBonus_consumed_11() + "|"
					+ leftElem.getBonus_consumed_12() + "|"
					+ leftElem.getBonus_consumed_13() + "|"
					+ leftElem.getBonus_consumed_14() + "|"
					+ leftElem.getBonus_consumed_15() + "|"
					+ leftElem.getBonus_consumed_16() + "|"
					+ leftElem.getBonus_consumed_17() + "|"
					+ leftElem.getBonus_consumed_18() + "|"
					+ leftElem.getBonus_consumed_19() + "|"
					+ leftElem.getBonus_consumed_20() + "|"
					+ leftElem.getBonus_Information_1() + "|"
					+ leftElem.getBonus_Information_2() + "|"
					+ leftElem.getBonus_Information_3() + "|"
					+ leftElem.getBonus_Information_4() + "|"
					+ leftElem.getBonus_Information_5() + "|"
					+ leftElem.getBonus_Information_6() + "|"
					+ leftElem.getBonus_Information_7() + "|"
					+ leftElem.getBonus_Information_8() + "|"
					+ leftElem.getBonus_Information_9() + "|"
					+ leftElem.getBonus_Information_10() + "|"
					+ leftElem.getNetwork_Activity_id() + "|"
					+ leftElem.getOPERATOR_NAME() + "|"
					+ leftElem.getEXTRACTION_FILE_NAME() + "|"
					+ leftElem.getROW_ID() + "|" + leftElem.getExtraction_ts();
			
			String aparty = leftElem.getA_Party().replace(" ", "");
			String bparty = leftElem.getB_Party().replace(" ", "");
			String accountOwner = leftElem.getAccount_OwnerBefore();
			String eventSource = leftElem.getEvent_Source().replace(" ", "");
			
			String subscriberID = rightElem.f1.replace(" ", "");
			
			OutputChg outputChg = new OutputChg();

			if (accountOwner.equals(aparty)) {
				aparty = subscriberID;
				accountOwner = subscriberID;
				eventSource = subscriberID;

			} else if (accountOwner.equals(
					bparty)) {
				bparty = subscriberID;
				accountOwner = subscriberID;
				eventSource = subscriberID;
			}

			outputChg.setFields(str1, aparty, str2, bparty, str3, accountOwner, eventSource, str4);
			
			out.collect(outputChg);
		}

	}
}
