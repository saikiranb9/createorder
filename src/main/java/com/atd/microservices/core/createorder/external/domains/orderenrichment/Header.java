package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.deserializer.JsonDateTimeDeserializer;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.Attribute;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.CustomerShipTo;
import com.atd.microservices.core.createorder.external.domains.serializer.JsonDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.ZonedDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;
import javax.annotation.Generated;

/**
 * Header
 */

public class Header {

	/**
	 * Gets or Sets actioncode
	 */
	public enum ActioncodeEnum {
		BOOKED("BOOKED"),

		ENTERED("ENTERED"),

		UPDATE("UPDATE"),

		CANCEL("CANCEL");

		private String value;

		ActioncodeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ActioncodeEnum fromValue(String value) {
			for (ActioncodeEnum b : ActioncodeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	@JsonProperty("actioncode")
	private ActioncodeEnum actioncode;

	@JsonProperty("affiliateid")
	private String affiliateid;

	@JsonProperty("attribute")
	@Valid
	private List<Attribute> attribute = null;

	@JsonProperty("bookedflag")
	private String bookedflag;

	@JsonProperty("cancelledflag")
	private String cancelledflag;

	@JsonProperty("changereason")
	private String changereason;

	@JsonProperty("consumeraddress1")
	private String consumeraddress1;

	@JsonProperty("consumeraddress2")
	private String consumeraddress2;

	@JsonProperty("consumerbtaddress1")
	private String consumerbtaddress1;

	@JsonProperty("consumerbtaddress2")
	private String consumerbtaddress2;

	@JsonProperty("consumerbtcity")
	private String consumerbtcity;

	@JsonProperty("consumerbtcontactname")
	private String consumerbtcontactname;

	@JsonProperty("consumerbtcontactnumber")
	private String consumerbtcontactnumber;

	@JsonProperty("consumerbtcountry")
	private String consumerbtcountry;

	@JsonProperty("consumerbtemail")
	private String consumerbtemail;

	@JsonProperty("consumerbtname")
	private String consumerbtname;

	@JsonProperty("consumerbtstate")
	private String consumerbtstate;

	@JsonProperty("consumerbtstore")
	private String consumerbtstore;

	@JsonProperty("consumerbtzip")
	private String consumerbtzip;

	@JsonProperty("consumercity")
	private String consumercity;

	@JsonProperty("consumercountry")
	private String consumercountry;

	@JsonProperty("consumername")
	private String consumername;

	@JsonProperty("consumerorderflag")
	private String consumerorderflag;

	@JsonProperty("consumerstate")
	private String consumerstate;

	@JsonProperty("consumerzip")
	private String consumerzip;

	@JsonProperty("context")
	private String context;

	@JsonProperty("couponcode")
	private String couponcode;

	@JsonProperty("createdby")
	private Long createdby;

	@JsonProperty("creationdate")
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	private ZonedDateTime creationdate;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("customerordernumber")
	private String customerordernumber;

	@JsonProperty("customershippingmethod")
	private String customershippingmethod;

	@JsonProperty("customershipto")
	private CustomerShipTo customershipto;

	@JsonProperty("customersignature")
	private String customersignature;

	@JsonProperty("custordernumber")
	private String custordernumber;

	@JsonProperty("custponumber")
	private String custponumber;

	/**
	 * Gets or Sets defaultfulfillmentset
	 */
	public enum DefaultfulfillmentsetEnum {
		Y("Y"),

		N("N");

		private String value;

		DefaultfulfillmentsetEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static DefaultfulfillmentsetEnum fromValue(String value) {
			for (DefaultfulfillmentsetEnum b : DefaultfulfillmentsetEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	@JsonProperty("defaultfulfillmentset")
	private DefaultfulfillmentsetEnum defaultfulfillmentset;

	@JsonProperty("deliverto")
	private String deliverto;

	@JsonProperty("delivertoorgid")
	private Long delivertoorgid;

	@JsonProperty("deliverycommissioncode")
	private String deliverycommissioncode;

	@JsonProperty("drnumber")
	private String drnumber;

	@JsonProperty("flowstatuscode")
	private String flowstatuscode;

	@JsonProperty("fobpointcode")
	private String fobpointcode;

	@JsonProperty("fobpointmeaning")
	private String fobpointmeaning;

	@JsonProperty("freightcarriercode")
	private String freightcarriercode;

	@JsonProperty("freightcarriermeaning")
	private String freightcarriermeaning;

	@JsonProperty("freighttermscode")
	private String freighttermscode;

	@JsonProperty("freighttermsmeaning")
	private String freighttermsmeaning;

	@JsonProperty("fulfillmentmethod")
	private String fulfillmentmethod;

	@JsonProperty("globalattributes")
	@Valid
	private List<Attribute> globalattributes = null;

	@JsonProperty("headerid")
	private Long headerid;

	/**
	 * Gets or Sets holdnamedff
	 */
	public enum HoldnamedffEnum {
		ECL("ECL"),

		ETA("ETA"),

		OPH("OPH"),

		PVH("PVH"),

		MOH("MOH"),

		FAKH("FAKH"),

		POH("POH"),

		ETR("ETR"),

		APH("APH"),

		FOKH("FOKH"),

		BFH("BFH"),

		HLB("HLB"),

		HLC("HLC"),

		OLH("OLH"),

		NPC("NPC"),

		CCF("CCF"),

		CAH("CAH"),

		AEH("AEH"),

		BOH("BOH");

		private String value;

		HoldnamedffEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static HoldnamedffEnum fromValue(String value) {
			for (HoldnamedffEnum b : HoldnamedffEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	@JsonProperty("holdnamedff")
	private HoldnamedffEnum holdnamedff;

	@JsonProperty("inboundplanningflag")
	private String inboundplanningflag;

	@JsonProperty("invoiceto")
	private String invoiceto;

	@JsonProperty("invoicetoorgid")
	private Long invoicetoorgid;

	@JsonProperty("lastupdatedate")
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	private ZonedDateTime lastupdatedate;

	@JsonProperty("lastupdatedby")
	private Long lastupdatedby;

	@JsonProperty("legacycustdata")
	private String legacycustdata;

	@JsonProperty("linesetname")
	private String linesetname;

	@JsonProperty("marketingassistfee")
	private Long marketingassistfee;

	@JsonProperty("naprogramnumber")
	private String naprogramnumber;

	@JsonProperty("openflag")
	private String openflag;

	/**
	 * Gets or Sets ordercategorycode
	 */
	public enum OrdercategorycodeEnum {
		ORDER("ORDER"),

		RETURN("RETURN"),

		MIXED("MIXED");

		private String value;

		OrdercategorycodeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static OrdercategorycodeEnum fromValue(String value) {
			for (OrdercategorycodeEnum b : OrdercategorycodeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	@JsonProperty("ordercategorycode")
	private OrdercategorycodeEnum ordercategorycode;

	@JsonProperty("ordereddate")
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	private ZonedDateTime ordereddate;

	@JsonProperty("ordernumber")
	private Long ordernumber;

	@JsonProperty("ordersourceid")
	private Long ordersourceid;

	@JsonProperty("ordersourcemeaning")
	private String ordersourcemeaning;

	/**
	 * Gets or Sets ordertypecode
	 */
	public enum OrdertypecodeEnum {
		BILL_ONLY("BILL_ONLY"),

		BOOKING_ORDER("BOOKING_ORDER"),

		BOOK_DC_DIRECT_SHIP("BOOK_DC_DIRECT_SHIP"),

		CREDIT_ONLY("CREDIT_ONLY"),

		DC_DIRECT_SHIP("DC_DIRECT_SHIP"),

		DEFECTIVE_RTV_SALES("DEFECTIVE_RTV_SALES"),

		DO_NOT_USE("DO_NOT_USE"),

		FUEL_SURCHARGE("FUEL_SURCHARGE"),

		GENERIC_SALES("GENERIC_SALES"),

		GOVT_WASH_BILL("GOVT_WASH_BILL"),

		GOVT_WASH_CREDIT("GOVT_WASH_CREDIT"),

		INTERNAL_SALES("INTERNAL_SALES"),

		NA_INDIRECT_BILL_ONLY("NA_INDIRECT_BILL_ONLY"),

		NA_INDIRECT_CREDIT_ONLY("NA_INDIRECT_CREDIT_ONLY"),

		PRICE_CORR_BILL_ONLY("PRICE_CORR_BILL_ONLY"),

		PRICE_CORR_CREDIT_ONLY("PRICE_CORR_CREDIT_ONLY"),

		RECEIPT_ONLY("RECEIPT_ONLY"),

		RESTOCKING_FEE("RESTOCKING_FEE"),

		REPLENISHMENT_SALES("REPLENISHMENT_SALES"),

		RETURNS("RETURNS"),

		INSTALLER_SALES("INSTALLER_SALES"),

		RTC("RTC"),

		SHIP_ONLY("SHIP_ONLY"),

		SHIP_TO_HOME("SHIP_TO_HOME"),

		STH_MB_SALE("STH_MB_SALE"),

		STH_VENDOR_DIRECT_SHIP("STH_VENDOR_DIRECT_SHIP"),

		VENDOR_DIRECT_SHIP("VENDOR_DIRECT_SHIP"),

		WARRANTY_RMA_PICKUP("WARRANTY_RMA_PICKUP"),

		WATERFALL_BILL_ONLY("WATERFALL_BILL_ONLY"),

		WATERFALL_CREDIT_ONLY("WATERFALL_CREDIT_ONLY"),

		THREE_PL_SALES("THREE_PL_SALES");

		private String value;

		OrdertypecodeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static OrdertypecodeEnum fromValue(String value) {
			for (OrdertypecodeEnum b : OrdertypecodeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	@JsonProperty("ordertypecode")
	private OrdertypecodeEnum ordertypecode;

	@JsonProperty("ordertypeid")
	private Long ordertypeid;

	@JsonProperty("ordertypemeaning")
	private String ordertypemeaning;

	@JsonProperty("orgid")
	private Long orgid;

	@JsonProperty("origsysdocumentref")
	private String origsysdocumentref;

	@JsonProperty("outboundplanningflag")
	private String outboundplanningflag;

	@JsonProperty("packinginstructions")
	private String packinginstructions;

	@JsonProperty("paymenttermid")
	private Long paymenttermid;

	@JsonProperty("paymenttermmeaning")
	private String paymenttermmeaning;

	@JsonProperty("paymenttypecode")
	private String paymenttypecode;

	@JsonProperty("paymenttypemeaning")
	private String paymenttypemeaning;

	@JsonProperty("podate")
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	private ZonedDateTime podate;

	@JsonProperty("pricelistid")
	private Long pricelistid;

	@JsonProperty("pricelistname")
	private String pricelistname;

	@JsonProperty("processeddate")
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	private ZonedDateTime processeddate;

	@JsonProperty("processedmessage")
	private String processedmessage;

	@JsonProperty("processflag")
	private String processflag;

	@JsonProperty("quickreturnflag")
	private String quickreturnflag;

	@JsonProperty("saleschannelcode")
	private String saleschannelcode;

	@JsonProperty("saleschannelmeaning")
	private String saleschannelmeaning;

	@JsonProperty("salesperson")
	private String salesperson;

	@JsonProperty("salesrepid")
	private Long salesrepid;

	@JsonProperty("shipfrom")
	private String shipfrom;

	@JsonProperty("shipfromorgid")
	private Long shipfromorgid;

	/**
	 * Gets or Sets shipmentprioritycode
	 */
	public enum ShipmentprioritycodeEnum {
		HIGH("High"),

		STANDARD("Standard");

		private String value;

		ShipmentprioritycodeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ShipmentprioritycodeEnum fromValue(String value) {
			for (ShipmentprioritycodeEnum b : ShipmentprioritycodeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	@JsonProperty("shipmentprioritycode")
	private ShipmentprioritycodeEnum shipmentprioritycode;

	@JsonProperty("shipmentprioritymeaning")
	private String shipmentprioritymeaning;

	@JsonProperty("shippinginstructions")
	private String shippinginstructions;

	@JsonProperty("shippingmethodcode")
	private String shippingmethodcode;

	@JsonProperty("shippingmethodmeaning")
	private String shippingmethodmeaning;

	@JsonProperty("shipto")
	private String shipto;

	@JsonProperty("shiptoorgid")
	private Long shiptoorgid;

	@JsonProperty("soldfrom")
	private String soldfrom;

	@JsonProperty("soldfromorgid")
	private Long soldfromorgid;

	@JsonProperty("soldto")
	private String soldto;

	@JsonProperty("soldtoorgid")
	private Long soldtoorgid;

	@JsonProperty("tcnumber")
	private String tcnumber;

	@JsonProperty("tpattributes")
	@Valid
	private List<Attribute> tpattributes = null;

	@JsonProperty("transactionalcurrcode")
	private String transactionalcurrcode;

	public Header actioncode(ActioncodeEnum actioncode) {
		this.actioncode = actioncode;
		return this;
	}

	/**
	 * Get actioncode
	 * 
	 * @return actioncode
	 */

	@Schema(name = "actioncode", required = false)
	public ActioncodeEnum getActioncode() {
		return actioncode;
	}

	public void setActioncode(ActioncodeEnum actioncode) {
		this.actioncode = actioncode;
	}

	public Header affiliateid(String affiliateid) {
		this.affiliateid = affiliateid;
		return this;
	}

	/**
	 * Get affiliateid
	 * 
	 * @return affiliateid
	 */

	@Schema(name = "affiliateid", required = false)
	public String getAffiliateid() {
		return affiliateid;
	}

	public void setAffiliateid(String affiliateid) {
		this.affiliateid = affiliateid;
	}

	public Header attribute(List<Attribute> attribute) {
		this.attribute = attribute;
		return this;
	}

	public Header addAttributeItem(Attribute attributeItem) {
		if (this.attribute == null) {
			this.attribute = new ArrayList<>();
		}
		this.attribute.add(attributeItem);
		return this;
	}

	/**
	 * Get attribute
	 * 
	 * @return attribute
	 */
	@Valid
	@Schema(name = "attribute", required = false)
	public List<Attribute> getAttribute() {
		return attribute;
	}

	public void setAttribute(List<Attribute> attribute) {
		this.attribute = attribute;
	}

	public Header bookedflag(String bookedflag) {
		this.bookedflag = bookedflag;
		return this;
	}

	/**
	 * Get bookedflag
	 * 
	 * @return bookedflag
	 */

	@Schema(name = "bookedflag", required = false)
	public String getBookedflag() {
		return bookedflag;
	}

	public void setBookedflag(String bookedflag) {
		this.bookedflag = bookedflag;
	}

	public Header cancelledflag(String cancelledflag) {
		this.cancelledflag = cancelledflag;
		return this;
	}

	/**
	 * Get cancelledflag
	 * 
	 * @return cancelledflag
	 */

	@Schema(name = "cancelledflag", required = false)
	public String getCancelledflag() {
		return cancelledflag;
	}

	public void setCancelledflag(String cancelledflag) {
		this.cancelledflag = cancelledflag;
	}

	public Header changereason(String changereason) {
		this.changereason = changereason;
		return this;
	}

	/**
	 * Get changereason
	 * 
	 * @return changereason
	 */

	@Schema(name = "changereason", required = false)
	public String getChangereason() {
		return changereason;
	}

	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}

	public Header consumeraddress1(String consumeraddress1) {
		this.consumeraddress1 = consumeraddress1;
		return this;
	}

	/**
	 * Get consumeraddress1
	 * 
	 * @return consumeraddress1
	 */

	@Schema(name = "consumeraddress1", required = false)
	public String getConsumeraddress1() {
		return consumeraddress1;
	}

	public void setConsumeraddress1(String consumeraddress1) {
		this.consumeraddress1 = consumeraddress1;
	}

	public Header consumeraddress2(String consumeraddress2) {
		this.consumeraddress2 = consumeraddress2;
		return this;
	}

	/**
	 * Get consumeraddress2
	 * 
	 * @return consumeraddress2
	 */

	@Schema(name = "consumeraddress2", required = false)
	public String getConsumeraddress2() {
		return consumeraddress2;
	}

	public void setConsumeraddress2(String consumeraddress2) {
		this.consumeraddress2 = consumeraddress2;
	}

	public Header consumerbtaddress1(String consumerbtaddress1) {
		this.consumerbtaddress1 = consumerbtaddress1;
		return this;
	}

	/**
	 * Get consumerbtaddress1
	 * 
	 * @return consumerbtaddress1
	 */

	@Schema(name = "consumerbtaddress1", required = false)
	public String getConsumerbtaddress1() {
		return consumerbtaddress1;
	}

	public void setConsumerbtaddress1(String consumerbtaddress1) {
		this.consumerbtaddress1 = consumerbtaddress1;
	}

	public Header consumerbtaddress2(String consumerbtaddress2) {
		this.consumerbtaddress2 = consumerbtaddress2;
		return this;
	}

	/**
	 * Get consumerbtaddress2
	 * 
	 * @return consumerbtaddress2
	 */

	@Schema(name = "consumerbtaddress2", required = false)
	public String getConsumerbtaddress2() {
		return consumerbtaddress2;
	}

	public void setConsumerbtaddress2(String consumerbtaddress2) {
		this.consumerbtaddress2 = consumerbtaddress2;
	}

	public Header consumerbtcity(String consumerbtcity) {
		this.consumerbtcity = consumerbtcity;
		return this;
	}

	/**
	 * Get consumerbtcity
	 * 
	 * @return consumerbtcity
	 */

	@Schema(name = "consumerbtcity", required = false)
	public String getConsumerbtcity() {
		return consumerbtcity;
	}

	public void setConsumerbtcity(String consumerbtcity) {
		this.consumerbtcity = consumerbtcity;
	}

	public Header consumerbtcontactname(String consumerbtcontactname) {
		this.consumerbtcontactname = consumerbtcontactname;
		return this;
	}

	/**
	 * Get consumerbtcontactname
	 * 
	 * @return consumerbtcontactname
	 */

	@Schema(name = "consumerbtcontactname", required = false)
	public String getConsumerbtcontactname() {
		return consumerbtcontactname;
	}

	public void setConsumerbtcontactname(String consumerbtcontactname) {
		this.consumerbtcontactname = consumerbtcontactname;
	}

	public Header consumerbtcontactnumber(String consumerbtcontactnumber) {
		this.consumerbtcontactnumber = consumerbtcontactnumber;
		return this;
	}

	/**
	 * Get consumerbtcontactnumber
	 * 
	 * @return consumerbtcontactnumber
	 */

	@Schema(name = "consumerbtcontactnumber", required = false)
	public String getConsumerbtcontactnumber() {
		return consumerbtcontactnumber;
	}

	public void setConsumerbtcontactnumber(String consumerbtcontactnumber) {
		this.consumerbtcontactnumber = consumerbtcontactnumber;
	}

	public Header consumerbtcountry(String consumerbtcountry) {
		this.consumerbtcountry = consumerbtcountry;
		return this;
	}

	/**
	 * Get consumerbtcountry
	 * 
	 * @return consumerbtcountry
	 */

	@Schema(name = "consumerbtcountry", required = false)
	public String getConsumerbtcountry() {
		return consumerbtcountry;
	}

	public void setConsumerbtcountry(String consumerbtcountry) {
		this.consumerbtcountry = consumerbtcountry;
	}

	public Header consumerbtemail(String consumerbtemail) {
		this.consumerbtemail = consumerbtemail;
		return this;
	}

	/**
	 * Get consumerbtemail
	 * 
	 * @return consumerbtemail
	 */

	@Schema(name = "consumerbtemail", required = false)
	public String getConsumerbtemail() {
		return consumerbtemail;
	}

	public void setConsumerbtemail(String consumerbtemail) {
		this.consumerbtemail = consumerbtemail;
	}

	public Header consumerbtname(String consumerbtname) {
		this.consumerbtname = consumerbtname;
		return this;
	}

	/**
	 * Get consumerbtname
	 * 
	 * @return consumerbtname
	 */

	@Schema(name = "consumerbtname", required = false)
	public String getConsumerbtname() {
		return consumerbtname;
	}

	public void setConsumerbtname(String consumerbtname) {
		this.consumerbtname = consumerbtname;
	}

	public Header consumerbtstate(String consumerbtstate) {
		this.consumerbtstate = consumerbtstate;
		return this;
	}

	/**
	 * Get consumerbtstate
	 * 
	 * @return consumerbtstate
	 */

	@Schema(name = "consumerbtstate", required = false)
	public String getConsumerbtstate() {
		return consumerbtstate;
	}

	public void setConsumerbtstate(String consumerbtstate) {
		this.consumerbtstate = consumerbtstate;
	}

	public Header consumerbtstore(String consumerbtstore) {
		this.consumerbtstore = consumerbtstore;
		return this;
	}

	/**
	 * Get consumerbtstore
	 * 
	 * @return consumerbtstore
	 */

	@Schema(name = "consumerbtstore", required = false)
	public String getConsumerbtstore() {
		return consumerbtstore;
	}

	public void setConsumerbtstore(String consumerbtstore) {
		this.consumerbtstore = consumerbtstore;
	}

	public Header consumerbtzip(String consumerbtzip) {
		this.consumerbtzip = consumerbtzip;
		return this;
	}

	/**
	 * Get consumerbtzip
	 * 
	 * @return consumerbtzip
	 */

	@Schema(name = "consumerbtzip", required = false)
	public String getConsumerbtzip() {
		return consumerbtzip;
	}

	public void setConsumerbtzip(String consumerbtzip) {
		this.consumerbtzip = consumerbtzip;
	}

	public Header consumercity(String consumercity) {
		this.consumercity = consumercity;
		return this;
	}

	/**
	 * Get consumercity
	 * 
	 * @return consumercity
	 */

	@Schema(name = "consumercity", required = false)
	public String getConsumercity() {
		return consumercity;
	}

	public void setConsumercity(String consumercity) {
		this.consumercity = consumercity;
	}

	public Header consumercountry(String consumercountry) {
		this.consumercountry = consumercountry;
		return this;
	}

	/**
	 * Get consumercountry
	 * 
	 * @return consumercountry
	 */

	@Schema(name = "consumercountry", required = false)
	public String getConsumercountry() {
		return consumercountry;
	}

	public void setConsumercountry(String consumercountry) {
		this.consumercountry = consumercountry;
	}

	public Header consumername(String consumername) {
		this.consumername = consumername;
		return this;
	}

	/**
	 * Get consumername
	 * 
	 * @return consumername
	 */

	@Schema(name = "consumername", required = false)
	public String getConsumername() {
		return consumername;
	}

	public void setConsumername(String consumername) {
		this.consumername = consumername;
	}

	public Header consumerorderflag(String consumerorderflag) {
		this.consumerorderflag = consumerorderflag;
		return this;
	}

	/**
	 * Get consumerorderflag
	 * 
	 * @return consumerorderflag
	 */

	@Schema(name = "consumerorderflag", required = false)
	public String getConsumerorderflag() {
		return consumerorderflag;
	}

	public void setConsumerorderflag(String consumerorderflag) {
		this.consumerorderflag = consumerorderflag;
	}

	public Header consumerstate(String consumerstate) {
		this.consumerstate = consumerstate;
		return this;
	}

	/**
	 * Get consumerstate
	 * 
	 * @return consumerstate
	 */

	@Schema(name = "consumerstate", required = false)
	public String getConsumerstate() {
		return consumerstate;
	}

	public void setConsumerstate(String consumerstate) {
		this.consumerstate = consumerstate;
	}

	public Header consumerzip(String consumerzip) {
		this.consumerzip = consumerzip;
		return this;
	}

	/**
	 * Get consumerzip
	 * 
	 * @return consumerzip
	 */

	@Schema(name = "consumerzip", required = false)
	public String getConsumerzip() {
		return consumerzip;
	}

	public void setConsumerzip(String consumerzip) {
		this.consumerzip = consumerzip;
	}

	public Header context(String context) {
		this.context = context;
		return this;
	}

	/**
	 * Get context
	 * 
	 * @return context
	 */

	@Schema(name = "context", required = false)
	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Header couponcode(String couponcode) {
		this.couponcode = couponcode;
		return this;
	}

	/**
	 * Get couponcode
	 * 
	 * @return couponcode
	 */

	@Schema(name = "couponcode", required = false)
	public String getCouponcode() {
		return couponcode;
	}

	public void setCouponcode(String couponcode) {
		this.couponcode = couponcode;
	}

	public Header createdby(Long createdby) {
		this.createdby = createdby;
		return this;
	}

	/**
	 * Get createdby
	 * 
	 * @return createdby
	 */

	@Schema(name = "createdby", required = false)
	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public Header creationdate(ZonedDateTime creationdate) {
		this.creationdate = creationdate;
		return this;
	}

	/**
	 * Get creationdate
	 * 
	 * @return creationdate
	 */
	@Valid
	@Schema(name = "creationdate", required = false)
	public ZonedDateTime getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(ZonedDateTime creationdate) {
		this.creationdate = creationdate;
	}

	public Header currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 */

	@Schema(name = "currency", required = false)
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Header customerordernumber(String customerordernumber) {
		this.customerordernumber = customerordernumber;
		return this;
	}

	/**
	 * Get customerordernumber
	 * 
	 * @return customerordernumber
	 */

	@Schema(name = "customerordernumber", required = false)
	public String getCustomerordernumber() {
		return customerordernumber;
	}

	public void setCustomerordernumber(String customerordernumber) {
		this.customerordernumber = customerordernumber;
	}

	public Header customershippingmethod(String customershippingmethod) {
		this.customershippingmethod = customershippingmethod;
		return this;
	}

	/**
	 * Get customershippingmethod
	 * 
	 * @return customershippingmethod
	 */

	@Schema(name = "customershippingmethod", required = false)
	public String getCustomershippingmethod() {
		return customershippingmethod;
	}

	public void setCustomershippingmethod(String customershippingmethod) {
		this.customershippingmethod = customershippingmethod;
	}

	public Header customershipto(CustomerShipTo customershipto) {
		this.customershipto = customershipto;
		return this;
	}

	/**
	 * Get customershipto
	 * 
	 * @return customershipto
	 */
	@Valid
	@Schema(name = "customershipto", required = false)
	public CustomerShipTo getCustomershipto() {
		return customershipto;
	}

	public void setCustomershipto(CustomerShipTo customershipto) {
		this.customershipto = customershipto;
	}

	public Header customersignature(String customersignature) {
		this.customersignature = customersignature;
		return this;
	}

	/**
	 * Get customersignature
	 * 
	 * @return customersignature
	 */

	@Schema(name = "customersignature", required = false)
	public String getCustomersignature() {
		return customersignature;
	}

	public void setCustomersignature(String customersignature) {
		this.customersignature = customersignature;
	}

	public Header custordernumber(String custordernumber) {
		this.custordernumber = custordernumber;
		return this;
	}

	/**
	 * Get custordernumber
	 * 
	 * @return custordernumber
	 */

	@Schema(name = "custordernumber", required = false)
	public String getCustordernumber() {
		return custordernumber;
	}

	public void setCustordernumber(String custordernumber) {
		this.custordernumber = custordernumber;
	}

	public Header custponumber(String custponumber) {
		this.custponumber = custponumber;
		return this;
	}

	/**
	 * Get custponumber
	 * 
	 * @return custponumber
	 */

	@Schema(name = "custponumber", required = false)
	public String getCustponumber() {
		return custponumber;
	}

	public void setCustponumber(String custponumber) {
		this.custponumber = custponumber;
	}

	public Header defaultfulfillmentset(DefaultfulfillmentsetEnum defaultfulfillmentset) {
		this.defaultfulfillmentset = defaultfulfillmentset;
		return this;
	}

	/**
	 * Get defaultfulfillmentset
	 * 
	 * @return defaultfulfillmentset
	 */

	@Schema(name = "defaultfulfillmentset", required = false)
	public DefaultfulfillmentsetEnum getDefaultfulfillmentset() {
		return defaultfulfillmentset;
	}

	public void setDefaultfulfillmentset(DefaultfulfillmentsetEnum defaultfulfillmentset) {
		this.defaultfulfillmentset = defaultfulfillmentset;
	}

	public Header deliverto(String deliverto) {
		this.deliverto = deliverto;
		return this;
	}

	/**
	 * Get deliverto
	 * 
	 * @return deliverto
	 */

	@Schema(name = "deliverto", required = false)
	public String getDeliverto() {
		return deliverto;
	}

	public void setDeliverto(String deliverto) {
		this.deliverto = deliverto;
	}

	public Header delivertoorgid(Long delivertoorgid) {
		this.delivertoorgid = delivertoorgid;
		return this;
	}

	/**
	 * Get delivertoorgid
	 * 
	 * @return delivertoorgid
	 */

	@Schema(name = "delivertoorgid", required = false)
	public Long getDelivertoorgid() {
		return delivertoorgid;
	}

	public void setDelivertoorgid(Long delivertoorgid) {
		this.delivertoorgid = delivertoorgid;
	}

	public Header deliverycommissioncode(String deliverycommissioncode) {
		this.deliverycommissioncode = deliverycommissioncode;
		return this;
	}

	/**
	 * Get deliverycommissioncode
	 * 
	 * @return deliverycommissioncode
	 */

	@Schema(name = "deliverycommissioncode", required = false)
	public String getDeliverycommissioncode() {
		return deliverycommissioncode;
	}

	public void setDeliverycommissioncode(String deliverycommissioncode) {
		this.deliverycommissioncode = deliverycommissioncode;
	}

	public Header drnumber(String drnumber) {
		this.drnumber = drnumber;
		return this;
	}

	/**
	 * Get drnumber
	 * 
	 * @return drnumber
	 */

	@Schema(name = "drnumber", required = false)
	public String getDrnumber() {
		return drnumber;
	}

	public void setDrnumber(String drnumber) {
		this.drnumber = drnumber;
	}

	public Header flowstatuscode(String flowstatuscode) {
		this.flowstatuscode = flowstatuscode;
		return this;
	}

	/**
	 * Get flowstatuscode
	 * 
	 * @return flowstatuscode
	 */

	@Schema(name = "flowstatuscode", required = false)
	public String getFlowstatuscode() {
		return flowstatuscode;
	}

	public void setFlowstatuscode(String flowstatuscode) {
		this.flowstatuscode = flowstatuscode;
	}

	public Header fobpointcode(String fobpointcode) {
		this.fobpointcode = fobpointcode;
		return this;
	}

	/**
	 * Get fobpointcode
	 * 
	 * @return fobpointcode
	 */

	@Schema(name = "fobpointcode", required = false)
	public String getFobpointcode() {
		return fobpointcode;
	}

	public void setFobpointcode(String fobpointcode) {
		this.fobpointcode = fobpointcode;
	}

	public Header fobpointmeaning(String fobpointmeaning) {
		this.fobpointmeaning = fobpointmeaning;
		return this;
	}

	/**
	 * Get fobpointmeaning
	 * 
	 * @return fobpointmeaning
	 */

	@Schema(name = "fobpointmeaning", required = false)
	public String getFobpointmeaning() {
		return fobpointmeaning;
	}

	public void setFobpointmeaning(String fobpointmeaning) {
		this.fobpointmeaning = fobpointmeaning;
	}

	public Header freightcarriercode(String freightcarriercode) {
		this.freightcarriercode = freightcarriercode;
		return this;
	}

	/**
	 * Get freightcarriercode
	 * 
	 * @return freightcarriercode
	 */

	@Schema(name = "freightcarriercode", required = false)
	public String getFreightcarriercode() {
		return freightcarriercode;
	}

	public void setFreightcarriercode(String freightcarriercode) {
		this.freightcarriercode = freightcarriercode;
	}

	public Header freightcarriermeaning(String freightcarriermeaning) {
		this.freightcarriermeaning = freightcarriermeaning;
		return this;
	}

	/**
	 * Get freightcarriermeaning
	 * 
	 * @return freightcarriermeaning
	 */

	@Schema(name = "freightcarriermeaning", required = false)
	public String getFreightcarriermeaning() {
		return freightcarriermeaning;
	}

	public void setFreightcarriermeaning(String freightcarriermeaning) {
		this.freightcarriermeaning = freightcarriermeaning;
	}

	public Header freighttermscode(String freighttermscode) {
		this.freighttermscode = freighttermscode;
		return this;
	}

	/**
	 * Get freighttermscode
	 * 
	 * @return freighttermscode
	 */

	@Schema(name = "freighttermscode", required = false)
	public String getFreighttermscode() {
		return freighttermscode;
	}

	public void setFreighttermscode(String freighttermscode) {
		this.freighttermscode = freighttermscode;
	}

	public Header freighttermsmeaning(String freighttermsmeaning) {
		this.freighttermsmeaning = freighttermsmeaning;
		return this;
	}

	/**
	 * Get freighttermsmeaning
	 * 
	 * @return freighttermsmeaning
	 */

	@Schema(name = "freighttermsmeaning", required = false)
	public String getFreighttermsmeaning() {
		return freighttermsmeaning;
	}

	public void setFreighttermsmeaning(String freighttermsmeaning) {
		this.freighttermsmeaning = freighttermsmeaning;
	}

	public Header fulfillmentmethod(String fulfillmentmethod) {
		this.fulfillmentmethod = fulfillmentmethod;
		return this;
	}

	/**
	 * Get fulfillmentmethod
	 * 
	 * @return fulfillmentmethod
	 */

	@Schema(name = "fulfillmentmethod", required = false)
	public String getFulfillmentmethod() {
		return fulfillmentmethod;
	}

	public void setFulfillmentmethod(String fulfillmentmethod) {
		this.fulfillmentmethod = fulfillmentmethod;
	}

	public Header globalattributes(List<Attribute> globalattributes) {
		this.globalattributes = globalattributes;
		return this;
	}

	public Header addGlobalattributesItem(Attribute globalattributesItem) {
		if (this.globalattributes == null) {
			this.globalattributes = new ArrayList<>();
		}
		this.globalattributes.add(globalattributesItem);
		return this;
	}

	/**
	 * Get globalattributes
	 * 
	 * @return globalattributes
	 */
	@Valid
	@Schema(name = "globalattributes", required = false)
	public List<Attribute> getGlobalattributes() {
		return globalattributes;
	}

	public void setGlobalattributes(List<Attribute> globalattributes) {
		this.globalattributes = globalattributes;
	}

	public Header headerid(Long headerid) {
		this.headerid = headerid;
		return this;
	}

	/**
	 * Get headerid
	 * 
	 * @return headerid
	 */

	@Schema(name = "headerid", required = false)
	public Long getHeaderid() {
		return headerid;
	}

	public void setHeaderid(Long headerid) {
		this.headerid = headerid;
	}

	public Header holdnamedff(HoldnamedffEnum holdnamedff) {
		this.holdnamedff = holdnamedff;
		return this;
	}

	/**
	 * Get holdnamedff
	 * 
	 * @return holdnamedff
	 */

	@Schema(name = "holdnamedff", required = false)
	public HoldnamedffEnum getHoldnamedff() {
		return holdnamedff;
	}

	public void setHoldnamedff(HoldnamedffEnum holdnamedff) {
		this.holdnamedff = holdnamedff;
	}

	public Header inboundplanningflag(String inboundplanningflag) {
		this.inboundplanningflag = inboundplanningflag;
		return this;
	}

	/**
	 * Get inboundplanningflag
	 * 
	 * @return inboundplanningflag
	 */

	@Schema(name = "inboundplanningflag", required = false)
	public String getInboundplanningflag() {
		return inboundplanningflag;
	}

	public void setInboundplanningflag(String inboundplanningflag) {
		this.inboundplanningflag = inboundplanningflag;
	}

	public Header invoiceto(String invoiceto) {
		this.invoiceto = invoiceto;
		return this;
	}

	/**
	 * Get invoiceto
	 * 
	 * @return invoiceto
	 */

	@Schema(name = "invoiceto", required = false)
	public String getInvoiceto() {
		return invoiceto;
	}

	public void setInvoiceto(String invoiceto) {
		this.invoiceto = invoiceto;
	}

	public Header invoicetoorgid(Long invoicetoorgid) {
		this.invoicetoorgid = invoicetoorgid;
		return this;
	}

	/**
	 * Get invoicetoorgid
	 * 
	 * @return invoicetoorgid
	 */

	@Schema(name = "invoicetoorgid", required = false)
	public Long getInvoicetoorgid() {
		return invoicetoorgid;
	}

	public void setInvoicetoorgid(Long invoicetoorgid) {
		this.invoicetoorgid = invoicetoorgid;
	}

	public Header lastupdatedate(ZonedDateTime lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
		return this;
	}

	/**
	 * Get lastupdatedate
	 * 
	 * @return lastupdatedate
	 */
	@Valid
	@Schema(name = "lastupdatedate", required = false)
	public ZonedDateTime getLastupdatedate() {
		return lastupdatedate;
	}

	public void setLastupdatedate(ZonedDateTime lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
	}

	public Header lastupdatedby(Long lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
		return this;
	}

	/**
	 * Get lastupdatedby
	 * 
	 * @return lastupdatedby
	 */

	@Schema(name = "lastupdatedby", required = false)
	public Long getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(Long lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public Header legacycustdata(String legacycustdata) {
		this.legacycustdata = legacycustdata;
		return this;
	}

	/**
	 * Get legacycustdata
	 * 
	 * @return legacycustdata
	 */

	@Schema(name = "legacycustdata", required = false)
	public String getLegacycustdata() {
		return legacycustdata;
	}

	public void setLegacycustdata(String legacycustdata) {
		this.legacycustdata = legacycustdata;
	}

	public Header linesetname(String linesetname) {
		this.linesetname = linesetname;
		return this;
	}

	/**
	 * Get linesetname
	 * 
	 * @return linesetname
	 */

	@Schema(name = "linesetname", required = false)
	public String getLinesetname() {
		return linesetname;
	}

	public void setLinesetname(String linesetname) {
		this.linesetname = linesetname;
	}

	public Header marketingassistfee(Long marketingassistfee) {
		this.marketingassistfee = marketingassistfee;
		return this;
	}

	/**
	 * Get marketingassistfee
	 * 
	 * @return marketingassistfee
	 */

	@Schema(name = "marketingassistfee", required = false)
	public Long getMarketingassistfee() {
		return marketingassistfee;
	}

	public void setMarketingassistfee(Long marketingassistfee) {
		this.marketingassistfee = marketingassistfee;
	}

	public Header naprogramnumber(String naprogramnumber) {
		this.naprogramnumber = naprogramnumber;
		return this;
	}

	/**
	 * Get naprogramnumber
	 * 
	 * @return naprogramnumber
	 */

	@Schema(name = "naprogramnumber", required = false)
	public String getNaprogramnumber() {
		return naprogramnumber;
	}

	public void setNaprogramnumber(String naprogramnumber) {
		this.naprogramnumber = naprogramnumber;
	}

	public Header openflag(String openflag) {
		this.openflag = openflag;
		return this;
	}

	/**
	 * Get openflag
	 * 
	 * @return openflag
	 */

	@Schema(name = "openflag", required = false)
	public String getOpenflag() {
		return openflag;
	}

	public void setOpenflag(String openflag) {
		this.openflag = openflag;
	}

	public Header ordercategorycode(OrdercategorycodeEnum ordercategorycode) {
		this.ordercategorycode = ordercategorycode;
		return this;
	}

	/**
	 * Get ordercategorycode
	 * 
	 * @return ordercategorycode
	 */

	@Schema(name = "ordercategorycode", required = false)
	public OrdercategorycodeEnum getOrdercategorycode() {
		return ordercategorycode;
	}

	public void setOrdercategorycode(OrdercategorycodeEnum ordercategorycode) {
		this.ordercategorycode = ordercategorycode;
	}

	public Header ordereddate(ZonedDateTime ordereddate) {
		this.ordereddate = ordereddate;
		return this;
	}

	/**
	 * Get ordereddate
	 * 
	 * @return ordereddate
	 */
	@Valid
	@Schema(name = "ordereddate", required = false)
	public ZonedDateTime getOrdereddate() {
		return ordereddate;
	}

	public void setOrdereddate(ZonedDateTime ordereddate) {
		this.ordereddate = ordereddate;
	}

	public Header ordernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
		return this;
	}

	/**
	 * Get ordernumber
	 * 
	 * @return ordernumber
	 */

	@Schema(name = "ordernumber", required = false)
	public Long getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Header ordersourceid(Long ordersourceid) {
		this.ordersourceid = ordersourceid;
		return this;
	}

	/**
	 * Get ordersourceid
	 * 
	 * @return ordersourceid
	 */

	@Schema(name = "ordersourceid", required = false)
	public Long getOrdersourceid() {
		return ordersourceid;
	}

	public void setOrdersourceid(Long ordersourceid) {
		this.ordersourceid = ordersourceid;
	}

	public Header ordersourcemeaning(String ordersourcemeaning) {
		this.ordersourcemeaning = ordersourcemeaning;
		return this;
	}

	/**
	 * Get ordersourcemeaning
	 * 
	 * @return ordersourcemeaning
	 */

	@Schema(name = "ordersourcemeaning", required = false)
	public String getOrdersourcemeaning() {
		return ordersourcemeaning;
	}

	public void setOrdersourcemeaning(String ordersourcemeaning) {
		this.ordersourcemeaning = ordersourcemeaning;
	}

	public Header ordertypecode(OrdertypecodeEnum ordertypecode) {
		this.ordertypecode = ordertypecode;
		return this;
	}

	/**
	 * Get ordertypecode
	 * 
	 * @return ordertypecode
	 */

	@Schema(name = "ordertypecode", required = false)
	public OrdertypecodeEnum getOrdertypecode() {
		return ordertypecode;
	}

	public void setOrdertypecode(OrdertypecodeEnum ordertypecode) {
		this.ordertypecode = ordertypecode;
	}

	public Header ordertypeid(Long ordertypeid) {
		this.ordertypeid = ordertypeid;
		return this;
	}

	/**
	 * Get ordertypeid
	 * 
	 * @return ordertypeid
	 */

	@Schema(name = "ordertypeid", required = false)
	public Long getOrdertypeid() {
		return ordertypeid;
	}

	public void setOrdertypeid(Long ordertypeid) {
		this.ordertypeid = ordertypeid;
	}

	public Header ordertypemeaning(String ordertypemeaning) {
		this.ordertypemeaning = ordertypemeaning;
		return this;
	}

	/**
	 * Get ordertypemeaning
	 * 
	 * @return ordertypemeaning
	 */

	@Schema(name = "ordertypemeaning", required = false)
	public String getOrdertypemeaning() {
		return ordertypemeaning;
	}

	public void setOrdertypemeaning(String ordertypemeaning) {
		this.ordertypemeaning = ordertypemeaning;
	}

	public Header orgid(Long orgid) {
		this.orgid = orgid;
		return this;
	}

	/**
	 * Get orgid
	 * 
	 * @return orgid
	 */

	@Schema(name = "orgid", required = false)
	public Long getOrgid() {
		return orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}

	public Header origsysdocumentref(String origsysdocumentref) {
		this.origsysdocumentref = origsysdocumentref;
		return this;
	}

	/**
	 * Get origsysdocumentref
	 * 
	 * @return origsysdocumentref
	 */

	@Schema(name = "origsysdocumentref", required = false)
	public String getOrigsysdocumentref() {
		return origsysdocumentref;
	}

	public void setOrigsysdocumentref(String origsysdocumentref) {
		this.origsysdocumentref = origsysdocumentref;
	}

	public Header outboundplanningflag(String outboundplanningflag) {
		this.outboundplanningflag = outboundplanningflag;
		return this;
	}

	/**
	 * Get outboundplanningflag
	 * 
	 * @return outboundplanningflag
	 */

	@Schema(name = "outboundplanningflag", required = false)
	public String getOutboundplanningflag() {
		return outboundplanningflag;
	}

	public void setOutboundplanningflag(String outboundplanningflag) {
		this.outboundplanningflag = outboundplanningflag;
	}

	public Header packinginstructions(String packinginstructions) {
		this.packinginstructions = packinginstructions;
		return this;
	}

	/**
	 * Get packinginstructions
	 * 
	 * @return packinginstructions
	 */

	@Schema(name = "packinginstructions", required = false)
	public String getPackinginstructions() {
		return packinginstructions;
	}

	public void setPackinginstructions(String packinginstructions) {
		this.packinginstructions = packinginstructions;
	}

	public Header paymenttermid(Long paymenttermid) {
		this.paymenttermid = paymenttermid;
		return this;
	}

	/**
	 * Get paymenttermid
	 * 
	 * @return paymenttermid
	 */

	@Schema(name = "paymenttermid", required = false)
	public Long getPaymenttermid() {
		return paymenttermid;
	}

	public void setPaymenttermid(Long paymenttermid) {
		this.paymenttermid = paymenttermid;
	}

	public Header paymenttermmeaning(String paymenttermmeaning) {
		this.paymenttermmeaning = paymenttermmeaning;
		return this;
	}

	/**
	 * Get paymenttermmeaning
	 * 
	 * @return paymenttermmeaning
	 */

	@Schema(name = "paymenttermmeaning", required = false)
	public String getPaymenttermmeaning() {
		return paymenttermmeaning;
	}

	public void setPaymenttermmeaning(String paymenttermmeaning) {
		this.paymenttermmeaning = paymenttermmeaning;
	}

	public Header paymenttypecode(String paymenttypecode) {
		this.paymenttypecode = paymenttypecode;
		return this;
	}

	/**
	 * Get paymenttypecode
	 * 
	 * @return paymenttypecode
	 */

	@Schema(name = "paymenttypecode", required = false)
	public String getPaymenttypecode() {
		return paymenttypecode;
	}

	public void setPaymenttypecode(String paymenttypecode) {
		this.paymenttypecode = paymenttypecode;
	}

	public Header paymenttypemeaning(String paymenttypemeaning) {
		this.paymenttypemeaning = paymenttypemeaning;
		return this;
	}

	/**
	 * Get paymenttypemeaning
	 * 
	 * @return paymenttypemeaning
	 */

	@Schema(name = "paymenttypemeaning", required = false)
	public String getPaymenttypemeaning() {
		return paymenttypemeaning;
	}

	public void setPaymenttypemeaning(String paymenttypemeaning) {
		this.paymenttypemeaning = paymenttypemeaning;
	}

	public Header podate(ZonedDateTime podate) {
		this.podate = podate;
		return this;
	}

	/**
	 * Get podate
	 * 
	 * @return podate
	 */
	@Valid
	@Schema(name = "podate", required = false)
	public ZonedDateTime getPodate() {
		return podate;
	}

	public void setPodate(ZonedDateTime podate) {
		this.podate = podate;
	}

	public Header pricelistid(Long pricelistid) {
		this.pricelistid = pricelistid;
		return this;
	}

	/**
	 * Get pricelistid
	 * 
	 * @return pricelistid
	 */

	@Schema(name = "pricelistid", required = false)
	public Long getPricelistid() {
		return pricelistid;
	}

	public void setPricelistid(Long pricelistid) {
		this.pricelistid = pricelistid;
	}

	public Header pricelistname(String pricelistname) {
		this.pricelistname = pricelistname;
		return this;
	}

	/**
	 * Get pricelistname
	 * 
	 * @return pricelistname
	 */

	@Schema(name = "pricelistname", required = false)
	public String getPricelistname() {
		return pricelistname;
	}

	public void setPricelistname(String pricelistname) {
		this.pricelistname = pricelistname;
	}

	public Header processeddate(ZonedDateTime processeddate) {
		this.processeddate = processeddate;
		return this;
	}

	/**
	 * Get processeddate
	 * 
	 * @return processeddate
	 */
	@Valid
	@Schema(name = "processeddate", required = false)
	public ZonedDateTime getProcesseddate() {
		return processeddate;
	}

	public void setProcesseddate(ZonedDateTime processeddate) {
		this.processeddate = processeddate;
	}

	public Header processedmessage(String processedmessage) {
		this.processedmessage = processedmessage;
		return this;
	}

	/**
	 * Get processedmessage
	 * 
	 * @return processedmessage
	 */

	@Schema(name = "processedmessage", required = false)
	public String getProcessedmessage() {
		return processedmessage;
	}

	public void setProcessedmessage(String processedmessage) {
		this.processedmessage = processedmessage;
	}

	public Header processflag(String processflag) {
		this.processflag = processflag;
		return this;
	}

	/**
	 * Get processflag
	 * 
	 * @return processflag
	 */

	@Schema(name = "processflag", required = false)
	public String getProcessflag() {
		return processflag;
	}

	public void setProcessflag(String processflag) {
		this.processflag = processflag;
	}

	public Header quickreturnflag(String quickreturnflag) {
		this.quickreturnflag = quickreturnflag;
		return this;
	}

	/**
	 * Get quickreturnflag
	 * 
	 * @return quickreturnflag
	 */

	@Schema(name = "quickreturnflag", required = false)
	public String getQuickreturnflag() {
		return quickreturnflag;
	}

	public void setQuickreturnflag(String quickreturnflag) {
		this.quickreturnflag = quickreturnflag;
	}

	public Header saleschannelcode(String saleschannelcode) {
		this.saleschannelcode = saleschannelcode;
		return this;
	}

	/**
	 * Get saleschannelcode
	 * 
	 * @return saleschannelcode
	 */

	@Schema(name = "saleschannelcode", required = false)
	public String getSaleschannelcode() {
		return saleschannelcode;
	}

	public void setSaleschannelcode(String saleschannelcode) {
		this.saleschannelcode = saleschannelcode;
	}

	public Header saleschannelmeaning(String saleschannelmeaning) {
		this.saleschannelmeaning = saleschannelmeaning;
		return this;
	}

	/**
	 * Get saleschannelmeaning
	 * 
	 * @return saleschannelmeaning
	 */

	@Schema(name = "saleschannelmeaning", required = false)
	public String getSaleschannelmeaning() {
		return saleschannelmeaning;
	}

	public void setSaleschannelmeaning(String saleschannelmeaning) {
		this.saleschannelmeaning = saleschannelmeaning;
	}

	public Header salesperson(String salesperson) {
		this.salesperson = salesperson;
		return this;
	}

	/**
	 * Get salesperson
	 * 
	 * @return salesperson
	 */

	@Schema(name = "salesperson", required = false)
	public String getSalesperson() {
		return salesperson;
	}

	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}

	public Header salesrepid(Long salesrepid) {
		this.salesrepid = salesrepid;
		return this;
	}

	/**
	 * Get salesrepid
	 * 
	 * @return salesrepid
	 */

	@Schema(name = "salesrepid", required = false)
	public Long getSalesrepid() {
		return salesrepid;
	}

	public void setSalesrepid(Long salesrepid) {
		this.salesrepid = salesrepid;
	}

	public Header shipfrom(String shipfrom) {
		this.shipfrom = shipfrom;
		return this;
	}

	/**
	 * Get shipfrom
	 * 
	 * @return shipfrom
	 */

	@Schema(name = "shipfrom", required = false)
	public String getShipfrom() {
		return shipfrom;
	}

	public void setShipfrom(String shipfrom) {
		this.shipfrom = shipfrom;
	}

	public Header shipfromorgid(Long shipfromorgid) {
		this.shipfromorgid = shipfromorgid;
		return this;
	}

	/**
	 * Get shipfromorgid
	 * 
	 * @return shipfromorgid
	 */

	@Schema(name = "shipfromorgid", required = false)
	public Long getShipfromorgid() {
		return shipfromorgid;
	}

	public void setShipfromorgid(Long shipfromorgid) {
		this.shipfromorgid = shipfromorgid;
	}

	public Header shipmentprioritycode(ShipmentprioritycodeEnum shipmentprioritycode) {
		this.shipmentprioritycode = shipmentprioritycode;
		return this;
	}

	/**
	 * Get shipmentprioritycode
	 * 
	 * @return shipmentprioritycode
	 */

	@Schema(name = "shipmentprioritycode", required = false)
	public ShipmentprioritycodeEnum getShipmentprioritycode() {
		return shipmentprioritycode;
	}

	public void setShipmentprioritycode(ShipmentprioritycodeEnum shipmentprioritycode) {
		this.shipmentprioritycode = shipmentprioritycode;
	}

	public Header shipmentprioritymeaning(String shipmentprioritymeaning) {
		this.shipmentprioritymeaning = shipmentprioritymeaning;
		return this;
	}

	/**
	 * Get shipmentprioritymeaning
	 * 
	 * @return shipmentprioritymeaning
	 */

	@Schema(name = "shipmentprioritymeaning", required = false)
	public String getShipmentprioritymeaning() {
		return shipmentprioritymeaning;
	}

	public void setShipmentprioritymeaning(String shipmentprioritymeaning) {
		this.shipmentprioritymeaning = shipmentprioritymeaning;
	}

	public Header shippinginstructions(String shippinginstructions) {
		this.shippinginstructions = shippinginstructions;
		return this;
	}

	/**
	 * Get shippinginstructions
	 * 
	 * @return shippinginstructions
	 */

	@Schema(name = "shippinginstructions", required = false)
	public String getShippinginstructions() {
		return shippinginstructions;
	}

	public void setShippinginstructions(String shippinginstructions) {
		this.shippinginstructions = shippinginstructions;
	}

	public Header shippingmethodcode(String shippingmethodcode) {
		this.shippingmethodcode = shippingmethodcode;
		return this;
	}

	/**
	 * Get shippingmethodcode
	 * 
	 * @return shippingmethodcode
	 */

	@Schema(name = "shippingmethodcode", required = false)
	public String getShippingmethodcode() {
		return shippingmethodcode;
	}

	public void setShippingmethodcode(String shippingmethodcode) {
		this.shippingmethodcode = shippingmethodcode;
	}

	public Header shippingmethodmeaning(String shippingmethodmeaning) {
		this.shippingmethodmeaning = shippingmethodmeaning;
		return this;
	}

	/**
	 * Get shippingmethodmeaning
	 * 
	 * @return shippingmethodmeaning
	 */

	@Schema(name = "shippingmethodmeaning", required = false)
	public String getShippingmethodmeaning() {
		return shippingmethodmeaning;
	}

	public void setShippingmethodmeaning(String shippingmethodmeaning) {
		this.shippingmethodmeaning = shippingmethodmeaning;
	}

	public Header shipto(String shipto) {
		this.shipto = shipto;
		return this;
	}

	/**
	 * Get shipto
	 * 
	 * @return shipto
	 */

	@Schema(name = "shipto", required = false)
	public String getShipto() {
		return shipto;
	}

	public void setShipto(String shipto) {
		this.shipto = shipto;
	}

	public Header shiptoorgid(Long shiptoorgid) {
		this.shiptoorgid = shiptoorgid;
		return this;
	}

	/**
	 * Get shiptoorgid
	 * 
	 * @return shiptoorgid
	 */

	@Schema(name = "shiptoorgid", required = false)
	public Long getShiptoorgid() {
		return shiptoorgid;
	}

	public void setShiptoorgid(Long shiptoorgid) {
		this.shiptoorgid = shiptoorgid;
	}

	public Header soldfrom(String soldfrom) {
		this.soldfrom = soldfrom;
		return this;
	}

	/**
	 * Get soldfrom
	 * 
	 * @return soldfrom
	 */

	@Schema(name = "soldfrom", required = false)
	public String getSoldfrom() {
		return soldfrom;
	}

	public void setSoldfrom(String soldfrom) {
		this.soldfrom = soldfrom;
	}

	public Header soldfromorgid(Long soldfromorgid) {
		this.soldfromorgid = soldfromorgid;
		return this;
	}

	/**
	 * Get soldfromorgid
	 * 
	 * @return soldfromorgid
	 */

	@Schema(name = "soldfromorgid", required = false)
	public Long getSoldfromorgid() {
		return soldfromorgid;
	}

	public void setSoldfromorgid(Long soldfromorgid) {
		this.soldfromorgid = soldfromorgid;
	}

	public Header soldto(String soldto) {
		this.soldto = soldto;
		return this;
	}

	/**
	 * Get soldto
	 * 
	 * @return soldto
	 */

	@Schema(name = "soldto", required = false)
	public String getSoldto() {
		return soldto;
	}

	public void setSoldto(String soldto) {
		this.soldto = soldto;
	}

	public Header soldtoorgid(Long soldtoorgid) {
		this.soldtoorgid = soldtoorgid;
		return this;
	}

	/**
	 * Get soldtoorgid
	 * 
	 * @return soldtoorgid
	 */

	@Schema(name = "soldtoorgid", required = false)
	public Long getSoldtoorgid() {
		return soldtoorgid;
	}

	public void setSoldtoorgid(Long soldtoorgid) {
		this.soldtoorgid = soldtoorgid;
	}

	public Header tcnumber(String tcnumber) {
		this.tcnumber = tcnumber;
		return this;
	}

	/**
	 * Get tcnumber
	 * 
	 * @return tcnumber
	 */

	@Schema(name = "tcnumber", required = false)
	public String getTcnumber() {
		return tcnumber;
	}

	public void setTcnumber(String tcnumber) {
		this.tcnumber = tcnumber;
	}

	public Header tpattributes(List<Attribute> tpattributes) {
		this.tpattributes = tpattributes;
		return this;
	}

	public Header addTpattributesItem(Attribute tpattributesItem) {
		if (this.tpattributes == null) {
			this.tpattributes = new ArrayList<>();
		}
		this.tpattributes.add(tpattributesItem);
		return this;
	}

	/**
	 * Get tpattributes
	 * 
	 * @return tpattributes
	 */
	@Valid
	@Schema(name = "tpattributes", required = false)
	public List<Attribute> getTpattributes() {
		return tpattributes;
	}

	public void setTpattributes(List<Attribute> tpattributes) {
		this.tpattributes = tpattributes;
	}

	public Header transactionalcurrcode(String transactionalcurrcode) {
		this.transactionalcurrcode = transactionalcurrcode;
		return this;
	}

	/**
	 * Get transactionalcurrcode
	 * 
	 * @return transactionalcurrcode
	 */

	@Schema(name = "transactionalcurrcode", required = false)
	public String getTransactionalcurrcode() {
		return transactionalcurrcode;
	}

	public void setTransactionalcurrcode(String transactionalcurrcode) {
		this.transactionalcurrcode = transactionalcurrcode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Header header = (Header) o;
		return Objects.equals(this.actioncode, header.actioncode)
				&& Objects.equals(this.affiliateid, header.affiliateid)
				&& Objects.equals(this.attribute, header.attribute)
				&& Objects.equals(this.bookedflag, header.bookedflag)
				&& Objects.equals(this.cancelledflag, header.cancelledflag)
				&& Objects.equals(this.changereason, header.changereason)
				&& Objects.equals(this.consumeraddress1, header.consumeraddress1)
				&& Objects.equals(this.consumeraddress2, header.consumeraddress2)
				&& Objects.equals(this.consumerbtaddress1, header.consumerbtaddress1)
				&& Objects.equals(this.consumerbtaddress2, header.consumerbtaddress2)
				&& Objects.equals(this.consumerbtcity, header.consumerbtcity)
				&& Objects.equals(this.consumerbtcontactname, header.consumerbtcontactname)
				&& Objects.equals(this.consumerbtcontactnumber, header.consumerbtcontactnumber)
				&& Objects.equals(this.consumerbtcountry, header.consumerbtcountry)
				&& Objects.equals(this.consumerbtemail, header.consumerbtemail)
				&& Objects.equals(this.consumerbtname, header.consumerbtname)
				&& Objects.equals(this.consumerbtstate, header.consumerbtstate)
				&& Objects.equals(this.consumerbtstore, header.consumerbtstore)
				&& Objects.equals(this.consumerbtzip, header.consumerbtzip)
				&& Objects.equals(this.consumercity, header.consumercity)
				&& Objects.equals(this.consumercountry, header.consumercountry)
				&& Objects.equals(this.consumername, header.consumername)
				&& Objects.equals(this.consumerorderflag, header.consumerorderflag)
				&& Objects.equals(this.consumerstate, header.consumerstate)
				&& Objects.equals(this.consumerzip, header.consumerzip) && Objects.equals(this.context, header.context)
				&& Objects.equals(this.couponcode, header.couponcode)
				&& Objects.equals(this.createdby, header.createdby)
				&& Objects.equals(this.creationdate, header.creationdate)
				&& Objects.equals(this.currency, header.currency)
				&& Objects.equals(this.customerordernumber, header.customerordernumber)
				&& Objects.equals(this.customershippingmethod, header.customershippingmethod)
				&& Objects.equals(this.customershipto, header.customershipto)
				&& Objects.equals(this.customersignature, header.customersignature)
				&& Objects.equals(this.custordernumber, header.custordernumber)
				&& Objects.equals(this.custponumber, header.custponumber)
				&& Objects.equals(this.defaultfulfillmentset, header.defaultfulfillmentset)
				&& Objects.equals(this.deliverto, header.deliverto)
				&& Objects.equals(this.delivertoorgid, header.delivertoorgid)
				&& Objects.equals(this.deliverycommissioncode, header.deliverycommissioncode)
				&& Objects.equals(this.drnumber, header.drnumber)
				&& Objects.equals(this.flowstatuscode, header.flowstatuscode)
				&& Objects.equals(this.fobpointcode, header.fobpointcode)
				&& Objects.equals(this.fobpointmeaning, header.fobpointmeaning)
				&& Objects.equals(this.freightcarriercode, header.freightcarriercode)
				&& Objects.equals(this.freightcarriermeaning, header.freightcarriermeaning)
				&& Objects.equals(this.freighttermscode, header.freighttermscode)
				&& Objects.equals(this.freighttermsmeaning, header.freighttermsmeaning)
				&& Objects.equals(this.fulfillmentmethod, header.fulfillmentmethod)
				&& Objects.equals(this.globalattributes, header.globalattributes)
				&& Objects.equals(this.headerid, header.headerid)
				&& Objects.equals(this.holdnamedff, header.holdnamedff)
				&& Objects.equals(this.inboundplanningflag, header.inboundplanningflag)
				&& Objects.equals(this.invoiceto, header.invoiceto)
				&& Objects.equals(this.invoicetoorgid, header.invoicetoorgid)
				&& Objects.equals(this.lastupdatedate, header.lastupdatedate)
				&& Objects.equals(this.lastupdatedby, header.lastupdatedby)
				&& Objects.equals(this.legacycustdata, header.legacycustdata)
				&& Objects.equals(this.linesetname, header.linesetname)
				&& Objects.equals(this.marketingassistfee, header.marketingassistfee)
				&& Objects.equals(this.naprogramnumber, header.naprogramnumber)
				&& Objects.equals(this.openflag, header.openflag)
				&& Objects.equals(this.ordercategorycode, header.ordercategorycode)
				&& Objects.equals(this.ordereddate, header.ordereddate)
				&& Objects.equals(this.ordernumber, header.ordernumber)
				&& Objects.equals(this.ordersourceid, header.ordersourceid)
				&& Objects.equals(this.ordersourcemeaning, header.ordersourcemeaning)
				&& Objects.equals(this.ordertypecode, header.ordertypecode)
				&& Objects.equals(this.ordertypeid, header.ordertypeid)
				&& Objects.equals(this.ordertypemeaning, header.ordertypemeaning)
				&& Objects.equals(this.orgid, header.orgid)
				&& Objects.equals(this.origsysdocumentref, header.origsysdocumentref)
				&& Objects.equals(this.outboundplanningflag, header.outboundplanningflag)
				&& Objects.equals(this.packinginstructions, header.packinginstructions)
				&& Objects.equals(this.paymenttermid, header.paymenttermid)
				&& Objects.equals(this.paymenttermmeaning, header.paymenttermmeaning)
				&& Objects.equals(this.paymenttypecode, header.paymenttypecode)
				&& Objects.equals(this.paymenttypemeaning, header.paymenttypemeaning)
				&& Objects.equals(this.podate, header.podate) && Objects.equals(this.pricelistid, header.pricelistid)
				&& Objects.equals(this.pricelistname, header.pricelistname)
				&& Objects.equals(this.processeddate, header.processeddate)
				&& Objects.equals(this.processedmessage, header.processedmessage)
				&& Objects.equals(this.processflag, header.processflag)
				&& Objects.equals(this.quickreturnflag, header.quickreturnflag)
				&& Objects.equals(this.saleschannelcode, header.saleschannelcode)
				&& Objects.equals(this.saleschannelmeaning, header.saleschannelmeaning)
				&& Objects.equals(this.salesperson, header.salesperson)
				&& Objects.equals(this.salesrepid, header.salesrepid) && Objects.equals(this.shipfrom, header.shipfrom)
				&& Objects.equals(this.shipfromorgid, header.shipfromorgid)
				&& Objects.equals(this.shipmentprioritycode, header.shipmentprioritycode)
				&& Objects.equals(this.shipmentprioritymeaning, header.shipmentprioritymeaning)
				&& Objects.equals(this.shippinginstructions, header.shippinginstructions)
				&& Objects.equals(this.shippingmethodcode, header.shippingmethodcode)
				&& Objects.equals(this.shippingmethodmeaning, header.shippingmethodmeaning)
				&& Objects.equals(this.shipto, header.shipto) && Objects.equals(this.shiptoorgid, header.shiptoorgid)
				&& Objects.equals(this.soldfrom, header.soldfrom)
				&& Objects.equals(this.soldfromorgid, header.soldfromorgid)
				&& Objects.equals(this.soldto, header.soldto) && Objects.equals(this.soldtoorgid, header.soldtoorgid)
				&& Objects.equals(this.tcnumber, header.tcnumber)
				&& Objects.equals(this.tpattributes, header.tpattributes)
				&& Objects.equals(this.transactionalcurrcode, header.transactionalcurrcode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(actioncode, affiliateid, attribute, bookedflag, cancelledflag, changereason,
				consumeraddress1, consumeraddress2, consumerbtaddress1, consumerbtaddress2, consumerbtcity,
				consumerbtcontactname, consumerbtcontactnumber, consumerbtcountry, consumerbtemail, consumerbtname,
				consumerbtstate, consumerbtstore, consumerbtzip, consumercity, consumercountry, consumername,
				consumerorderflag, consumerstate, consumerzip, context, couponcode, createdby, creationdate, currency,
				customerordernumber, customershippingmethod, customershipto, customersignature, custordernumber,
				custponumber, defaultfulfillmentset, deliverto, delivertoorgid, deliverycommissioncode, drnumber,
				flowstatuscode, fobpointcode, fobpointmeaning, freightcarriercode, freightcarriermeaning,
				freighttermscode, freighttermsmeaning, fulfillmentmethod, globalattributes, headerid, holdnamedff,
				inboundplanningflag, invoiceto, invoicetoorgid, lastupdatedate, lastupdatedby, legacycustdata,
				linesetname, marketingassistfee, naprogramnumber, openflag, ordercategorycode, ordereddate, ordernumber,
				ordersourceid, ordersourcemeaning, ordertypecode, ordertypeid, ordertypemeaning, orgid,
				origsysdocumentref, outboundplanningflag, packinginstructions, paymenttermid, paymenttermmeaning,
				paymenttypecode, paymenttypemeaning, podate, pricelistid, pricelistname, processeddate,
				processedmessage, processflag, quickreturnflag, saleschannelcode, saleschannelmeaning, salesperson,
				salesrepid, shipfrom, shipfromorgid, shipmentprioritycode, shipmentprioritymeaning,
				shippinginstructions, shippingmethodcode, shippingmethodmeaning, shipto, shiptoorgid, soldfrom,
				soldfromorgid, soldto, soldtoorgid, tcnumber, tpattributes, transactionalcurrcode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Header {\n");
		sb.append("    actioncode: ").append(toIndentedString(actioncode)).append("\n");
		sb.append("    affiliateid: ").append(toIndentedString(affiliateid)).append("\n");
		sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
		sb.append("    bookedflag: ").append(toIndentedString(bookedflag)).append("\n");
		sb.append("    cancelledflag: ").append(toIndentedString(cancelledflag)).append("\n");
		sb.append("    changereason: ").append(toIndentedString(changereason)).append("\n");
		sb.append("    consumeraddress1: ").append(toIndentedString(consumeraddress1)).append("\n");
		sb.append("    consumeraddress2: ").append(toIndentedString(consumeraddress2)).append("\n");
		sb.append("    consumerbtaddress1: ").append(toIndentedString(consumerbtaddress1)).append("\n");
		sb.append("    consumerbtaddress2: ").append(toIndentedString(consumerbtaddress2)).append("\n");
		sb.append("    consumerbtcity: ").append(toIndentedString(consumerbtcity)).append("\n");
		sb.append("    consumerbtcontactname: ").append(toIndentedString(consumerbtcontactname)).append("\n");
		sb.append("    consumerbtcontactnumber: ").append(toIndentedString(consumerbtcontactnumber)).append("\n");
		sb.append("    consumerbtcountry: ").append(toIndentedString(consumerbtcountry)).append("\n");
		sb.append("    consumerbtemail: ").append(toIndentedString(consumerbtemail)).append("\n");
		sb.append("    consumerbtname: ").append(toIndentedString(consumerbtname)).append("\n");
		sb.append("    consumerbtstate: ").append(toIndentedString(consumerbtstate)).append("\n");
		sb.append("    consumerbtstore: ").append(toIndentedString(consumerbtstore)).append("\n");
		sb.append("    consumerbtzip: ").append(toIndentedString(consumerbtzip)).append("\n");
		sb.append("    consumercity: ").append(toIndentedString(consumercity)).append("\n");
		sb.append("    consumercountry: ").append(toIndentedString(consumercountry)).append("\n");
		sb.append("    consumername: ").append(toIndentedString(consumername)).append("\n");
		sb.append("    consumerorderflag: ").append(toIndentedString(consumerorderflag)).append("\n");
		sb.append("    consumerstate: ").append(toIndentedString(consumerstate)).append("\n");
		sb.append("    consumerzip: ").append(toIndentedString(consumerzip)).append("\n");
		sb.append("    context: ").append(toIndentedString(context)).append("\n");
		sb.append("    couponcode: ").append(toIndentedString(couponcode)).append("\n");
		sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
		sb.append("    creationdate: ").append(toIndentedString(creationdate)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    customerordernumber: ").append(toIndentedString(customerordernumber)).append("\n");
		sb.append("    customershippingmethod: ").append(toIndentedString(customershippingmethod)).append("\n");
		sb.append("    customershipto: ").append(toIndentedString(customershipto)).append("\n");
		sb.append("    customersignature: ").append(toIndentedString(customersignature)).append("\n");
		sb.append("    custordernumber: ").append(toIndentedString(custordernumber)).append("\n");
		sb.append("    custponumber: ").append(toIndentedString(custponumber)).append("\n");
		sb.append("    defaultfulfillmentset: ").append(toIndentedString(defaultfulfillmentset)).append("\n");
		sb.append("    deliverto: ").append(toIndentedString(deliverto)).append("\n");
		sb.append("    delivertoorgid: ").append(toIndentedString(delivertoorgid)).append("\n");
		sb.append("    deliverycommissioncode: ").append(toIndentedString(deliverycommissioncode)).append("\n");
		sb.append("    drnumber: ").append(toIndentedString(drnumber)).append("\n");
		sb.append("    flowstatuscode: ").append(toIndentedString(flowstatuscode)).append("\n");
		sb.append("    fobpointcode: ").append(toIndentedString(fobpointcode)).append("\n");
		sb.append("    fobpointmeaning: ").append(toIndentedString(fobpointmeaning)).append("\n");
		sb.append("    freightcarriercode: ").append(toIndentedString(freightcarriercode)).append("\n");
		sb.append("    freightcarriermeaning: ").append(toIndentedString(freightcarriermeaning)).append("\n");
		sb.append("    freighttermscode: ").append(toIndentedString(freighttermscode)).append("\n");
		sb.append("    freighttermsmeaning: ").append(toIndentedString(freighttermsmeaning)).append("\n");
		sb.append("    fulfillmentmethod: ").append(toIndentedString(fulfillmentmethod)).append("\n");
		sb.append("    globalattributes: ").append(toIndentedString(globalattributes)).append("\n");
		sb.append("    headerid: ").append(toIndentedString(headerid)).append("\n");
		sb.append("    holdnamedff: ").append(toIndentedString(holdnamedff)).append("\n");
		sb.append("    inboundplanningflag: ").append(toIndentedString(inboundplanningflag)).append("\n");
		sb.append("    invoiceto: ").append(toIndentedString(invoiceto)).append("\n");
		sb.append("    invoicetoorgid: ").append(toIndentedString(invoicetoorgid)).append("\n");
		sb.append("    lastupdatedate: ").append(toIndentedString(lastupdatedate)).append("\n");
		sb.append("    lastupdatedby: ").append(toIndentedString(lastupdatedby)).append("\n");
		sb.append("    legacycustdata: ").append(toIndentedString(legacycustdata)).append("\n");
		sb.append("    linesetname: ").append(toIndentedString(linesetname)).append("\n");
		sb.append("    marketingassistfee: ").append(toIndentedString(marketingassistfee)).append("\n");
		sb.append("    naprogramnumber: ").append(toIndentedString(naprogramnumber)).append("\n");
		sb.append("    openflag: ").append(toIndentedString(openflag)).append("\n");
		sb.append("    ordercategorycode: ").append(toIndentedString(ordercategorycode)).append("\n");
		sb.append("    ordereddate: ").append(toIndentedString(ordereddate)).append("\n");
		sb.append("    ordernumber: ").append(toIndentedString(ordernumber)).append("\n");
		sb.append("    ordersourceid: ").append(toIndentedString(ordersourceid)).append("\n");
		sb.append("    ordersourcemeaning: ").append(toIndentedString(ordersourcemeaning)).append("\n");
		sb.append("    ordertypecode: ").append(toIndentedString(ordertypecode)).append("\n");
		sb.append("    ordertypeid: ").append(toIndentedString(ordertypeid)).append("\n");
		sb.append("    ordertypemeaning: ").append(toIndentedString(ordertypemeaning)).append("\n");
		sb.append("    orgid: ").append(toIndentedString(orgid)).append("\n");
		sb.append("    origsysdocumentref: ").append(toIndentedString(origsysdocumentref)).append("\n");
		sb.append("    outboundplanningflag: ").append(toIndentedString(outboundplanningflag)).append("\n");
		sb.append("    packinginstructions: ").append(toIndentedString(packinginstructions)).append("\n");
		sb.append("    paymenttermid: ").append(toIndentedString(paymenttermid)).append("\n");
		sb.append("    paymenttermmeaning: ").append(toIndentedString(paymenttermmeaning)).append("\n");
		sb.append("    paymenttypecode: ").append(toIndentedString(paymenttypecode)).append("\n");
		sb.append("    paymenttypemeaning: ").append(toIndentedString(paymenttypemeaning)).append("\n");
		sb.append("    podate: ").append(toIndentedString(podate)).append("\n");
		sb.append("    pricelistid: ").append(toIndentedString(pricelistid)).append("\n");
		sb.append("    pricelistname: ").append(toIndentedString(pricelistname)).append("\n");
		sb.append("    processeddate: ").append(toIndentedString(processeddate)).append("\n");
		sb.append("    processedmessage: ").append(toIndentedString(processedmessage)).append("\n");
		sb.append("    processflag: ").append(toIndentedString(processflag)).append("\n");
		sb.append("    quickreturnflag: ").append(toIndentedString(quickreturnflag)).append("\n");
		sb.append("    saleschannelcode: ").append(toIndentedString(saleschannelcode)).append("\n");
		sb.append("    saleschannelmeaning: ").append(toIndentedString(saleschannelmeaning)).append("\n");
		sb.append("    salesperson: ").append(toIndentedString(salesperson)).append("\n");
		sb.append("    salesrepid: ").append(toIndentedString(salesrepid)).append("\n");
		sb.append("    shipfrom: ").append(toIndentedString(shipfrom)).append("\n");
		sb.append("    shipfromorgid: ").append(toIndentedString(shipfromorgid)).append("\n");
		sb.append("    shipmentprioritycode: ").append(toIndentedString(shipmentprioritycode)).append("\n");
		sb.append("    shipmentprioritymeaning: ").append(toIndentedString(shipmentprioritymeaning)).append("\n");
		sb.append("    shippinginstructions: ").append(toIndentedString(shippinginstructions)).append("\n");
		sb.append("    shippingmethodcode: ").append(toIndentedString(shippingmethodcode)).append("\n");
		sb.append("    shippingmethodmeaning: ").append(toIndentedString(shippingmethodmeaning)).append("\n");
		sb.append("    shipto: ").append(toIndentedString(shipto)).append("\n");
		sb.append("    shiptoorgid: ").append(toIndentedString(shiptoorgid)).append("\n");
		sb.append("    soldfrom: ").append(toIndentedString(soldfrom)).append("\n");
		sb.append("    soldfromorgid: ").append(toIndentedString(soldfromorgid)).append("\n");
		sb.append("    soldto: ").append(toIndentedString(soldto)).append("\n");
		sb.append("    soldtoorgid: ").append(toIndentedString(soldtoorgid)).append("\n");
		sb.append("    tcnumber: ").append(toIndentedString(tcnumber)).append("\n");
		sb.append("    tpattributes: ").append(toIndentedString(tpattributes)).append("\n");
		sb.append("    transactionalcurrcode: ").append(toIndentedString(transactionalcurrcode)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
