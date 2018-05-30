package model;

public class Chg {
	private String Timestamp_R;// 0
	private String T_Year;// 1
	private String T_Month;// 2
	private String T_Day;// 3
	private String T_Hour;// 4
	private String T_Mins;// 5
	private String T_Secs;// 6
	private String A_Party;// 7
	private String LocationNumberTypeA;// 8
	private String LocationNumberA;// 9
	private String B_Party;// 10
	private String LocationNumberTypeB;// 11
	private String LocationNumberB;// 12
	private String NrOfReroutings;// 13
	private String IMSI;// 14
	private String NrOfNetworkReroutings;// 15
	private String RedirectingPartyID;// 16
	private String PreCallDuration;// 17
	private String CallDuration;// 18
	private String ChargingID;// 19
	private String RoamingFlag;// 20
	private String VLR_Number;// 21
	private String Cell_ID;// 22
	private String NegotiatedQoS;// 23
	private String RequestedQoS;// 24
	private String SubscribedQoS;// 25
	private String Dialled_APN;// 26
	private String EventType;// 27
	private String providerID;// 28
	private String Currency;// 29
	private String Subscriber_status;// 30
	private String Forwarding_flag;// 31
	private String First_call_flag;// 32
	private String CAMEL_Roaming;// 33
	private String Time_zone;// 34
	private String Account_Balance;// 35
	private String Account_Delta;// 36
	private String Account_Number;// 37
	private String Account_Owner;// 38
	private String Event_Source;// 39
	private String Guiding_resource_type;// 40
	private String Rounded_duration;// 41
	private String Total_volume;// 42
	private String Rounded_total_volume;// 43
	private String Event_start_period;// 44
	private String Charge_including_free_alwnce;// 45
	private String Discount_amount;// 46
	private String Free_total_volume;// 47
	private String Free_duration;// 48
	private String Call_direction;// 49
	private String Charge_code_description;// 50
	private String Special_number_ind;// 51
	private String Bonus_Information;// 52
	private String InternalCause;// 53
	private String BasicCause;// 54
	private String Time_band;// 55
	private String Call_type;// 56
	private String Bonus_consumed;// 57
	private String VAS_code;// 58
	private String Service_filter;// 59
	private String National_calling_zone;// 60
	private String National_called_zone;// 61
	private String International_calling_zone;// 62
	private String International_called_zone;// 63
	private String Credit_indicator;// 64
	private String Event_ID;// 65
	private String Access_code;// 66
	private String Country_name;// 67
	private String CP_name;// 68
	private String Content_id;// 69
	private String Rating_Group;// 70
	private String BFT_Indicator;// 71
	private String Unapplied_amount;// 72
	private String Partition_ID;// 73
	private String RatedDateTime;// 74
	private String Area;// 75
	private String Cost_band;// 76
	private String Rating_Offer_Id;// 77
	private String Settlement_Indicator;// 78
	private String Tap_Code;// 79
	private String MCC_MNC;// 80
	private String RATINGPRICINGITEMID;// 81
	private String FileIdentifier;// 82
	private String RecordNumber;// 83
	private String FutureString1;// 84
	private String FutureString2;// 85
	private String TSel_Cost_Band;// 86
	private String IMEI;// 87
	private String LAC;// 88
	private String CI;// 89
	private String Bonus_consumed_1;// 90
	private String Bonus_consumed_2;// 91
	private String Bonus_consumed_3;// 92
	private String Bonus_consumed_4;// 93
	private String Bonus_consumed_5;// 94
	private String Bonus_consumed_6;// 95
	private String Bonus_consumed_7;// 96
	private String Bonus_consumed_8;// 97
	private String Bonus_consumed_9;// 98
	private String Bonus_consumed_10;// 99
	private String Bonus_consumed_11;// 100
	private String Bonus_consumed_12;// 101
	private String Bonus_consumed_13;// 102
	private String Bonus_consumed_14;// 103
	private String Bonus_consumed_15;// 104
	private String Bonus_consumed_16;// 105
	private String Bonus_consumed_17;// 106
	private String Bonus_consumed_18;// 107
	private String Bonus_consumed_19;// 108
	private String Bonus_consumed_20;// 109
	private String Bonus_Information_1;// 110
	private String Bonus_Information_2;// 111
	private String Bonus_Information_3;// 112
	private String Bonus_Information_4;// 113
	private String Bonus_Information_5;// 114
	private String Bonus_Information_6;// 115
	private String Bonus_Information_7;// 116
	private String Bonus_Information_8;// 117
	private String Bonus_Information_9;// 118
	private String Bonus_Information_10;// 119
	private String Network_Activity_id;// 120
	private String OPERATOR_NAME;// 121
	private String EXTRACTION_FILE_NAME;// 122
	private String ROW_ID;// 123
	private String Extraction_ts;// 124

	private String trx;// -1
	private String lacci; // -1
	private String Account_OwnerBefore; // -1

	// 0 Timestamp_R
	// 88 LAC
	// 89 CI
	// 7 A_Party
	// 36 Account_Delta
	// -1 trx

	// Event_SourceBefore
	// Event_Source

	public Chg() {
	}

	public Chg(String timestamp_R, String t_Year, String t_Month, String t_Day,
			String t_Hour, String t_Mins, String t_Secs, String a_Party,
			String locationNumberTypeA, String locationNumberA, String b_Party,
			String locationNumberTypeB, String locationNumberB,
			String nrOfReroutings, String iMSI, String nrOfNetworkReroutings,
			String redirectingPartyID, String preCallDuration,
			String callDuration, String chargingID, String roamingFlag,
			String vLR_Number, String cell_ID, String negotiatedQoS,
			String requestedQoS, String subscribedQoS, String dialled_APN,
			String eventType, String providerID, String currency,
			String subscriber_status, String forwarding_flag,
			String first_call_flag, String cAMEL_Roaming, String time_zone,
			String account_Balance, String account_Delta,
			String account_Number, String account_Owner, String event_Source,
			String guiding_resource_type, String rounded_duration,
			String total_volume, String rounded_total_volume,
			String event_start_period, String charge_including_free_alwnce,
			String discount_amount, String free_total_volume,
			String free_duration, String call_direction,
			String charge_code_description, String special_number_ind,
			String bonus_Information, String internalCause, String basicCause,
			String time_band, String call_type, String bonus_consumed,
			String vAS_code, String service_filter,
			String national_calling_zone, String national_called_zone,
			String international_calling_zone,
			String international_called_zone, String credit_indicator,
			String event_ID, String access_code, String country_name,
			String cP_name, String content_id, String rating_Group,
			String bFT_Indicator, String unapplied_amount, String partition_ID,
			String ratedDateTime, String area, String cost_band,
			String rating_Offer_Id, String settlement_Indicator,
			String tap_Code, String mCC_MNC, String rATINGPRICINGITEMID,
			String fileIdentifier, String recordNumber, String futureString1,
			String futureString2, String tSel_Cost_Band, String iMEI,
			String lAC, String cI, String bonus_consumed_1,
			String bonus_consumed_2, String bonus_consumed_3,
			String bonus_consumed_4, String bonus_consumed_5,
			String bonus_consumed_6, String bonus_consumed_7,
			String bonus_consumed_8, String bonus_consumed_9,
			String bonus_consumed_10, String bonus_consumed_11,
			String bonus_consumed_12, String bonus_consumed_13,
			String bonus_consumed_14, String bonus_consumed_15,
			String bonus_consumed_16, String bonus_consumed_17,
			String bonus_consumed_18, String bonus_consumed_19,
			String bonus_consumed_20, String bonus_Information_1,
			String bonus_Information_2, String bonus_Information_3,
			String bonus_Information_4, String bonus_Information_5,
			String bonus_Information_6, String bonus_Information_7,
			String bonus_Information_8, String bonus_Information_9,
			String bonus_Information_10, String network_Activity_id,
			String oPERATOR_NAME, String eXTRACTION_FILE_NAME, String rOW_ID,
			String extraction_ts, String account_OwnerBefore) {
		super();
		Timestamp_R = timestamp_R;
		T_Year = t_Year;
		T_Month = t_Month;
		T_Day = t_Day;
		T_Hour = t_Hour;
		T_Mins = t_Mins;
		T_Secs = t_Secs;
		A_Party = a_Party;
		LocationNumberTypeA = locationNumberTypeA;
		LocationNumberA = locationNumberA;
		B_Party = b_Party;
		LocationNumberTypeB = locationNumberTypeB;
		LocationNumberB = locationNumberB;
		NrOfReroutings = nrOfReroutings;
		IMSI = iMSI;
		NrOfNetworkReroutings = nrOfNetworkReroutings;
		RedirectingPartyID = redirectingPartyID;
		PreCallDuration = preCallDuration;
		CallDuration = callDuration;
		ChargingID = chargingID;
		RoamingFlag = roamingFlag;
		VLR_Number = vLR_Number;
		Cell_ID = cell_ID;
		NegotiatedQoS = negotiatedQoS;
		RequestedQoS = requestedQoS;
		SubscribedQoS = subscribedQoS;
		Dialled_APN = dialled_APN;
		EventType = eventType;
		this.providerID = providerID;
		Currency = currency;
		Subscriber_status = subscriber_status;
		Forwarding_flag = forwarding_flag;
		First_call_flag = first_call_flag;
		CAMEL_Roaming = cAMEL_Roaming;
		Time_zone = time_zone;
		Account_Balance = account_Balance;
		Account_Delta = account_Delta;
		Account_Number = account_Number;
		Account_Owner = account_Owner;
		Event_Source = event_Source;
		Guiding_resource_type = guiding_resource_type;
		Rounded_duration = rounded_duration;
		Total_volume = total_volume;
		Rounded_total_volume = rounded_total_volume;
		Event_start_period = event_start_period;
		Charge_including_free_alwnce = charge_including_free_alwnce;
		Discount_amount = discount_amount;
		Free_total_volume = free_total_volume;
		Free_duration = free_duration;
		Call_direction = call_direction;
		Charge_code_description = charge_code_description;
		Special_number_ind = special_number_ind;
		Bonus_Information = bonus_Information;
		InternalCause = internalCause;
		BasicCause = basicCause;
		Time_band = time_band;
		Call_type = call_type;
		Bonus_consumed = bonus_consumed;
		VAS_code = vAS_code;
		Service_filter = service_filter;
		National_calling_zone = national_calling_zone;
		National_called_zone = national_called_zone;
		International_calling_zone = international_calling_zone;
		International_called_zone = international_called_zone;
		Credit_indicator = credit_indicator;
		Event_ID = event_ID;
		Access_code = access_code;
		Country_name = country_name;
		CP_name = cP_name;
		Content_id = content_id;
		Rating_Group = rating_Group;
		BFT_Indicator = bFT_Indicator;
		Unapplied_amount = unapplied_amount;
		Partition_ID = partition_ID;
		RatedDateTime = ratedDateTime;
		Area = area;
		Cost_band = cost_band;
		Rating_Offer_Id = rating_Offer_Id;
		Settlement_Indicator = settlement_Indicator;
		Tap_Code = tap_Code;
		MCC_MNC = mCC_MNC;
		RATINGPRICINGITEMID = rATINGPRICINGITEMID;
		FileIdentifier = fileIdentifier;
		RecordNumber = recordNumber;
		FutureString1 = futureString1;
		FutureString2 = futureString2;
		TSel_Cost_Band = tSel_Cost_Band;
		IMEI = iMEI;
		LAC = lAC;
		CI = cI;
		Bonus_consumed_1 = bonus_consumed_1;
		Bonus_consumed_2 = bonus_consumed_2;
		Bonus_consumed_3 = bonus_consumed_3;
		Bonus_consumed_4 = bonus_consumed_4;
		Bonus_consumed_5 = bonus_consumed_5;
		Bonus_consumed_6 = bonus_consumed_6;
		Bonus_consumed_7 = bonus_consumed_7;
		Bonus_consumed_8 = bonus_consumed_8;
		Bonus_consumed_9 = bonus_consumed_9;
		Bonus_consumed_10 = bonus_consumed_10;
		Bonus_consumed_11 = bonus_consumed_11;
		Bonus_consumed_12 = bonus_consumed_12;
		Bonus_consumed_13 = bonus_consumed_13;
		Bonus_consumed_14 = bonus_consumed_14;
		Bonus_consumed_15 = bonus_consumed_15;
		Bonus_consumed_16 = bonus_consumed_16;
		Bonus_consumed_17 = bonus_consumed_17;
		Bonus_consumed_18 = bonus_consumed_18;
		Bonus_consumed_19 = bonus_consumed_19;
		Bonus_consumed_20 = bonus_consumed_20;
		Bonus_Information_1 = bonus_Information_1;
		Bonus_Information_2 = bonus_Information_2;
		Bonus_Information_3 = bonus_Information_3;
		Bonus_Information_4 = bonus_Information_4;
		Bonus_Information_5 = bonus_Information_5;
		Bonus_Information_6 = bonus_Information_6;
		Bonus_Information_7 = bonus_Information_7;
		Bonus_Information_8 = bonus_Information_8;
		Bonus_Information_9 = bonus_Information_9;
		Bonus_Information_10 = bonus_Information_10;
		Network_Activity_id = network_Activity_id;
		OPERATOR_NAME = oPERATOR_NAME;
		EXTRACTION_FILE_NAME = eXTRACTION_FILE_NAME;
		ROW_ID = rOW_ID;
		Extraction_ts = extraction_ts;
		Account_OwnerBefore = account_OwnerBefore;
	}

	public String getLacci() {
		return lacci;
	}

	public void setLacci(String lacci) {
		this.lacci = lacci;
	}

	public String getTimestamp_R() {
		return Timestamp_R;
	}

	public void setTimestamp_R(String timestamp_R) {
		Timestamp_R = timestamp_R;
	}

	public String getAccount_OwnerBefore() {
		return Account_OwnerBefore;
	}

	public void setAccount_OwnerBefore(String account_OwnerBefore) {
		Account_OwnerBefore = account_OwnerBefore;
	}

	public String getT_Year() {
		return T_Year;
	}

	public void setT_Year(String t_Year) {
		T_Year = t_Year;
	}

	public String getT_Month() {
		return T_Month;
	}

	public void setT_Month(String t_Month) {
		T_Month = t_Month;
	}

	public String getT_Day() {
		return T_Day;
	}

	public void setT_Day(String t_Day) {
		T_Day = t_Day;
	}

	public String getT_Hour() {
		return T_Hour;
	}

	public void setT_Hour(String t_Hour) {
		T_Hour = t_Hour;
	}

	public String getT_Mins() {
		return T_Mins;
	}

	public void setT_Mins(String t_Mins) {
		T_Mins = t_Mins;
	}

	public String getT_Secs() {
		return T_Secs;
	}

	public void setT_Secs(String t_Secs) {
		T_Secs = t_Secs;
	}

	public String getA_Party() {
		return A_Party;
	}

	public void setA_Party(String a_Party) {
		A_Party = a_Party;
	}

	public String getLocationNumberTypeA() {
		return LocationNumberTypeA;
	}

	public void setLocationNumberTypeA(String locationNumberTypeA) {
		LocationNumberTypeA = locationNumberTypeA;
	}

	public String getLocationNumberA() {
		return LocationNumberA;
	}

	public void setLocationNumberA(String locationNumberA) {
		LocationNumberA = locationNumberA;
	}

	public String getB_Party() {
		return B_Party;
	}

	public void setB_Party(String b_Party) {
		B_Party = b_Party;
	}

	public String getLocationNumberTypeB() {
		return LocationNumberTypeB;
	}

	public void setLocationNumberTypeB(String locationNumberTypeB) {
		LocationNumberTypeB = locationNumberTypeB;
	}

	public String getLocationNumberB() {
		return LocationNumberB;
	}

	public void setLocationNumberB(String locationNumberB) {
		LocationNumberB = locationNumberB;
	}

	public String getTrx() {
		return trx;
	}

	public void setTrx(String trx) {
		this.trx = trx;
	}

	public String getNrOfReroutings() {
		return NrOfReroutings;
	}

	public void setNrOfReroutings(String nrOfReroutings) {
		NrOfReroutings = nrOfReroutings;
	}

	public String getIMSI() {
		return IMSI;
	}

	public void setIMSI(String iMSI) {
		IMSI = iMSI;
	}

	public String getNrOfNetworkReroutings() {
		return NrOfNetworkReroutings;
	}

	public void setNrOfNetworkReroutings(String nrOfNetworkReroutings) {
		NrOfNetworkReroutings = nrOfNetworkReroutings;
	}

	public String getRedirectingPartyID() {
		return RedirectingPartyID;
	}

	public void setRedirectingPartyID(String redirectingPartyID) {
		RedirectingPartyID = redirectingPartyID;
	}

	public String getPreCallDuration() {
		return PreCallDuration;
	}

	public void setPreCallDuration(String preCallDuration) {
		PreCallDuration = preCallDuration;
	}

	public String getCallDuration() {
		return CallDuration;
	}

	public void setCallDuration(String callDuration) {
		CallDuration = callDuration;
	}

	public String getChargingID() {
		return ChargingID;
	}

	public void setChargingID(String chargingID) {
		ChargingID = chargingID;
	}

	public String getRoamingFlag() {
		return RoamingFlag;
	}

	public void setRoamingFlag(String roamingFlag) {
		RoamingFlag = roamingFlag;
	}

	public String getVLR_Number() {
		return VLR_Number;
	}

	public void setVLR_Number(String vLR_Number) {
		VLR_Number = vLR_Number;
	}

	public String getCell_ID() {
		return Cell_ID;
	}

	public void setCell_ID(String cell_ID) {
		Cell_ID = cell_ID;
	}

	public String getNegotiatedQoS() {
		return NegotiatedQoS;
	}

	public void setNegotiatedQoS(String negotiatedQoS) {
		NegotiatedQoS = negotiatedQoS;
	}

	public String getRequestedQoS() {
		return RequestedQoS;
	}

	public void setRequestedQoS(String requestedQoS) {
		RequestedQoS = requestedQoS;
	}

	public String getSubscribedQoS() {
		return SubscribedQoS;
	}

	public void setSubscribedQoS(String subscribedQoS) {
		SubscribedQoS = subscribedQoS;
	}

	public String getDialled_APN() {
		return Dialled_APN;
	}

	public void setDialled_APN(String dialled_APN) {
		Dialled_APN = dialled_APN;
	}

	public String getEventType() {
		return EventType;
	}

	public void setEventType(String eventType) {
		EventType = eventType;
	}

	public String getProviderID() {
		return providerID;
	}

	public void setProviderID(String providerID) {
		this.providerID = providerID;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getSubscriber_status() {
		return Subscriber_status;
	}

	public void setSubscriber_status(String subscriber_status) {
		Subscriber_status = subscriber_status;
	}

	public String getForwarding_flag() {
		return Forwarding_flag;
	}

	public void setForwarding_flag(String forwarding_flag) {
		Forwarding_flag = forwarding_flag;
	}

	public String getFirst_call_flag() {
		return First_call_flag;
	}

	public void setFirst_call_flag(String first_call_flag) {
		First_call_flag = first_call_flag;
	}

	public String getCAMEL_Roaming() {
		return CAMEL_Roaming;
	}

	public void setCAMEL_Roaming(String cAMEL_Roaming) {
		CAMEL_Roaming = cAMEL_Roaming;
	}

	public String getTime_zone() {
		return Time_zone;
	}

	public void setTime_zone(String time_zone) {
		Time_zone = time_zone;
	}

	public String getAccount_Balance() {
		return Account_Balance;
	}

	public void setAccount_Balance(String account_Balance) {
		Account_Balance = account_Balance;
	}

	public String getAccount_Delta() {
		return Account_Delta;
	}

	public void setAccount_Delta(String account_Delta) {
		Account_Delta = account_Delta;
	}

	public String getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(String account_Number) {
		Account_Number = account_Number;
	}

	public String getAccount_Owner() {
		return Account_Owner;
	}

	public void setAccount_Owner(String account_Owner) {
		Account_Owner = account_Owner;
	}

	public String getEvent_Source() {
		return Event_Source;
	}

	public void setEvent_Source(String event_Source) {
		Event_Source = event_Source;
	}

	public String getGuiding_resource_type() {
		return Guiding_resource_type;
	}

	public void setGuiding_resource_type(String guiding_resource_type) {
		Guiding_resource_type = guiding_resource_type;
	}

	public String getRounded_duration() {
		return Rounded_duration;
	}

	public void setRounded_duration(String rounded_duration) {
		Rounded_duration = rounded_duration;
	}

	public String getTotal_volume() {
		return Total_volume;
	}

	public void setTotal_volume(String total_volume) {
		Total_volume = total_volume;
	}

	public String getRounded_total_volume() {
		return Rounded_total_volume;
	}

	public void setRounded_total_volume(String rounded_total_volume) {
		Rounded_total_volume = rounded_total_volume;
	}

	public String getEvent_start_period() {
		return Event_start_period;
	}

	public void setEvent_start_period(String event_start_period) {
		Event_start_period = event_start_period;
	}

	public String getCharge_including_free_alwnce() {
		return Charge_including_free_alwnce;
	}

	public void setCharge_including_free_alwnce(
			String charge_including_free_alwnce) {
		Charge_including_free_alwnce = charge_including_free_alwnce;
	}

	public String getDiscount_amount() {
		return Discount_amount;
	}

	public void setDiscount_amount(String discount_amount) {
		Discount_amount = discount_amount;
	}

	public String getFree_total_volume() {
		return Free_total_volume;
	}

	public void setFree_total_volume(String free_total_volume) {
		Free_total_volume = free_total_volume;
	}

	public String getFree_duration() {
		return Free_duration;
	}

	public void setFree_duration(String free_duration) {
		Free_duration = free_duration;
	}

	public String getCall_direction() {
		return Call_direction;
	}

	public void setCall_direction(String call_direction) {
		Call_direction = call_direction;
	}

	public String getCharge_code_description() {
		return Charge_code_description;
	}

	public void setCharge_code_description(String charge_code_description) {
		Charge_code_description = charge_code_description;
	}

	public String getSpecial_number_ind() {
		return Special_number_ind;
	}

	public void setSpecial_number_ind(String special_number_ind) {
		Special_number_ind = special_number_ind;
	}

	public String getBonus_Information() {
		return Bonus_Information;
	}

	public void setBonus_Information(String bonus_Information) {
		Bonus_Information = bonus_Information;
	}

	public String getInternalCause() {
		return InternalCause;
	}

	public void setInternalCause(String internalCause) {
		InternalCause = internalCause;
	}

	public String getBasicCause() {
		return BasicCause;
	}

	public void setBasicCause(String basicCause) {
		BasicCause = basicCause;
	}

	public String getTime_band() {
		return Time_band;
	}

	public void setTime_band(String time_band) {
		Time_band = time_band;
	}

	public String getCall_type() {
		return Call_type;
	}

	public void setCall_type(String call_type) {
		Call_type = call_type;
	}

	public String getBonus_consumed() {
		return Bonus_consumed;
	}

	public void setBonus_consumed(String bonus_consumed) {
		Bonus_consumed = bonus_consumed;
	}

	public String getVAS_code() {
		return VAS_code;
	}

	public void setVAS_code(String vAS_code) {
		VAS_code = vAS_code;
	}

	public String getService_filter() {
		return Service_filter;
	}

	public void setService_filter(String service_filter) {
		Service_filter = service_filter;
	}

	public String getNational_calling_zone() {
		return National_calling_zone;
	}

	public void setNational_calling_zone(String national_calling_zone) {
		National_calling_zone = national_calling_zone;
	}

	public String getNational_called_zone() {
		return National_called_zone;
	}

	public void setNational_called_zone(String national_called_zone) {
		National_called_zone = national_called_zone;
	}

	public String getInternational_calling_zone() {
		return International_calling_zone;
	}

	public void setInternational_calling_zone(String international_calling_zone) {
		International_calling_zone = international_calling_zone;
	}

	public String getInternational_called_zone() {
		return International_called_zone;
	}

	public void setInternational_called_zone(String international_called_zone) {
		International_called_zone = international_called_zone;
	}

	public String getCredit_indicator() {
		return Credit_indicator;
	}

	public void setCredit_indicator(String credit_indicator) {
		Credit_indicator = credit_indicator;
	}

	public String getEvent_ID() {
		return Event_ID;
	}

	public void setEvent_ID(String event_ID) {
		Event_ID = event_ID;
	}

	public String getAccess_code() {
		return Access_code;
	}

	public void setAccess_code(String access_code) {
		Access_code = access_code;
	}

	public String getCountry_name() {
		return Country_name;
	}

	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}

	public String getCP_name() {
		return CP_name;
	}

	public void setCP_name(String cP_name) {
		CP_name = cP_name;
	}

	public String getContent_id() {
		return Content_id;
	}

	public void setContent_id(String content_id) {
		Content_id = content_id;
	}

	public String getRating_Group() {
		return Rating_Group;
	}

	public void setRating_Group(String rating_Group) {
		Rating_Group = rating_Group;
	}

	public String getBFT_Indicator() {
		return BFT_Indicator;
	}

	public void setBFT_Indicator(String bFT_Indicator) {
		BFT_Indicator = bFT_Indicator;
	}

	public String getUnapplied_amount() {
		return Unapplied_amount;
	}

	public void setUnapplied_amount(String unapplied_amount) {
		Unapplied_amount = unapplied_amount;
	}

	public String getPartition_ID() {
		return Partition_ID;
	}

	public void setPartition_ID(String partition_ID) {
		Partition_ID = partition_ID;
	}

	public String getRatedDateTime() {
		return RatedDateTime;
	}

	public void setRatedDateTime(String ratedDateTime) {
		RatedDateTime = ratedDateTime;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCost_band() {
		return Cost_band;
	}

	public void setCost_band(String cost_band) {
		Cost_band = cost_band;
	}

	public String getRating_Offer_Id() {
		return Rating_Offer_Id;
	}

	public void setRating_Offer_Id(String rating_Offer_Id) {
		Rating_Offer_Id = rating_Offer_Id;
	}

	public String getSettlement_Indicator() {
		return Settlement_Indicator;
	}

	public void setSettlement_Indicator(String settlement_Indicator) {
		Settlement_Indicator = settlement_Indicator;
	}

	public String getTap_Code() {
		return Tap_Code;
	}

	public void setTap_Code(String tap_Code) {
		Tap_Code = tap_Code;
	}

	public String getMCC_MNC() {
		return MCC_MNC;
	}

	public void setMCC_MNC(String mCC_MNC) {
		MCC_MNC = mCC_MNC;
	}

	public String getRATINGPRICINGITEMID() {
		return RATINGPRICINGITEMID;
	}

	public void setRATINGPRICINGITEMID(String rATINGPRICINGITEMID) {
		RATINGPRICINGITEMID = rATINGPRICINGITEMID;
	}

	public String getFileIdentifier() {
		return FileIdentifier;
	}

	public void setFileIdentifier(String fileIdentifier) {
		FileIdentifier = fileIdentifier;
	}

	public String getRecordNumber() {
		return RecordNumber;
	}

	public void setRecordNumber(String recordNumber) {
		RecordNumber = recordNumber;
	}

	public String getFutureString1() {
		return FutureString1;
	}

	public void setFutureString1(String futureString1) {
		FutureString1 = futureString1;
	}

	public String getFutureString2() {
		return FutureString2;
	}

	public void setFutureString2(String futureString2) {
		FutureString2 = futureString2;
	}

	public String getTSel_Cost_Band() {
		return TSel_Cost_Band;
	}

	public void setTSel_Cost_Band(String tSel_Cost_Band) {
		TSel_Cost_Band = tSel_Cost_Band;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public String getLAC() {
		return LAC;
	}

	public void setLAC(String lAC) {
		LAC = lAC;
	}

	public String getCI() {
		return CI;
	}

	public void setCI(String cI) {
		CI = cI;
	}

	public String getBonus_consumed_1() {
		return Bonus_consumed_1;
	}

	public void setBonus_consumed_1(String bonus_consumed_1) {
		Bonus_consumed_1 = bonus_consumed_1;
	}

	public String getBonus_consumed_2() {
		return Bonus_consumed_2;
	}

	public void setBonus_consumed_2(String bonus_consumed_2) {
		Bonus_consumed_2 = bonus_consumed_2;
	}

	public String getBonus_consumed_3() {
		return Bonus_consumed_3;
	}

	public void setBonus_consumed_3(String bonus_consumed_3) {
		Bonus_consumed_3 = bonus_consumed_3;
	}

	public String getBonus_consumed_4() {
		return Bonus_consumed_4;
	}

	public void setBonus_consumed_4(String bonus_consumed_4) {
		Bonus_consumed_4 = bonus_consumed_4;
	}

	public String getBonus_consumed_5() {
		return Bonus_consumed_5;
	}

	public void setBonus_consumed_5(String bonus_consumed_5) {
		Bonus_consumed_5 = bonus_consumed_5;
	}

	public String getBonus_consumed_6() {
		return Bonus_consumed_6;
	}

	public void setBonus_consumed_6(String bonus_consumed_6) {
		Bonus_consumed_6 = bonus_consumed_6;
	}

	public String getBonus_consumed_7() {
		return Bonus_consumed_7;
	}

	public void setBonus_consumed_7(String bonus_consumed_7) {
		Bonus_consumed_7 = bonus_consumed_7;
	}

	public String getBonus_consumed_8() {
		return Bonus_consumed_8;
	}

	public void setBonus_consumed_8(String bonus_consumed_8) {
		Bonus_consumed_8 = bonus_consumed_8;
	}

	public String getBonus_consumed_9() {
		return Bonus_consumed_9;
	}

	public void setBonus_consumed_9(String bonus_consumed_9) {
		Bonus_consumed_9 = bonus_consumed_9;
	}

	public String getBonus_consumed_10() {
		return Bonus_consumed_10;
	}

	public void setBonus_consumed_10(String bonus_consumed_10) {
		Bonus_consumed_10 = bonus_consumed_10;
	}

	public String getBonus_consumed_11() {
		return Bonus_consumed_11;
	}

	public void setBonus_consumed_11(String bonus_consumed_11) {
		Bonus_consumed_11 = bonus_consumed_11;
	}

	public String getBonus_consumed_12() {
		return Bonus_consumed_12;
	}

	public void setBonus_consumed_12(String bonus_consumed_12) {
		Bonus_consumed_12 = bonus_consumed_12;
	}

	public String getBonus_consumed_13() {
		return Bonus_consumed_13;
	}

	public void setBonus_consumed_13(String bonus_consumed_13) {
		Bonus_consumed_13 = bonus_consumed_13;
	}

	public String getBonus_consumed_14() {
		return Bonus_consumed_14;
	}

	public void setBonus_consumed_14(String bonus_consumed_14) {
		Bonus_consumed_14 = bonus_consumed_14;
	}

	public String getBonus_consumed_15() {
		return Bonus_consumed_15;
	}

	public void setBonus_consumed_15(String bonus_consumed_15) {
		Bonus_consumed_15 = bonus_consumed_15;
	}

	public String getBonus_consumed_16() {
		return Bonus_consumed_16;
	}

	public void setBonus_consumed_16(String bonus_consumed_16) {
		Bonus_consumed_16 = bonus_consumed_16;
	}

	public String getBonus_consumed_17() {
		return Bonus_consumed_17;
	}

	public void setBonus_consumed_17(String bonus_consumed_17) {
		Bonus_consumed_17 = bonus_consumed_17;
	}

	public String getBonus_consumed_18() {
		return Bonus_consumed_18;
	}

	public void setBonus_consumed_18(String bonus_consumed_18) {
		Bonus_consumed_18 = bonus_consumed_18;
	}

	public String getBonus_consumed_19() {
		return Bonus_consumed_19;
	}

	public void setBonus_consumed_19(String bonus_consumed_19) {
		Bonus_consumed_19 = bonus_consumed_19;
	}

	public String getBonus_consumed_20() {
		return Bonus_consumed_20;
	}

	public void setBonus_consumed_20(String bonus_consumed_20) {
		Bonus_consumed_20 = bonus_consumed_20;
	}

	public String getBonus_Information_1() {
		return Bonus_Information_1;
	}

	public void setBonus_Information_1(String bonus_Information_1) {
		Bonus_Information_1 = bonus_Information_1;
	}

	public String getBonus_Information_2() {
		return Bonus_Information_2;
	}

	public void setBonus_Information_2(String bonus_Information_2) {
		Bonus_Information_2 = bonus_Information_2;
	}

	public String getBonus_Information_3() {
		return Bonus_Information_3;
	}

	public void setBonus_Information_3(String bonus_Information_3) {
		Bonus_Information_3 = bonus_Information_3;
	}

	public String getBonus_Information_4() {
		return Bonus_Information_4;
	}

	public void setBonus_Information_4(String bonus_Information_4) {
		Bonus_Information_4 = bonus_Information_4;
	}

	public String getBonus_Information_5() {
		return Bonus_Information_5;
	}

	public void setBonus_Information_5(String bonus_Information_5) {
		Bonus_Information_5 = bonus_Information_5;
	}

	public String getBonus_Information_6() {
		return Bonus_Information_6;
	}

	public void setBonus_Information_6(String bonus_Information_6) {
		Bonus_Information_6 = bonus_Information_6;
	}

	public String getBonus_Information_7() {
		return Bonus_Information_7;
	}

	public void setBonus_Information_7(String bonus_Information_7) {
		Bonus_Information_7 = bonus_Information_7;
	}

	public String getBonus_Information_8() {
		return Bonus_Information_8;
	}

	public void setBonus_Information_8(String bonus_Information_8) {
		Bonus_Information_8 = bonus_Information_8;
	}

	public String getBonus_Information_9() {
		return Bonus_Information_9;
	}

	public void setBonus_Information_9(String bonus_Information_9) {
		Bonus_Information_9 = bonus_Information_9;
	}

	public String getBonus_Information_10() {
		return Bonus_Information_10;
	}

	public void setBonus_Information_10(String bonus_Information_10) {
		Bonus_Information_10 = bonus_Information_10;
	}

	public String getNetwork_Activity_id() {
		return Network_Activity_id;
	}

	public void setNetwork_Activity_id(String network_Activity_id) {
		Network_Activity_id = network_Activity_id;
	}

	public String getOPERATOR_NAME() {
		return OPERATOR_NAME;
	}

	public void setOPERATOR_NAME(String oPERATOR_NAME) {
		OPERATOR_NAME = oPERATOR_NAME;
	}

	public String getEXTRACTION_FILE_NAME() {
		return EXTRACTION_FILE_NAME;
	}

	public void setEXTRACTION_FILE_NAME(String eXTRACTION_FILE_NAME) {
		EXTRACTION_FILE_NAME = eXTRACTION_FILE_NAME;
	}

	public String getROW_ID() {
		return ROW_ID;
	}

	public void setROW_ID(String rOW_ID) {
		ROW_ID = rOW_ID;
	}

	public String getExtraction_ts() {
		return Extraction_ts;
	}

	public void setExtraction_ts(String extraction_ts) {
		Extraction_ts = extraction_ts;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTimestamp_R() + "|" + getLacci() + "|" + getA_Party() + "|"
				+ getAccount_Delta() + "|" + getTrx();
	}

}
