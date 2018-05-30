package map;

import model.Chg;
import model.Mapping;
import model.NotFoundOutputMapping;
import model.OutputChg;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;

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

public class OutputMap implements MapFunction<Tuple2<Chg, Mapping>, OutputChg> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public OutputChg map(Tuple2<Chg, Mapping> in) throws Exception {
		// TODO Auto-generated method stub

		String str1 = in.f0.getTimestamp_R() + "|" + in.f0.getT_Year()
				+ "|" + in.f0.getT_Month() + "|" + in.f0.getT_Day() + "|"
				+ in.f0.getT_Hour() + "|" + in.f0.getT_Mins() + "|"
				+ in.f0.getT_Secs();
		String str2 = in.f0.getLocationNumberTypeA() + "|"
				+ in.f0.getLocationNumberA();
		String str3 = in.f0.getLocationNumberTypeB() + "|"
				+ in.f0.getLocationNumberB() + "|"
				+ in.f0.getNrOfReroutings() + "|" + in.f0.getIMSI() + "|"
				+ in.f0.getNrOfNetworkReroutings() + "|"
				+ in.f0.getRedirectingPartyID() + "|"
				+ in.f0.getPreCallDuration() + "|"
				+ in.f0.getCallDuration() + "|" + in.f0.getChargingID()
				+ "|" + in.f0.getRoamingFlag() + "|"
				+ in.f0.getVLR_Number() + "|" + in.f0.getCell_ID() + "|"
				+ in.f0.getNegotiatedQoS() + "|"
				+ in.f0.getRequestedQoS() + "|"
				+ in.f0.getSubscribedQoS() + "|" + in.f0.getDialled_APN()
				+ "|" + in.f0.getEventType() + "|"
				+ in.f0.getProviderID() + "|" + in.f0.getCurrency() + "|"
				+ in.f0.getSubscriber_status() + "|"
				+ in.f0.getForwarding_flag() + "|"
				+ in.f0.getFirst_call_flag() + "|"
				+ in.f0.getCAMEL_Roaming() + "|" + in.f0.getTime_zone()
				+ "|" + in.f0.getAccount_Balance() + "|"
				+ in.f0.getAccount_Delta() + "|"
				+ in.f0.getAccount_Number();
		String str4 = in.f0.getGuiding_resource_type() + "|"
				+ in.f0.getRounded_duration() + "|"
				+ in.f0.getTotal_volume() + "|"
				+ in.f0.getRounded_total_volume() + "|"
				+ in.f0.getEvent_start_period() + "|"
				+ in.f0.getCharge_including_free_alwnce() + "|"
				+ in.f0.getDiscount_amount() + "|"
				+ in.f0.getFree_total_volume() + "|"
				+ in.f0.getFree_duration() + "|"
				+ in.f0.getCall_direction() + "|"
				+ in.f0.getCharge_code_description() + "|"
				+ in.f0.getSpecial_number_ind() + "|"
				+ in.f0.getBonus_Information() + "|"
				+ in.f0.getInternalCause() + "|" + in.f0.getBasicCause()
				+ "|" + in.f0.getTime_band() + "|" + in.f0.getCall_type()
				+ "|" + in.f0.getBonus_consumed() + "|"
				+ in.f0.getVAS_code() + "|" + in.f0.getService_filter()
				+ "|" + in.f0.getNational_calling_zone() + "|"
				+ in.f0.getNational_called_zone() + "|"
				+ in.f0.getInternational_calling_zone() + "|"
				+ in.f0.getInternational_called_zone() + "|"
				+ in.f0.getCredit_indicator() + "|" + in.f0.getEvent_ID()
				+ "|" + in.f0.getAccess_code() + "|"
				+ in.f0.getCountry_name() + "|" + in.f0.getCP_name()
				+ "|" + in.f0.getContent_id() + "|"
				+ in.f0.getRating_Group() + "|"
				+ in.f0.getBFT_Indicator() + "|"
				+ in.f0.getUnapplied_amount() + "|"
				+ in.f0.getPartition_ID() + "|"
				+ in.f0.getRatedDateTime() + "|" + in.f0.getArea() + "|"
				+ in.f0.getCost_band() + "|" + in.f0.getRating_Offer_Id()
				+ "|" + in.f0.getSettlement_Indicator() + "|"
				+ in.f0.getTap_Code() + "|" + in.f0.getMCC_MNC() + "|"
				+ in.f0.getRATINGPRICINGITEMID() + "|"
				+ in.f0.getFileIdentifier() + "|"
				+ in.f0.getRecordNumber() + "|"
				+ in.f0.getFutureString1() + "|"
				+ in.f0.getFutureString2() + "|"
				+ in.f0.getTSel_Cost_Band() + "|" + in.f0.getIMEI() + "|"
				+ in.f0.getLAC() + "|" + in.f0.getCI() + "|"
				+ in.f0.getBonus_consumed_1() + "|"
				+ in.f0.getBonus_consumed_2() + "|"
				+ in.f0.getBonus_consumed_3() + "|"
				+ in.f0.getBonus_consumed_4() + "|"
				+ in.f0.getBonus_consumed_5() + "|"
				+ in.f0.getBonus_consumed_6() + "|"
				+ in.f0.getBonus_consumed_7() + "|"
				+ in.f0.getBonus_consumed_8() + "|"
				+ in.f0.getBonus_consumed_9() + "|"
				+ in.f0.getBonus_consumed_10() + "|"
				+ in.f0.getBonus_consumed_11() + "|"
				+ in.f0.getBonus_consumed_12() + "|"
				+ in.f0.getBonus_consumed_13() + "|"
				+ in.f0.getBonus_consumed_14() + "|"
				+ in.f0.getBonus_consumed_15() + "|"
				+ in.f0.getBonus_consumed_16() + "|"
				+ in.f0.getBonus_consumed_17() + "|"
				+ in.f0.getBonus_consumed_18() + "|"
				+ in.f0.getBonus_consumed_19() + "|"
				+ in.f0.getBonus_consumed_20() + "|"
				+ in.f0.getBonus_Information_1() + "|"
				+ in.f0.getBonus_Information_2() + "|"
				+ in.f0.getBonus_Information_3() + "|"
				+ in.f0.getBonus_Information_4() + "|"
				+ in.f0.getBonus_Information_5() + "|"
				+ in.f0.getBonus_Information_6() + "|"
				+ in.f0.getBonus_Information_7() + "|"
				+ in.f0.getBonus_Information_8() + "|"
				+ in.f0.getBonus_Information_9() + "|"
				+ in.f0.getBonus_Information_10() + "|"
				+ in.f0.getNetwork_Activity_id() + "|"
				+ in.f0.getOPERATOR_NAME() + "|"
				+ in.f0.getEXTRACTION_FILE_NAME() + "|"
				+ in.f0.getROW_ID() + "|" + in.f0.getExtraction_ts();

		String aparty = in.f0.getA_Party().replace(" ", "");
		String bparty = in.f0.getB_Party().replace(" ", "");
		String accountOwner = in.f0.getAccount_OwnerBefore();
		String eventSource = in.f0.getEvent_Source().replace(" ", "");

		String subscriberID = in.f1.f1.replace(" ", "");

		OutputChg outputChg = new OutputChg();

		if (accountOwner.equals(aparty)) {
			aparty = subscriberID;
			accountOwner = subscriberID;
			eventSource = subscriberID;

		} else if (accountOwner.equals(bparty)) {
			bparty = subscriberID;
			accountOwner = subscriberID;
			eventSource = subscriberID;
		}

		outputChg.setFields(str1, aparty, str2, bparty, str3, accountOwner,
				eventSource, str4);

		return outputChg;

	}
}
