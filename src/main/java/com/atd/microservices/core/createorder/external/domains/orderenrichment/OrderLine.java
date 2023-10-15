package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.deserializer.JsonDateTimeDeserializer;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.Attribute;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.ISOLine;
import com.atd.microservices.core.createorder.external.domains.serializer.JsonDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
 * OrderLine
 */

public class OrderLine {

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

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("bandagworkordernumber")
  private String bandagworkordernumber;

  @JsonProperty("bookedflag")
  private String bookedflag;

  @JsonProperty("calculatepriceflag")
  private String calculatepriceflag;

  @JsonProperty("cancelcomments")
  private String cancelcomments;

  @JsonProperty("cancelledflag")
  private String cancelledflag;

  @JsonProperty("cancelledquantity")
  private Long cancelledquantity;

  @JsonProperty("carrierquotedfreightcost")
  private Float carrierquotedfreightcost;

  @JsonProperty("changereason")
  private String changereason;

  @JsonProperty("claimnumber")
  private String claimnumber;

  @JsonProperty("consumerfreighthandling")
  private String consumerfreighthandling;

  @JsonProperty("consumersalesprice")
  private String consumersalesprice;

  @JsonProperty("consumersalestax")
  private String consumersalestax;

  @JsonProperty("context")
  private String context;

  @JsonProperty("contractnumber")
  private String contractnumber;

  @JsonProperty("couponcodediscount")
  private Long couponcodediscount;

  @JsonProperty("createdby")
  private String createdby;

  @JsonProperty("creationdate")
  @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime creationdate;

  @JsonProperty("customerReservedQty")
  private Long customerReservedQty;

  @JsonProperty("customeritemnetprice")
  private Float customeritemnetprice;

  @JsonProperty("customerlinenumber")
  private String customerlinenumber;

  @JsonProperty("customerorderlinenumber")
  private String customerorderlinenumber;

  @JsonProperty("customerordernumber")
  private String customerordernumber;

  @JsonProperty("customerpartnumber")
  private String customerpartnumber;

  @JsonProperty("custpolinenumber")
  private String custpolinenumber;

  @JsonProperty("custponumber")
  private String custponumber;

  @JsonProperty("dealerSoldTo")
  private String dealerSoldTo;

  @JsonProperty("deliverto")
  private String deliverto;

  @JsonProperty("delivertoorgid")
  private String delivertoorgid;

  @JsonProperty("deliveryleadtime")
  private String deliveryleadtime;

  @JsonProperty("dotnumber")
  private String dotnumber;

  @JsonProperty("edigtin")
  private String edigtin;

  @JsonProperty("expectedresvqty")
  private Long expectedresvqty;

  @JsonProperty("fetexemption")
  private String fetexemption;

  @JsonProperty("flowstatuscode")
  private String flowstatuscode;

  @JsonProperty("fobpointcode")
  private String fobpointcode;

  @JsonProperty("fobpointmeaning")
  private String fobpointmeaning;

  @JsonProperty("freightamount")
  private Float freightamount;

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

  @JsonProperty("headerid")
  private Long headerid;

  @JsonProperty("holdflag")
  private String holdflag;

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

  @JsonProperty("inventoryitemid")
  private Long inventoryitemid;

  @JsonProperty("invoiceto")
  private String invoiceto;

  @JsonProperty("invoicetoorgid")
  private String invoicetoorgid;

  @JsonProperty("isoline")
  private ISOLine isoline;

  @JsonProperty("isoordernumber")
  private String isoordernumber;

  @JsonProperty("itemnumber")
  private String itemnumber;

  @JsonProperty("lastupdatedate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime lastupdatedate;

  @JsonProperty("lastupdatedby")
  private String lastupdatedby;

  @JsonProperty("latestacceptabledate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime latestacceptabledate;

  @JsonProperty("linecategorycode")
  private String linecategorycode;

  @JsonProperty("lineid")
  private Long lineid;

  @JsonProperty("linenumber")
  private Long linenumber;

  /**
   * Gets or Sets linetypecode
   */
  public enum LinetypecodeEnum {
    THREE_PL_SALES_LINE("THREE_PL_SALES_LINE"),
    
    BILL_ONLY_LINE("BILL_ONLY_LINE"),
    
    BOOKING_ORDER_LINE("BOOKING_ORDER_LINE"),
    
    BOOK_DC_DIRECT_SHIP_LINE("BOOK_DC_DIRECT_SHIP_LINE"),
    
    CREDIT_ONLY_LINE("CREDIT_ONLY_LINE"),
    
    DC_DIRECT_SHIP_LINE("DC_DIRECT_SHIP_LINE"),
    
    DEFECTIVE_RTV_SALES_LINE("DEFECTIVE_RTV_SALES_LINE"),
    
    DO_NOT_USE("DO_NOT_USE"),
    
    FUEL_SURCHARGE_LINE("FUEL_SURCHARGE_LINE"),
    
    GENERIC_SALES_LINE("GENERIC_SALES_LINE"),
    
    GOVT_WASH_BILL_LINE("GOVT_WASH_BILL_LINE"),
    
    GOVT_WASH_CREDIT_LINE("GOVT_WASH_CREDIT_LINE"),
    
    INTERNAL_SALES_LINE("INTERNAL_SALES_LINE"),
    
    MKT_FEE_BILL_LINE("MKT_FEE_BILL_LINE"),
    
    NA_INDIRECT_BILL_LINE("NA_INDIRECT_BILL_LINE"),
    
    NA_INDIRECT_CREDIT_LINE("NA_INDIRECT_CREDIT_LINE"),
    
    PRICE_CORR_BILL_ONLY_LINE("PRICE_CORR_BILL_ONLY_LINE"),
    
    PRICE_CORR_CREDIT_ONLY_LINE("PRICE_CORR_CREDIT_ONLY_LINE"),
    
    RECEIPT_ONLY_LINE("RECEIPT_ONLY_LINE"),
    
    RESTOCKING_FEE_LINE("RESTOCKING_FEE_LINE"),
    
    REPLENISHMENT_SALES_LINE("REPLENISHMENT_SALES_LINE"),
    
    RETURNS_LINE("RETURNS_LINE"),
    
    INSTALLER_SALES_LINE("INSTALLER_SALES_LINE"),
    
    RTC_LINE("RTC_LINE"),
    
    SHIP_ONLY_LINE("SHIP_ONLY_LINE"),
    
    SHIP_TO_HOME_LINE("SHIP_TO_HOME_LINE"),
    
    STH_MB_SALE_LINE("STH_MB_SALE_LINE"),
    
    STH_VENDOR_DIRECT_SHIP_LINE("STH_VENDOR_DIRECT_SHIP_LINE"),
    
    VENDOR_DIRECT_SHIP_LINE("VENDOR_DIRECT_SHIP_LINE"),
    
    WARRANTY_RMA_PICKUP_LINE("WARRANTY_RMA_PICKUP_LINE"),
    
    WATERFALL_BILL_ONLY_LINE("WATERFALL_BILL_ONLY_LINE"),
    
    WATERFALL_CREDIT_ONLY_LINE("WATERFALL_CREDIT_ONLY_LINE");

    private String value;

    LinetypecodeEnum(String value) {
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
    public static LinetypecodeEnum fromValue(String value) {
      for (LinetypecodeEnum b : LinetypecodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("linetypecode")
  private LinetypecodeEnum linetypecode;

  @JsonProperty("linetypeid")
  private Long linetypeid;

  @JsonProperty("linetypemeaning")
  private String linetypemeaning;

  @JsonProperty("mileage")
  private String mileage;

  @JsonProperty("naprogramnumber")
  private String naprogramnumber;

  @JsonProperty("openflag")
  private String openflag;

  @JsonProperty("orderedquantity")
  private Long orderedquantity;

  @JsonProperty("ordernumber")
  private Long ordernumber;

  @JsonProperty("orderquantityuom")
  private String orderquantityuom;

  @JsonProperty("orderunitofmeasure")
  private String orderunitofmeasure;

  @JsonProperty("orgid")
  private Long orgid;

  @JsonProperty("origsysdocumentref")
  private String origsysdocumentref;

  @JsonProperty("origsyslineref")
  private String origsyslineref;

  @JsonProperty("packinginstructions")
  private String packinginstructions;

  @JsonProperty("paymenttermid")
  private String paymenttermid;

  @JsonProperty("paymenttermmeaning")
  private String paymenttermmeaning;

  @JsonProperty("paymenttypecode")
  private String paymenttypecode;

  @JsonProperty("paymenttypemeaning")
  private String paymenttypemeaning;

  @JsonProperty("pickupDcOrgId")
  private String pickupDcOrgId;

  @JsonProperty("poxshipflag")
  private String poxshipflag;

  @JsonProperty("poxshipnotes")
  private String poxshipnotes;

  @JsonProperty("pricelistid")
  private Long pricelistid;

  @JsonProperty("pricelistname")
  private String pricelistname;

  @JsonProperty("pricingdate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime pricingdate;

  @JsonProperty("prioritypickup")
  private String prioritypickup;

  @JsonProperty("processeddate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime processeddate;

  @JsonProperty("processedmessage")
  private String processedmessage;

  @JsonProperty("processflag")
  private String processflag;

  /**
   * Gets or Sets producttype
   */
  public enum ProducttypeEnum {
    WHEEL_ACCESSORY("WHEEL_ACCESSORY"),
    
    TOOL("TOOL"),
    
    SUPPLY("SUPPLY"),
    
    TIRE("TIRE"),
    
    TUBE("TUBE"),
    
    WHEEL("WHEEL"),
    
    NOT_AVAILABLE("NOT_AVAILABLE");

    private String value;

    ProducttypeEnum(String value) {
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
    public static ProducttypeEnum fromValue(String value) {
      for (ProducttypeEnum b : ProducttypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("producttype")
  private ProducttypeEnum producttype;

  @JsonProperty("promiseddate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime promiseddate;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("referenceheaderid")
  private Long referenceheaderid;

  @JsonProperty("referencelineid")
  private Long referencelineid;

  @JsonProperty("referencetype")
  private String referencetype;

  @JsonProperty("restockingfee")
  private String restockingfee;

  @JsonProperty("returnattribute1")
  private String returnattribute1;

  @JsonProperty("returnattribute2")
  private String returnattribute2;

  @JsonProperty("returncontext")
  private String returncontext;

  @JsonProperty("returnreasoncode")
  private String returnreasoncode;

  @JsonProperty("route")
  private String route;

  @JsonProperty("routesequence")
  private String routesequence;

  @JsonProperty("salesperson")
  private String salesperson;

  @JsonProperty("salesrepid")
  private String salesrepid;

  @JsonProperty("schedulearrivaldate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime schedulearrivaldate;

  @JsonProperty("scheduledshipdate")
    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
  @JsonSerialize(using = JsonDateTimeSerializer.class)
  private ZonedDateTime scheduledshipdate;

  @JsonProperty("shipfrom")
  private String shipfrom;

  @JsonProperty("shipfromorgid")
  private String shipfromorgid;

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

  @JsonProperty("shippedquantity")
  private Long shippedquantity;

  @JsonProperty("shippingDcOrgId")
  private String shippingDcOrgId;

  @JsonProperty("shippinginstructions")
  private String shippinginstructions;

  @JsonProperty("shippingmethodcode")
  private String shippingmethodcode;

  @JsonProperty("shippingmethodmeaning")
  private String shippingmethodmeaning;

  @JsonProperty("shipsetid")
  private Long shipsetid;

  @JsonProperty("shipto")
  private String shipto;

  @JsonProperty("shiptoorgid")
  private String shiptoorgid;

  @JsonProperty("soldfrom")
  private String soldfrom;

  @JsonProperty("soldfromorgid")
  private Long soldfromorgid;

  @JsonProperty("soldto")
  private String soldto;

  @JsonProperty("soldtoorgid")
  private Long soldtoorgid;

  @JsonProperty("subinventory")
  private String subinventory;

  @JsonProperty("tppcostperunit")
  private Float tppcostperunit;

  @JsonProperty("treaddepth")
  private String treaddepth;

  @JsonProperty("unitlistprice")
  private Float unitlistprice;

  @JsonProperty("unitsellingprice")
  private Float unitsellingprice;

  @JsonProperty("updateflag")
  private String updateflag;

  @JsonProperty("useritemdescription")
  private String useritemdescription;

  @JsonProperty("vendorlocation")
  private String vendorlocation;

  @JsonProperty("vendorname")
  private String vendorname;

  public OrderLine actioncode(ActioncodeEnum actioncode) {
    this.actioncode = actioncode;
    return this;
  }

  /**
   * Get actioncode
   * @return actioncode
  */
  
  @Schema(name = "actioncode", required = false)
  public ActioncodeEnum getActioncode() {
    return actioncode;
  }

  public void setActioncode(ActioncodeEnum actioncode) {
    this.actioncode = actioncode;
  }

  public OrderLine attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public OrderLine addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", required = false)
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public OrderLine bandagworkordernumber(String bandagworkordernumber) {
    this.bandagworkordernumber = bandagworkordernumber;
    return this;
  }

  /**
   * Get bandagworkordernumber
   * @return bandagworkordernumber
  */
  
  @Schema(name = "bandagworkordernumber", required = false)
  public String getBandagworkordernumber() {
    return bandagworkordernumber;
  }

  public void setBandagworkordernumber(String bandagworkordernumber) {
    this.bandagworkordernumber = bandagworkordernumber;
  }

  public OrderLine bookedflag(String bookedflag) {
    this.bookedflag = bookedflag;
    return this;
  }

  /**
   * Get bookedflag
   * @return bookedflag
  */
  
  @Schema(name = "bookedflag", required = false)
  public String getBookedflag() {
    return bookedflag;
  }

  public void setBookedflag(String bookedflag) {
    this.bookedflag = bookedflag;
  }

  public OrderLine calculatepriceflag(String calculatepriceflag) {
    this.calculatepriceflag = calculatepriceflag;
    return this;
  }

  /**
   * Get calculatepriceflag
   * @return calculatepriceflag
  */
  
  @Schema(name = "calculatepriceflag", required = false)
  public String getCalculatepriceflag() {
    return calculatepriceflag;
  }

  public void setCalculatepriceflag(String calculatepriceflag) {
    this.calculatepriceflag = calculatepriceflag;
  }

  public OrderLine cancelcomments(String cancelcomments) {
    this.cancelcomments = cancelcomments;
    return this;
  }

  /**
   * Get cancelcomments
   * @return cancelcomments
  */
  
  @Schema(name = "cancelcomments", required = false)
  public String getCancelcomments() {
    return cancelcomments;
  }

  public void setCancelcomments(String cancelcomments) {
    this.cancelcomments = cancelcomments;
  }

  public OrderLine cancelledflag(String cancelledflag) {
    this.cancelledflag = cancelledflag;
    return this;
  }

  /**
   * Get cancelledflag
   * @return cancelledflag
  */
  
  @Schema(name = "cancelledflag", required = false)
  public String getCancelledflag() {
    return cancelledflag;
  }

  public void setCancelledflag(String cancelledflag) {
    this.cancelledflag = cancelledflag;
  }

  public OrderLine cancelledquantity(Long cancelledquantity) {
    this.cancelledquantity = cancelledquantity;
    return this;
  }

  /**
   * Get cancelledquantity
   * @return cancelledquantity
  */
  
  @Schema(name = "cancelledquantity", required = false)
  public Long getCancelledquantity() {
    return cancelledquantity;
  }

  public void setCancelledquantity(Long cancelledquantity) {
    this.cancelledquantity = cancelledquantity;
  }

  public OrderLine carrierquotedfreightcost(Float carrierquotedfreightcost) {
    this.carrierquotedfreightcost = carrierquotedfreightcost;
    return this;
  }

  /**
   * Get carrierquotedfreightcost
   * @return carrierquotedfreightcost
  */
  
  @Schema(name = "carrierquotedfreightcost", required = false)
  public Float getCarrierquotedfreightcost() {
    return carrierquotedfreightcost;
  }

  public void setCarrierquotedfreightcost(Float carrierquotedfreightcost) {
    this.carrierquotedfreightcost = carrierquotedfreightcost;
  }

  public OrderLine changereason(String changereason) {
    this.changereason = changereason;
    return this;
  }

  /**
   * Get changereason
   * @return changereason
  */
  
  @Schema(name = "changereason", required = false)
  public String getChangereason() {
    return changereason;
  }

  public void setChangereason(String changereason) {
    this.changereason = changereason;
  }

  public OrderLine claimnumber(String claimnumber) {
    this.claimnumber = claimnumber;
    return this;
  }

  /**
   * Get claimnumber
   * @return claimnumber
  */
  
  @Schema(name = "claimnumber", required = false)
  public String getClaimnumber() {
    return claimnumber;
  }

  public void setClaimnumber(String claimnumber) {
    this.claimnumber = claimnumber;
  }

  public OrderLine consumerfreighthandling(String consumerfreighthandling) {
    this.consumerfreighthandling = consumerfreighthandling;
    return this;
  }

  /**
   * Get consumerfreighthandling
   * @return consumerfreighthandling
  */
  
  @Schema(name = "consumerfreighthandling", required = false)
  public String getConsumerfreighthandling() {
    return consumerfreighthandling;
  }

  public void setConsumerfreighthandling(String consumerfreighthandling) {
    this.consumerfreighthandling = consumerfreighthandling;
  }

  public OrderLine consumersalesprice(String consumersalesprice) {
    this.consumersalesprice = consumersalesprice;
    return this;
  }

  /**
   * Get consumersalesprice
   * @return consumersalesprice
  */
  
  @Schema(name = "consumersalesprice", required = false)
  public String getConsumersalesprice() {
    return consumersalesprice;
  }

  public void setConsumersalesprice(String consumersalesprice) {
    this.consumersalesprice = consumersalesprice;
  }

  public OrderLine consumersalestax(String consumersalestax) {
    this.consumersalestax = consumersalestax;
    return this;
  }

  /**
   * Get consumersalestax
   * @return consumersalestax
  */
  
  @Schema(name = "consumersalestax", required = false)
  public String getConsumersalestax() {
    return consumersalestax;
  }

  public void setConsumersalestax(String consumersalestax) {
    this.consumersalestax = consumersalestax;
  }

  public OrderLine context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  
  @Schema(name = "context", required = false)
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public OrderLine contractnumber(String contractnumber) {
    this.contractnumber = contractnumber;
    return this;
  }

  /**
   * Get contractnumber
   * @return contractnumber
  */
  
  @Schema(name = "contractnumber", required = false)
  public String getContractnumber() {
    return contractnumber;
  }

  public void setContractnumber(String contractnumber) {
    this.contractnumber = contractnumber;
  }

  public OrderLine couponcodediscount(Long couponcodediscount) {
    this.couponcodediscount = couponcodediscount;
    return this;
  }

  /**
   * Get couponcodediscount
   * @return couponcodediscount
  */
  
  @Schema(name = "couponcodediscount", required = false)
  public Long getCouponcodediscount() {
    return couponcodediscount;
  }

  public void setCouponcodediscount(Long couponcodediscount) {
    this.couponcodediscount = couponcodediscount;
  }

  public OrderLine createdby(String createdby) {
    this.createdby = createdby;
    return this;
  }

  /**
   * Get createdby
   * @return createdby
  */
  
  @Schema(name = "createdby", required = false)
  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public OrderLine creationdate(ZonedDateTime creationdate) {
    this.creationdate = creationdate;
    return this;
  }

  /**
   * Get creationdate
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

  public OrderLine customerReservedQty(Long customerReservedQty) {
    this.customerReservedQty = customerReservedQty;
    return this;
  }

  /**
   * Get customerReservedQty
   * @return customerReservedQty
  */
  
  @Schema(name = "customerReservedQty", required = false)
  public Long getCustomerReservedQty() {
    return customerReservedQty;
  }

  public void setCustomerReservedQty(Long customerReservedQty) {
    this.customerReservedQty = customerReservedQty;
  }

  public OrderLine customeritemnetprice(Float customeritemnetprice) {
    this.customeritemnetprice = customeritemnetprice;
    return this;
  }

  /**
   * Get customeritemnetprice
   * @return customeritemnetprice
  */
  
  @Schema(name = "customeritemnetprice", required = false)
  public Float getCustomeritemnetprice() {
    return customeritemnetprice;
  }

  public void setCustomeritemnetprice(Float customeritemnetprice) {
    this.customeritemnetprice = customeritemnetprice;
  }

  public OrderLine customerlinenumber(String customerlinenumber) {
    this.customerlinenumber = customerlinenumber;
    return this;
  }

  /**
   * Get customerlinenumber
   * @return customerlinenumber
  */
  
  @Schema(name = "customerlinenumber", required = false)
  public String getCustomerlinenumber() {
    return customerlinenumber;
  }

  public void setCustomerlinenumber(String customerlinenumber) {
    this.customerlinenumber = customerlinenumber;
  }

  public OrderLine customerorderlinenumber(String customerorderlinenumber) {
    this.customerorderlinenumber = customerorderlinenumber;
    return this;
  }

  /**
   * Get customerorderlinenumber
   * @return customerorderlinenumber
  */
  
  @Schema(name = "customerorderlinenumber", required = false)
  public String getCustomerorderlinenumber() {
    return customerorderlinenumber;
  }

  public void setCustomerorderlinenumber(String customerorderlinenumber) {
    this.customerorderlinenumber = customerorderlinenumber;
  }

  public OrderLine customerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
    return this;
  }

  /**
   * Get customerordernumber
   * @return customerordernumber
  */
  
  @Schema(name = "customerordernumber", required = false)
  public String getCustomerordernumber() {
    return customerordernumber;
  }

  public void setCustomerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
  }

  public OrderLine customerpartnumber(String customerpartnumber) {
    this.customerpartnumber = customerpartnumber;
    return this;
  }

  /**
   * Get customerpartnumber
   * @return customerpartnumber
  */
  
  @Schema(name = "customerpartnumber", required = false)
  public String getCustomerpartnumber() {
    return customerpartnumber;
  }

  public void setCustomerpartnumber(String customerpartnumber) {
    this.customerpartnumber = customerpartnumber;
  }

  public OrderLine custpolinenumber(String custpolinenumber) {
    this.custpolinenumber = custpolinenumber;
    return this;
  }

  /**
   * Get custpolinenumber
   * @return custpolinenumber
  */
  
  @Schema(name = "custpolinenumber", required = false)
  public String getCustpolinenumber() {
    return custpolinenumber;
  }

  public void setCustpolinenumber(String custpolinenumber) {
    this.custpolinenumber = custpolinenumber;
  }

  public OrderLine custponumber(String custponumber) {
    this.custponumber = custponumber;
    return this;
  }

  /**
   * Get custponumber
   * @return custponumber
  */
  
  @Schema(name = "custponumber", required = false)
  public String getCustponumber() {
    return custponumber;
  }

  public void setCustponumber(String custponumber) {
    this.custponumber = custponumber;
  }

  public OrderLine dealerSoldTo(String dealerSoldTo) {
    this.dealerSoldTo = dealerSoldTo;
    return this;
  }

  /**
   * Get dealerSoldTo
   * @return dealerSoldTo
  */
  
  @Schema(name = "dealerSoldTo", required = false)
  public String getDealerSoldTo() {
    return dealerSoldTo;
  }

  public void setDealerSoldTo(String dealerSoldTo) {
    this.dealerSoldTo = dealerSoldTo;
  }

  public OrderLine deliverto(String deliverto) {
    this.deliverto = deliverto;
    return this;
  }

  /**
   * Get deliverto
   * @return deliverto
  */
  
  @Schema(name = "deliverto", required = false)
  public String getDeliverto() {
    return deliverto;
  }

  public void setDeliverto(String deliverto) {
    this.deliverto = deliverto;
  }

  public OrderLine delivertoorgid(String delivertoorgid) {
    this.delivertoorgid = delivertoorgid;
    return this;
  }

  /**
   * Get delivertoorgid
   * @return delivertoorgid
  */
  
  @Schema(name = "delivertoorgid", required = false)
  public String getDelivertoorgid() {
    return delivertoorgid;
  }

  public void setDelivertoorgid(String delivertoorgid) {
    this.delivertoorgid = delivertoorgid;
  }

  public OrderLine deliveryleadtime(String deliveryleadtime) {
    this.deliveryleadtime = deliveryleadtime;
    return this;
  }

  /**
   * Get deliveryleadtime
   * @return deliveryleadtime
  */
  
  @Schema(name = "deliveryleadtime", required = false)
  public String getDeliveryleadtime() {
    return deliveryleadtime;
  }

  public void setDeliveryleadtime(String deliveryleadtime) {
    this.deliveryleadtime = deliveryleadtime;
  }

  public OrderLine dotnumber(String dotnumber) {
    this.dotnumber = dotnumber;
    return this;
  }

  /**
   * Get dotnumber
   * @return dotnumber
  */
  
  @Schema(name = "dotnumber", required = false)
  public String getDotnumber() {
    return dotnumber;
  }

  public void setDotnumber(String dotnumber) {
    this.dotnumber = dotnumber;
  }

  public OrderLine edigtin(String edigtin) {
    this.edigtin = edigtin;
    return this;
  }

  /**
   * Get edigtin
   * @return edigtin
  */
  
  @Schema(name = "edigtin", required = false)
  public String getEdigtin() {
    return edigtin;
  }

  public void setEdigtin(String edigtin) {
    this.edigtin = edigtin;
  }

  public OrderLine expectedresvqty(Long expectedresvqty) {
    this.expectedresvqty = expectedresvqty;
    return this;
  }

  /**
   * Get expectedresvqty
   * @return expectedresvqty
  */
  
  @Schema(name = "expectedresvqty", required = false)
  public Long getExpectedresvqty() {
    return expectedresvqty;
  }

  public void setExpectedresvqty(Long expectedresvqty) {
    this.expectedresvqty = expectedresvqty;
  }

  public OrderLine fetexemption(String fetexemption) {
    this.fetexemption = fetexemption;
    return this;
  }

  /**
   * Get fetexemption
   * @return fetexemption
  */
  
  @Schema(name = "fetexemption", required = false)
  public String getFetexemption() {
    return fetexemption;
  }

  public void setFetexemption(String fetexemption) {
    this.fetexemption = fetexemption;
  }

  public OrderLine flowstatuscode(String flowstatuscode) {
    this.flowstatuscode = flowstatuscode;
    return this;
  }

  /**
   * Get flowstatuscode
   * @return flowstatuscode
  */
  
  @Schema(name = "flowstatuscode", required = false)
  public String getFlowstatuscode() {
    return flowstatuscode;
  }

  public void setFlowstatuscode(String flowstatuscode) {
    this.flowstatuscode = flowstatuscode;
  }

  public OrderLine fobpointcode(String fobpointcode) {
    this.fobpointcode = fobpointcode;
    return this;
  }

  /**
   * Get fobpointcode
   * @return fobpointcode
  */
  
  @Schema(name = "fobpointcode", required = false)
  public String getFobpointcode() {
    return fobpointcode;
  }

  public void setFobpointcode(String fobpointcode) {
    this.fobpointcode = fobpointcode;
  }

  public OrderLine fobpointmeaning(String fobpointmeaning) {
    this.fobpointmeaning = fobpointmeaning;
    return this;
  }

  /**
   * Get fobpointmeaning
   * @return fobpointmeaning
  */
  
  @Schema(name = "fobpointmeaning", required = false)
  public String getFobpointmeaning() {
    return fobpointmeaning;
  }

  public void setFobpointmeaning(String fobpointmeaning) {
    this.fobpointmeaning = fobpointmeaning;
  }

  public OrderLine freightamount(Float freightamount) {
    this.freightamount = freightamount;
    return this;
  }

  /**
   * Get freightamount
   * @return freightamount
  */
  
  @Schema(name = "freightamount", required = false)
  public Float getFreightamount() {
    return freightamount;
  }

  public void setFreightamount(Float freightamount) {
    this.freightamount = freightamount;
  }

  public OrderLine freightcarriercode(String freightcarriercode) {
    this.freightcarriercode = freightcarriercode;
    return this;
  }

  /**
   * Get freightcarriercode
   * @return freightcarriercode
  */
  
  @Schema(name = "freightcarriercode", required = false)
  public String getFreightcarriercode() {
    return freightcarriercode;
  }

  public void setFreightcarriercode(String freightcarriercode) {
    this.freightcarriercode = freightcarriercode;
  }

  public OrderLine freightcarriermeaning(String freightcarriermeaning) {
    this.freightcarriermeaning = freightcarriermeaning;
    return this;
  }

  /**
   * Get freightcarriermeaning
   * @return freightcarriermeaning
  */
  
  @Schema(name = "freightcarriermeaning", required = false)
  public String getFreightcarriermeaning() {
    return freightcarriermeaning;
  }

  public void setFreightcarriermeaning(String freightcarriermeaning) {
    this.freightcarriermeaning = freightcarriermeaning;
  }

  public OrderLine freighttermscode(String freighttermscode) {
    this.freighttermscode = freighttermscode;
    return this;
  }

  /**
   * Get freighttermscode
   * @return freighttermscode
  */
  
  @Schema(name = "freighttermscode", required = false)
  public String getFreighttermscode() {
    return freighttermscode;
  }

  public void setFreighttermscode(String freighttermscode) {
    this.freighttermscode = freighttermscode;
  }

  public OrderLine freighttermsmeaning(String freighttermsmeaning) {
    this.freighttermsmeaning = freighttermsmeaning;
    return this;
  }

  /**
   * Get freighttermsmeaning
   * @return freighttermsmeaning
  */
  
  @Schema(name = "freighttermsmeaning", required = false)
  public String getFreighttermsmeaning() {
    return freighttermsmeaning;
  }

  public void setFreighttermsmeaning(String freighttermsmeaning) {
    this.freighttermsmeaning = freighttermsmeaning;
  }

  public OrderLine fulfillmentmethod(String fulfillmentmethod) {
    this.fulfillmentmethod = fulfillmentmethod;
    return this;
  }

  /**
   * Get fulfillmentmethod
   * @return fulfillmentmethod
  */
  
  @Schema(name = "fulfillmentmethod", required = false)
  public String getFulfillmentmethod() {
    return fulfillmentmethod;
  }

  public void setFulfillmentmethod(String fulfillmentmethod) {
    this.fulfillmentmethod = fulfillmentmethod;
  }

  public OrderLine headerid(Long headerid) {
    this.headerid = headerid;
    return this;
  }

  /**
   * Get headerid
   * @return headerid
  */
  
  @Schema(name = "headerid", required = false)
  public Long getHeaderid() {
    return headerid;
  }

  public void setHeaderid(Long headerid) {
    this.headerid = headerid;
  }

  public OrderLine holdflag(String holdflag) {
    this.holdflag = holdflag;
    return this;
  }

  /**
   * Get holdflag
   * @return holdflag
  */
  
  @Schema(name = "holdflag", required = false)
  public String getHoldflag() {
    return holdflag;
  }

  public void setHoldflag(String holdflag) {
    this.holdflag = holdflag;
  }

  public OrderLine holdnamedff(HoldnamedffEnum holdnamedff) {
    this.holdnamedff = holdnamedff;
    return this;
  }

  /**
   * Get holdnamedff
   * @return holdnamedff
  */
  
  @Schema(name = "holdnamedff", required = false)
  public HoldnamedffEnum getHoldnamedff() {
    return holdnamedff;
  }

  public void setHoldnamedff(HoldnamedffEnum holdnamedff) {
    this.holdnamedff = holdnamedff;
  }

  public OrderLine inventoryitemid(Long inventoryitemid) {
    this.inventoryitemid = inventoryitemid;
    return this;
  }

  /**
   * Get inventoryitemid
   * @return inventoryitemid
  */
  
  @Schema(name = "inventoryitemid", required = false)
  public Long getInventoryitemid() {
    return inventoryitemid;
  }

  public void setInventoryitemid(Long inventoryitemid) {
    this.inventoryitemid = inventoryitemid;
  }

  public OrderLine invoiceto(String invoiceto) {
    this.invoiceto = invoiceto;
    return this;
  }

  /**
   * Get invoiceto
   * @return invoiceto
  */
  
  @Schema(name = "invoiceto", required = false)
  public String getInvoiceto() {
    return invoiceto;
  }

  public void setInvoiceto(String invoiceto) {
    this.invoiceto = invoiceto;
  }

  public OrderLine invoicetoorgid(String invoicetoorgid) {
    this.invoicetoorgid = invoicetoorgid;
    return this;
  }

  /**
   * Get invoicetoorgid
   * @return invoicetoorgid
  */
  
  @Schema(name = "invoicetoorgid", required = false)
  public String getInvoicetoorgid() {
    return invoicetoorgid;
  }

  public void setInvoicetoorgid(String invoicetoorgid) {
    this.invoicetoorgid = invoicetoorgid;
  }

  public OrderLine isoline(ISOLine isoline) {
    this.isoline = isoline;
    return this;
  }

  /**
   * Get isoline
   * @return isoline
  */
  @Valid 
  @Schema(name = "isoline", required = false)
  public ISOLine getIsoline() {
    return isoline;
  }

  public void setIsoline(ISOLine isoline) {
    this.isoline = isoline;
  }

  public OrderLine isoordernumber(String isoordernumber) {
    this.isoordernumber = isoordernumber;
    return this;
  }

  /**
   * Get isoordernumber
   * @return isoordernumber
  */
  
  @Schema(name = "isoordernumber", required = false)
  public String getIsoordernumber() {
    return isoordernumber;
  }

  public void setIsoordernumber(String isoordernumber) {
    this.isoordernumber = isoordernumber;
  }

  public OrderLine itemnumber(String itemnumber) {
    this.itemnumber = itemnumber;
    return this;
  }

  /**
   * Get itemnumber
   * @return itemnumber
  */
  
  @Schema(name = "itemnumber", required = false)
  public String getItemnumber() {
    return itemnumber;
  }

  public void setItemnumber(String itemnumber) {
    this.itemnumber = itemnumber;
  }

  public OrderLine lastupdatedate(ZonedDateTime lastupdatedate) {
    this.lastupdatedate = lastupdatedate;
    return this;
  }

  /**
   * Get lastupdatedate
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

  public OrderLine lastupdatedby(String lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
    return this;
  }

  /**
   * Get lastupdatedby
   * @return lastupdatedby
  */
  
  @Schema(name = "lastupdatedby", required = false)
  public String getLastupdatedby() {
    return lastupdatedby;
  }

  public void setLastupdatedby(String lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
  }

  public OrderLine latestacceptabledate(ZonedDateTime latestacceptabledate) {
    this.latestacceptabledate = latestacceptabledate;
    return this;
  }

  /**
   * Get latestacceptabledate
   * @return latestacceptabledate
  */
  @Valid 
  @Schema(name = "latestacceptabledate", required = false)
  public ZonedDateTime getLatestacceptabledate() {
    return latestacceptabledate;
  }

  public void setLatestacceptabledate(ZonedDateTime latestacceptabledate) {
    this.latestacceptabledate = latestacceptabledate;
  }

  public OrderLine linecategorycode(String linecategorycode) {
    this.linecategorycode = linecategorycode;
    return this;
  }

  /**
   * Get linecategorycode
   * @return linecategorycode
  */
  
  @Schema(name = "linecategorycode", required = false)
  public String getLinecategorycode() {
    return linecategorycode;
  }

  public void setLinecategorycode(String linecategorycode) {
    this.linecategorycode = linecategorycode;
  }

  public OrderLine lineid(Long lineid) {
    this.lineid = lineid;
    return this;
  }

  /**
   * Get lineid
   * @return lineid
  */
  
  @Schema(name = "lineid", required = false)
  public Long getLineid() {
    return lineid;
  }

  public void setLineid(Long lineid) {
    this.lineid = lineid;
  }

  public OrderLine linenumber(Long linenumber) {
    this.linenumber = linenumber;
    return this;
  }

  /**
   * Get linenumber
   * @return linenumber
  */
  
  @Schema(name = "linenumber", required = false)
  public Long getLinenumber() {
    return linenumber;
  }

  public void setLinenumber(Long linenumber) {
    this.linenumber = linenumber;
  }

  public OrderLine linetypecode(LinetypecodeEnum linetypecode) {
    this.linetypecode = linetypecode;
    return this;
  }

  /**
   * Get linetypecode
   * @return linetypecode
  */
  
  @Schema(name = "linetypecode", required = false)
  public LinetypecodeEnum getLinetypecode() {
    return linetypecode;
  }

  public void setLinetypecode(LinetypecodeEnum linetypecode) {
    this.linetypecode = linetypecode;
  }

  public OrderLine linetypeid(Long linetypeid) {
    this.linetypeid = linetypeid;
    return this;
  }

  /**
   * Get linetypeid
   * @return linetypeid
  */
  
  @Schema(name = "linetypeid", required = false)
  public Long getLinetypeid() {
    return linetypeid;
  }

  public void setLinetypeid(Long linetypeid) {
    this.linetypeid = linetypeid;
  }

  public OrderLine linetypemeaning(String linetypemeaning) {
    this.linetypemeaning = linetypemeaning;
    return this;
  }

  /**
   * Get linetypemeaning
   * @return linetypemeaning
  */
  
  @Schema(name = "linetypemeaning", required = false)
  public String getLinetypemeaning() {
    return linetypemeaning;
  }

  public void setLinetypemeaning(String linetypemeaning) {
    this.linetypemeaning = linetypemeaning;
  }

  public OrderLine mileage(String mileage) {
    this.mileage = mileage;
    return this;
  }

  /**
   * Get mileage
   * @return mileage
  */
  
  @Schema(name = "mileage", required = false)
  public String getMileage() {
    return mileage;
  }

  public void setMileage(String mileage) {
    this.mileage = mileage;
  }

  public OrderLine naprogramnumber(String naprogramnumber) {
    this.naprogramnumber = naprogramnumber;
    return this;
  }

  /**
   * Get naprogramnumber
   * @return naprogramnumber
  */
  
  @Schema(name = "naprogramnumber", required = false)
  public String getNaprogramnumber() {
    return naprogramnumber;
  }

  public void setNaprogramnumber(String naprogramnumber) {
    this.naprogramnumber = naprogramnumber;
  }

  public OrderLine openflag(String openflag) {
    this.openflag = openflag;
    return this;
  }

  /**
   * Get openflag
   * @return openflag
  */
  
  @Schema(name = "openflag", required = false)
  public String getOpenflag() {
    return openflag;
  }

  public void setOpenflag(String openflag) {
    this.openflag = openflag;
  }

  public OrderLine orderedquantity(Long orderedquantity) {
    this.orderedquantity = orderedquantity;
    return this;
  }

  /**
   * Get orderedquantity
   * @return orderedquantity
  */
  
  @Schema(name = "orderedquantity", required = false)
  public Long getOrderedquantity() {
    return orderedquantity;
  }

  public void setOrderedquantity(Long orderedquantity) {
    this.orderedquantity = orderedquantity;
  }

  public OrderLine ordernumber(Long ordernumber) {
    this.ordernumber = ordernumber;
    return this;
  }

  /**
   * Get ordernumber
   * @return ordernumber
  */
  
  @Schema(name = "ordernumber", required = false)
  public Long getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(Long ordernumber) {
    this.ordernumber = ordernumber;
  }

  public OrderLine orderquantityuom(String orderquantityuom) {
    this.orderquantityuom = orderquantityuom;
    return this;
  }

  /**
   * Get orderquantityuom
   * @return orderquantityuom
  */
  
  @Schema(name = "orderquantityuom", required = false)
  public String getOrderquantityuom() {
    return orderquantityuom;
  }

  public void setOrderquantityuom(String orderquantityuom) {
    this.orderquantityuom = orderquantityuom;
  }

  public OrderLine orderunitofmeasure(String orderunitofmeasure) {
    this.orderunitofmeasure = orderunitofmeasure;
    return this;
  }

  /**
   * Get orderunitofmeasure
   * @return orderunitofmeasure
  */
  
  @Schema(name = "orderunitofmeasure", required = false)
  public String getOrderunitofmeasure() {
    return orderunitofmeasure;
  }

  public void setOrderunitofmeasure(String orderunitofmeasure) {
    this.orderunitofmeasure = orderunitofmeasure;
  }

  public OrderLine orgid(Long orgid) {
    this.orgid = orgid;
    return this;
  }

  /**
   * Get orgid
   * @return orgid
  */
  
  @Schema(name = "orgid", required = false)
  public Long getOrgid() {
    return orgid;
  }

  public void setOrgid(Long orgid) {
    this.orgid = orgid;
  }

  public OrderLine origsysdocumentref(String origsysdocumentref) {
    this.origsysdocumentref = origsysdocumentref;
    return this;
  }

  /**
   * Get origsysdocumentref
   * @return origsysdocumentref
  */
  
  @Schema(name = "origsysdocumentref", required = false)
  public String getOrigsysdocumentref() {
    return origsysdocumentref;
  }

  public void setOrigsysdocumentref(String origsysdocumentref) {
    this.origsysdocumentref = origsysdocumentref;
  }

  public OrderLine origsyslineref(String origsyslineref) {
    this.origsyslineref = origsyslineref;
    return this;
  }

  /**
   * Get origsyslineref
   * @return origsyslineref
  */
  
  @Schema(name = "origsyslineref", required = false)
  public String getOrigsyslineref() {
    return origsyslineref;
  }

  public void setOrigsyslineref(String origsyslineref) {
    this.origsyslineref = origsyslineref;
  }

  public OrderLine packinginstructions(String packinginstructions) {
    this.packinginstructions = packinginstructions;
    return this;
  }

  /**
   * Get packinginstructions
   * @return packinginstructions
  */
  
  @Schema(name = "packinginstructions", required = false)
  public String getPackinginstructions() {
    return packinginstructions;
  }

  public void setPackinginstructions(String packinginstructions) {
    this.packinginstructions = packinginstructions;
  }

  public OrderLine paymenttermid(String paymenttermid) {
    this.paymenttermid = paymenttermid;
    return this;
  }

  /**
   * Get paymenttermid
   * @return paymenttermid
  */
  
  @Schema(name = "paymenttermid", required = false)
  public String getPaymenttermid() {
    return paymenttermid;
  }

  public void setPaymenttermid(String paymenttermid) {
    this.paymenttermid = paymenttermid;
  }

  public OrderLine paymenttermmeaning(String paymenttermmeaning) {
    this.paymenttermmeaning = paymenttermmeaning;
    return this;
  }

  /**
   * Get paymenttermmeaning
   * @return paymenttermmeaning
  */
  
  @Schema(name = "paymenttermmeaning", required = false)
  public String getPaymenttermmeaning() {
    return paymenttermmeaning;
  }

  public void setPaymenttermmeaning(String paymenttermmeaning) {
    this.paymenttermmeaning = paymenttermmeaning;
  }

  public OrderLine paymenttypecode(String paymenttypecode) {
    this.paymenttypecode = paymenttypecode;
    return this;
  }

  /**
   * Get paymenttypecode
   * @return paymenttypecode
  */
  
  @Schema(name = "paymenttypecode", required = false)
  public String getPaymenttypecode() {
    return paymenttypecode;
  }

  public void setPaymenttypecode(String paymenttypecode) {
    this.paymenttypecode = paymenttypecode;
  }

  public OrderLine paymenttypemeaning(String paymenttypemeaning) {
    this.paymenttypemeaning = paymenttypemeaning;
    return this;
  }

  /**
   * Get paymenttypemeaning
   * @return paymenttypemeaning
  */
  
  @Schema(name = "paymenttypemeaning", required = false)
  public String getPaymenttypemeaning() {
    return paymenttypemeaning;
  }

  public void setPaymenttypemeaning(String paymenttypemeaning) {
    this.paymenttypemeaning = paymenttypemeaning;
  }

  public OrderLine pickupDcOrgId(String pickupDcOrgId) {
    this.pickupDcOrgId = pickupDcOrgId;
    return this;
  }

  /**
   * Get pickupDcOrgId
   * @return pickupDcOrgId
  */
  
  @Schema(name = "pickupDcOrgId", required = false)
  public String getPickupDcOrgId() {
    return pickupDcOrgId;
  }

  public void setPickupDcOrgId(String pickupDcOrgId) {
    this.pickupDcOrgId = pickupDcOrgId;
  }

  public OrderLine poxshipflag(String poxshipflag) {
    this.poxshipflag = poxshipflag;
    return this;
  }

  /**
   * Get poxshipflag
   * @return poxshipflag
  */
  
  @Schema(name = "poxshipflag", required = false)
  public String getPoxshipflag() {
    return poxshipflag;
  }

  public void setPoxshipflag(String poxshipflag) {
    this.poxshipflag = poxshipflag;
  }

  public OrderLine poxshipnotes(String poxshipnotes) {
    this.poxshipnotes = poxshipnotes;
    return this;
  }

  /**
   * Get poxshipnotes
   * @return poxshipnotes
  */
  
  @Schema(name = "poxshipnotes", required = false)
  public String getPoxshipnotes() {
    return poxshipnotes;
  }

  public void setPoxshipnotes(String poxshipnotes) {
    this.poxshipnotes = poxshipnotes;
  }

  public OrderLine pricelistid(Long pricelistid) {
    this.pricelistid = pricelistid;
    return this;
  }

  /**
   * Get pricelistid
   * @return pricelistid
  */
  
  @Schema(name = "pricelistid", required = false)
  public Long getPricelistid() {
    return pricelistid;
  }

  public void setPricelistid(Long pricelistid) {
    this.pricelistid = pricelistid;
  }

  public OrderLine pricelistname(String pricelistname) {
    this.pricelistname = pricelistname;
    return this;
  }

  /**
   * Get pricelistname
   * @return pricelistname
  */
  
  @Schema(name = "pricelistname", required = false)
  public String getPricelistname() {
    return pricelistname;
  }

  public void setPricelistname(String pricelistname) {
    this.pricelistname = pricelistname;
  }

  public OrderLine pricingdate(ZonedDateTime pricingdate) {
    this.pricingdate = pricingdate;
    return this;
  }

  /**
   * Get pricingdate
   * @return pricingdate
  */
  @Valid 
  @Schema(name = "pricingdate", required = false)
  public ZonedDateTime getPricingdate() {
    return pricingdate;
  }

  public void setPricingdate(ZonedDateTime pricingdate) {
    this.pricingdate = pricingdate;
  }

  public OrderLine prioritypickup(String prioritypickup) {
    this.prioritypickup = prioritypickup;
    return this;
  }

  /**
   * Get prioritypickup
   * @return prioritypickup
  */
  
  @Schema(name = "prioritypickup", required = false)
  public String getPrioritypickup() {
    return prioritypickup;
  }

  public void setPrioritypickup(String prioritypickup) {
    this.prioritypickup = prioritypickup;
  }

  public OrderLine processeddate(ZonedDateTime processeddate) {
    this.processeddate = processeddate;
    return this;
  }

  /**
   * Get processeddate
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

  public OrderLine processedmessage(String processedmessage) {
    this.processedmessage = processedmessage;
    return this;
  }

  /**
   * Get processedmessage
   * @return processedmessage
  */
  
  @Schema(name = "processedmessage", required = false)
  public String getProcessedmessage() {
    return processedmessage;
  }

  public void setProcessedmessage(String processedmessage) {
    this.processedmessage = processedmessage;
  }

  public OrderLine processflag(String processflag) {
    this.processflag = processflag;
    return this;
  }

  /**
   * Get processflag
   * @return processflag
  */
  
  @Schema(name = "processflag", required = false)
  public String getProcessflag() {
    return processflag;
  }

  public void setProcessflag(String processflag) {
    this.processflag = processflag;
  }

  public OrderLine producttype(ProducttypeEnum producttype) {
    this.producttype = producttype;
    return this;
  }

  /**
   * Get producttype
   * @return producttype
  */
  
  @Schema(name = "producttype", required = false)
  public ProducttypeEnum getProducttype() {
    return producttype;
  }

  public void setProducttype(ProducttypeEnum producttype) {
    this.producttype = producttype;
  }

  public OrderLine promiseddate(ZonedDateTime promiseddate) {
    this.promiseddate = promiseddate;
    return this;
  }

  /**
   * Get promiseddate
   * @return promiseddate
  */
  @Valid 
  @Schema(name = "promiseddate", required = false)
  public ZonedDateTime getPromiseddate() {
    return promiseddate;
  }

  public void setPromiseddate(ZonedDateTime promiseddate) {
    this.promiseddate = promiseddate;
  }

  public OrderLine reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  
  @Schema(name = "reason", required = false)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public OrderLine referenceheaderid(Long referenceheaderid) {
    this.referenceheaderid = referenceheaderid;
    return this;
  }

  /**
   * Get referenceheaderid
   * @return referenceheaderid
  */
  
  @Schema(name = "referenceheaderid", required = false)
  public Long getReferenceheaderid() {
    return referenceheaderid;
  }

  public void setReferenceheaderid(Long referenceheaderid) {
    this.referenceheaderid = referenceheaderid;
  }

  public OrderLine referencelineid(Long referencelineid) {
    this.referencelineid = referencelineid;
    return this;
  }

  /**
   * Get referencelineid
   * @return referencelineid
  */
  
  @Schema(name = "referencelineid", required = false)
  public Long getReferencelineid() {
    return referencelineid;
  }

  public void setReferencelineid(Long referencelineid) {
    this.referencelineid = referencelineid;
  }

  public OrderLine referencetype(String referencetype) {
    this.referencetype = referencetype;
    return this;
  }

  /**
   * Get referencetype
   * @return referencetype
  */
  
  @Schema(name = "referencetype", required = false)
  public String getReferencetype() {
    return referencetype;
  }

  public void setReferencetype(String referencetype) {
    this.referencetype = referencetype;
  }

  public OrderLine restockingfee(String restockingfee) {
    this.restockingfee = restockingfee;
    return this;
  }

  /**
   * Get restockingfee
   * @return restockingfee
  */
  
  @Schema(name = "restockingfee", required = false)
  public String getRestockingfee() {
    return restockingfee;
  }

  public void setRestockingfee(String restockingfee) {
    this.restockingfee = restockingfee;
  }

  public OrderLine returnattribute1(String returnattribute1) {
    this.returnattribute1 = returnattribute1;
    return this;
  }

  /**
   * Get returnattribute1
   * @return returnattribute1
  */
  
  @Schema(name = "returnattribute1", required = false)
  public String getReturnattribute1() {
    return returnattribute1;
  }

  public void setReturnattribute1(String returnattribute1) {
    this.returnattribute1 = returnattribute1;
  }

  public OrderLine returnattribute2(String returnattribute2) {
    this.returnattribute2 = returnattribute2;
    return this;
  }

  /**
   * Get returnattribute2
   * @return returnattribute2
  */
  
  @Schema(name = "returnattribute2", required = false)
  public String getReturnattribute2() {
    return returnattribute2;
  }

  public void setReturnattribute2(String returnattribute2) {
    this.returnattribute2 = returnattribute2;
  }

  public OrderLine returncontext(String returncontext) {
    this.returncontext = returncontext;
    return this;
  }

  /**
   * Get returncontext
   * @return returncontext
  */
  
  @Schema(name = "returncontext", required = false)
  public String getReturncontext() {
    return returncontext;
  }

  public void setReturncontext(String returncontext) {
    this.returncontext = returncontext;
  }

  public OrderLine returnreasoncode(String returnreasoncode) {
    this.returnreasoncode = returnreasoncode;
    return this;
  }

  /**
   * Get returnreasoncode
   * @return returnreasoncode
  */
  
  @Schema(name = "returnreasoncode", required = false)
  public String getReturnreasoncode() {
    return returnreasoncode;
  }

  public void setReturnreasoncode(String returnreasoncode) {
    this.returnreasoncode = returnreasoncode;
  }

  public OrderLine route(String route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
  */
  
  @Schema(name = "route", required = false)
  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public OrderLine routesequence(String routesequence) {
    this.routesequence = routesequence;
    return this;
  }

  /**
   * Get routesequence
   * @return routesequence
  */
  
  @Schema(name = "routesequence", required = false)
  public String getRoutesequence() {
    return routesequence;
  }

  public void setRoutesequence(String routesequence) {
    this.routesequence = routesequence;
  }

  public OrderLine salesperson(String salesperson) {
    this.salesperson = salesperson;
    return this;
  }

  /**
   * Get salesperson
   * @return salesperson
  */
  
  @Schema(name = "salesperson", required = false)
  public String getSalesperson() {
    return salesperson;
  }

  public void setSalesperson(String salesperson) {
    this.salesperson = salesperson;
  }

  public OrderLine salesrepid(String salesrepid) {
    this.salesrepid = salesrepid;
    return this;
  }

  /**
   * Get salesrepid
   * @return salesrepid
  */
  
  @Schema(name = "salesrepid", required = false)
  public String getSalesrepid() {
    return salesrepid;
  }

  public void setSalesrepid(String salesrepid) {
    this.salesrepid = salesrepid;
  }

  public OrderLine schedulearrivaldate(ZonedDateTime schedulearrivaldate) {
    this.schedulearrivaldate = schedulearrivaldate;
    return this;
  }

  /**
   * Get schedulearrivaldate
   * @return schedulearrivaldate
  */
  @Valid 
  @Schema(name = "schedulearrivaldate", required = false)
  public ZonedDateTime getSchedulearrivaldate() {
    return schedulearrivaldate;
  }

  public void setSchedulearrivaldate(ZonedDateTime schedulearrivaldate) {
    this.schedulearrivaldate = schedulearrivaldate;
  }

  public OrderLine scheduledshipdate(ZonedDateTime scheduledshipdate) {
    this.scheduledshipdate = scheduledshipdate;
    return this;
  }

  /**
   * Get scheduledshipdate
   * @return scheduledshipdate
  */
  @Valid 
  @Schema(name = "scheduledshipdate", required = false)
  public ZonedDateTime getScheduledshipdate() {
    return scheduledshipdate;
  }

  public void setScheduledshipdate(ZonedDateTime scheduledshipdate) {
    this.scheduledshipdate = scheduledshipdate;
  }

  public OrderLine shipfrom(String shipfrom) {
    this.shipfrom = shipfrom;
    return this;
  }

  /**
   * Get shipfrom
   * @return shipfrom
  */
  
  @Schema(name = "shipfrom", required = false)
  public String getShipfrom() {
    return shipfrom;
  }

  public void setShipfrom(String shipfrom) {
    this.shipfrom = shipfrom;
  }

  public OrderLine shipfromorgid(String shipfromorgid) {
    this.shipfromorgid = shipfromorgid;
    return this;
  }

  /**
   * Get shipfromorgid
   * @return shipfromorgid
  */
  
  @Schema(name = "shipfromorgid", required = false)
  public String getShipfromorgid() {
    return shipfromorgid;
  }

  public void setShipfromorgid(String shipfromorgid) {
    this.shipfromorgid = shipfromorgid;
  }

  public OrderLine shipmentprioritycode(ShipmentprioritycodeEnum shipmentprioritycode) {
    this.shipmentprioritycode = shipmentprioritycode;
    return this;
  }

  /**
   * Get shipmentprioritycode
   * @return shipmentprioritycode
  */
  
  @Schema(name = "shipmentprioritycode", required = false)
  public ShipmentprioritycodeEnum getShipmentprioritycode() {
    return shipmentprioritycode;
  }

  public void setShipmentprioritycode(ShipmentprioritycodeEnum shipmentprioritycode) {
    this.shipmentprioritycode = shipmentprioritycode;
  }

  public OrderLine shipmentprioritymeaning(String shipmentprioritymeaning) {
    this.shipmentprioritymeaning = shipmentprioritymeaning;
    return this;
  }

  /**
   * Get shipmentprioritymeaning
   * @return shipmentprioritymeaning
  */
  
  @Schema(name = "shipmentprioritymeaning", required = false)
  public String getShipmentprioritymeaning() {
    return shipmentprioritymeaning;
  }

  public void setShipmentprioritymeaning(String shipmentprioritymeaning) {
    this.shipmentprioritymeaning = shipmentprioritymeaning;
  }

  public OrderLine shippedquantity(Long shippedquantity) {
    this.shippedquantity = shippedquantity;
    return this;
  }

  /**
   * Get shippedquantity
   * @return shippedquantity
  */
  
  @Schema(name = "shippedquantity", required = false)
  public Long getShippedquantity() {
    return shippedquantity;
  }

  public void setShippedquantity(Long shippedquantity) {
    this.shippedquantity = shippedquantity;
  }

  public OrderLine shippingDcOrgId(String shippingDcOrgId) {
    this.shippingDcOrgId = shippingDcOrgId;
    return this;
  }

  /**
   * Get shippingDcOrgId
   * @return shippingDcOrgId
  */
  
  @Schema(name = "shippingDcOrgId", required = false)
  public String getShippingDcOrgId() {
    return shippingDcOrgId;
  }

  public void setShippingDcOrgId(String shippingDcOrgId) {
    this.shippingDcOrgId = shippingDcOrgId;
  }

  public OrderLine shippinginstructions(String shippinginstructions) {
    this.shippinginstructions = shippinginstructions;
    return this;
  }

  /**
   * Get shippinginstructions
   * @return shippinginstructions
  */
  
  @Schema(name = "shippinginstructions", required = false)
  public String getShippinginstructions() {
    return shippinginstructions;
  }

  public void setShippinginstructions(String shippinginstructions) {
    this.shippinginstructions = shippinginstructions;
  }

  public OrderLine shippingmethodcode(String shippingmethodcode) {
    this.shippingmethodcode = shippingmethodcode;
    return this;
  }

  /**
   * Get shippingmethodcode
   * @return shippingmethodcode
  */
  
  @Schema(name = "shippingmethodcode", required = false)
  public String getShippingmethodcode() {
    return shippingmethodcode;
  }

  public void setShippingmethodcode(String shippingmethodcode) {
    this.shippingmethodcode = shippingmethodcode;
  }

  public OrderLine shippingmethodmeaning(String shippingmethodmeaning) {
    this.shippingmethodmeaning = shippingmethodmeaning;
    return this;
  }

  /**
   * Get shippingmethodmeaning
   * @return shippingmethodmeaning
  */
  
  @Schema(name = "shippingmethodmeaning", required = false)
  public String getShippingmethodmeaning() {
    return shippingmethodmeaning;
  }

  public void setShippingmethodmeaning(String shippingmethodmeaning) {
    this.shippingmethodmeaning = shippingmethodmeaning;
  }

  public OrderLine shipsetid(Long shipsetid) {
    this.shipsetid = shipsetid;
    return this;
  }

  /**
   * Get shipsetid
   * @return shipsetid
  */
  
  @Schema(name = "shipsetid", required = false)
  public Long getShipsetid() {
    return shipsetid;
  }

  public void setShipsetid(Long shipsetid) {
    this.shipsetid = shipsetid;
  }

  public OrderLine shipto(String shipto) {
    this.shipto = shipto;
    return this;
  }

  /**
   * Get shipto
   * @return shipto
  */
  
  @Schema(name = "shipto", required = false)
  public String getShipto() {
    return shipto;
  }

  public void setShipto(String shipto) {
    this.shipto = shipto;
  }

  public OrderLine shiptoorgid(String shiptoorgid) {
    this.shiptoorgid = shiptoorgid;
    return this;
  }

  /**
   * Get shiptoorgid
   * @return shiptoorgid
  */
  
  @Schema(name = "shiptoorgid", required = false)
  public String getShiptoorgid() {
    return shiptoorgid;
  }

  public void setShiptoorgid(String shiptoorgid) {
    this.shiptoorgid = shiptoorgid;
  }

  public OrderLine soldfrom(String soldfrom) {
    this.soldfrom = soldfrom;
    return this;
  }

  /**
   * Get soldfrom
   * @return soldfrom
  */
  
  @Schema(name = "soldfrom", required = false)
  public String getSoldfrom() {
    return soldfrom;
  }

  public void setSoldfrom(String soldfrom) {
    this.soldfrom = soldfrom;
  }

  public OrderLine soldfromorgid(Long soldfromorgid) {
    this.soldfromorgid = soldfromorgid;
    return this;
  }

  /**
   * Get soldfromorgid
   * @return soldfromorgid
  */
  
  @Schema(name = "soldfromorgid", required = false)
  public Long getSoldfromorgid() {
    return soldfromorgid;
  }

  public void setSoldfromorgid(Long soldfromorgid) {
    this.soldfromorgid = soldfromorgid;
  }

  public OrderLine soldto(String soldto) {
    this.soldto = soldto;
    return this;
  }

  /**
   * Get soldto
   * @return soldto
  */
  
  @Schema(name = "soldto", required = false)
  public String getSoldto() {
    return soldto;
  }

  public void setSoldto(String soldto) {
    this.soldto = soldto;
  }

  public OrderLine soldtoorgid(Long soldtoorgid) {
    this.soldtoorgid = soldtoorgid;
    return this;
  }

  /**
   * Get soldtoorgid
   * @return soldtoorgid
  */
  
  @Schema(name = "soldtoorgid", required = false)
  public Long getSoldtoorgid() {
    return soldtoorgid;
  }

  public void setSoldtoorgid(Long soldtoorgid) {
    this.soldtoorgid = soldtoorgid;
  }

  public OrderLine subinventory(String subinventory) {
    this.subinventory = subinventory;
    return this;
  }

  /**
   * Get subinventory
   * @return subinventory
  */
  
  @Schema(name = "subinventory", required = false)
  public String getSubinventory() {
    return subinventory;
  }

  public void setSubinventory(String subinventory) {
    this.subinventory = subinventory;
  }

  public OrderLine tppcostperunit(Float tppcostperunit) {
    this.tppcostperunit = tppcostperunit;
    return this;
  }

  /**
   * Get tppcostperunit
   * @return tppcostperunit
  */
  
  @Schema(name = "tppcostperunit", required = false)
  public Float getTppcostperunit() {
    return tppcostperunit;
  }

  public void setTppcostperunit(Float tppcostperunit) {
    this.tppcostperunit = tppcostperunit;
  }

  public OrderLine treaddepth(String treaddepth) {
    this.treaddepth = treaddepth;
    return this;
  }

  /**
   * Get treaddepth
   * @return treaddepth
  */
  
  @Schema(name = "treaddepth", required = false)
  public String getTreaddepth() {
    return treaddepth;
  }

  public void setTreaddepth(String treaddepth) {
    this.treaddepth = treaddepth;
  }

  public OrderLine unitlistprice(Float unitlistprice) {
    this.unitlistprice = unitlistprice;
    return this;
  }

  /**
   * Get unitlistprice
   * @return unitlistprice
  */
  
  @Schema(name = "unitlistprice", required = false)
  public Float getUnitlistprice() {
    return unitlistprice;
  }

  public void setUnitlistprice(Float unitlistprice) {
    this.unitlistprice = unitlistprice;
  }

  public OrderLine unitsellingprice(Float unitsellingprice) {
    this.unitsellingprice = unitsellingprice;
    return this;
  }

  /**
   * Get unitsellingprice
   * @return unitsellingprice
  */
  
  @Schema(name = "unitsellingprice", required = false)
  public Float getUnitsellingprice() {
    return unitsellingprice;
  }

  public void setUnitsellingprice(Float unitsellingprice) {
    this.unitsellingprice = unitsellingprice;
  }

  public OrderLine updateflag(String updateflag) {
    this.updateflag = updateflag;
    return this;
  }

  /**
   * Get updateflag
   * @return updateflag
  */
  
  @Schema(name = "updateflag", required = false)
  public String getUpdateflag() {
    return updateflag;
  }

  public void setUpdateflag(String updateflag) {
    this.updateflag = updateflag;
  }

  public OrderLine useritemdescription(String useritemdescription) {
    this.useritemdescription = useritemdescription;
    return this;
  }

  /**
   * Get useritemdescription
   * @return useritemdescription
  */
  
  @Schema(name = "useritemdescription", required = false)
  public String getUseritemdescription() {
    return useritemdescription;
  }

  public void setUseritemdescription(String useritemdescription) {
    this.useritemdescription = useritemdescription;
  }

  public OrderLine vendorlocation(String vendorlocation) {
    this.vendorlocation = vendorlocation;
    return this;
  }

  /**
   * Get vendorlocation
   * @return vendorlocation
  */
  
  @Schema(name = "vendorlocation", required = false)
  public String getVendorlocation() {
    return vendorlocation;
  }

  public void setVendorlocation(String vendorlocation) {
    this.vendorlocation = vendorlocation;
  }

  public OrderLine vendorname(String vendorname) {
    this.vendorname = vendorname;
    return this;
  }

  /**
   * Get vendorname
   * @return vendorname
  */
  
  @Schema(name = "vendorname", required = false)
  public String getVendorname() {
    return vendorname;
  }

  public void setVendorname(String vendorname) {
    this.vendorname = vendorname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(this.actioncode, orderLine.actioncode) &&
        Objects.equals(this.attributes, orderLine.attributes) &&
        Objects.equals(this.bandagworkordernumber, orderLine.bandagworkordernumber) &&
        Objects.equals(this.bookedflag, orderLine.bookedflag) &&
        Objects.equals(this.calculatepriceflag, orderLine.calculatepriceflag) &&
        Objects.equals(this.cancelcomments, orderLine.cancelcomments) &&
        Objects.equals(this.cancelledflag, orderLine.cancelledflag) &&
        Objects.equals(this.cancelledquantity, orderLine.cancelledquantity) &&
        Objects.equals(this.carrierquotedfreightcost, orderLine.carrierquotedfreightcost) &&
        Objects.equals(this.changereason, orderLine.changereason) &&
        Objects.equals(this.claimnumber, orderLine.claimnumber) &&
        Objects.equals(this.consumerfreighthandling, orderLine.consumerfreighthandling) &&
        Objects.equals(this.consumersalesprice, orderLine.consumersalesprice) &&
        Objects.equals(this.consumersalestax, orderLine.consumersalestax) &&
        Objects.equals(this.context, orderLine.context) &&
        Objects.equals(this.contractnumber, orderLine.contractnumber) &&
        Objects.equals(this.couponcodediscount, orderLine.couponcodediscount) &&
        Objects.equals(this.createdby, orderLine.createdby) &&
        Objects.equals(this.creationdate, orderLine.creationdate) &&
        Objects.equals(this.customerReservedQty, orderLine.customerReservedQty) &&
        Objects.equals(this.customeritemnetprice, orderLine.customeritemnetprice) &&
        Objects.equals(this.customerlinenumber, orderLine.customerlinenumber) &&
        Objects.equals(this.customerorderlinenumber, orderLine.customerorderlinenumber) &&
        Objects.equals(this.customerordernumber, orderLine.customerordernumber) &&
        Objects.equals(this.customerpartnumber, orderLine.customerpartnumber) &&
        Objects.equals(this.custpolinenumber, orderLine.custpolinenumber) &&
        Objects.equals(this.custponumber, orderLine.custponumber) &&
        Objects.equals(this.dealerSoldTo, orderLine.dealerSoldTo) &&
        Objects.equals(this.deliverto, orderLine.deliverto) &&
        Objects.equals(this.delivertoorgid, orderLine.delivertoorgid) &&
        Objects.equals(this.deliveryleadtime, orderLine.deliveryleadtime) &&
        Objects.equals(this.dotnumber, orderLine.dotnumber) &&
        Objects.equals(this.edigtin, orderLine.edigtin) &&
        Objects.equals(this.expectedresvqty, orderLine.expectedresvqty) &&
        Objects.equals(this.fetexemption, orderLine.fetexemption) &&
        Objects.equals(this.flowstatuscode, orderLine.flowstatuscode) &&
        Objects.equals(this.fobpointcode, orderLine.fobpointcode) &&
        Objects.equals(this.fobpointmeaning, orderLine.fobpointmeaning) &&
        Objects.equals(this.freightamount, orderLine.freightamount) &&
        Objects.equals(this.freightcarriercode, orderLine.freightcarriercode) &&
        Objects.equals(this.freightcarriermeaning, orderLine.freightcarriermeaning) &&
        Objects.equals(this.freighttermscode, orderLine.freighttermscode) &&
        Objects.equals(this.freighttermsmeaning, orderLine.freighttermsmeaning) &&
        Objects.equals(this.fulfillmentmethod, orderLine.fulfillmentmethod) &&
        Objects.equals(this.headerid, orderLine.headerid) &&
        Objects.equals(this.holdflag, orderLine.holdflag) &&
        Objects.equals(this.holdnamedff, orderLine.holdnamedff) &&
        Objects.equals(this.inventoryitemid, orderLine.inventoryitemid) &&
        Objects.equals(this.invoiceto, orderLine.invoiceto) &&
        Objects.equals(this.invoicetoorgid, orderLine.invoicetoorgid) &&
        Objects.equals(this.isoline, orderLine.isoline) &&
        Objects.equals(this.isoordernumber, orderLine.isoordernumber) &&
        Objects.equals(this.itemnumber, orderLine.itemnumber) &&
        Objects.equals(this.lastupdatedate, orderLine.lastupdatedate) &&
        Objects.equals(this.lastupdatedby, orderLine.lastupdatedby) &&
        Objects.equals(this.latestacceptabledate, orderLine.latestacceptabledate) &&
        Objects.equals(this.linecategorycode, orderLine.linecategorycode) &&
        Objects.equals(this.lineid, orderLine.lineid) &&
        Objects.equals(this.linenumber, orderLine.linenumber) &&
        Objects.equals(this.linetypecode, orderLine.linetypecode) &&
        Objects.equals(this.linetypeid, orderLine.linetypeid) &&
        Objects.equals(this.linetypemeaning, orderLine.linetypemeaning) &&
        Objects.equals(this.mileage, orderLine.mileage) &&
        Objects.equals(this.naprogramnumber, orderLine.naprogramnumber) &&
        Objects.equals(this.openflag, orderLine.openflag) &&
        Objects.equals(this.orderedquantity, orderLine.orderedquantity) &&
        Objects.equals(this.ordernumber, orderLine.ordernumber) &&
        Objects.equals(this.orderquantityuom, orderLine.orderquantityuom) &&
        Objects.equals(this.orderunitofmeasure, orderLine.orderunitofmeasure) &&
        Objects.equals(this.orgid, orderLine.orgid) &&
        Objects.equals(this.origsysdocumentref, orderLine.origsysdocumentref) &&
        Objects.equals(this.origsyslineref, orderLine.origsyslineref) &&
        Objects.equals(this.packinginstructions, orderLine.packinginstructions) &&
        Objects.equals(this.paymenttermid, orderLine.paymenttermid) &&
        Objects.equals(this.paymenttermmeaning, orderLine.paymenttermmeaning) &&
        Objects.equals(this.paymenttypecode, orderLine.paymenttypecode) &&
        Objects.equals(this.paymenttypemeaning, orderLine.paymenttypemeaning) &&
        Objects.equals(this.pickupDcOrgId, orderLine.pickupDcOrgId) &&
        Objects.equals(this.poxshipflag, orderLine.poxshipflag) &&
        Objects.equals(this.poxshipnotes, orderLine.poxshipnotes) &&
        Objects.equals(this.pricelistid, orderLine.pricelistid) &&
        Objects.equals(this.pricelistname, orderLine.pricelistname) &&
        Objects.equals(this.pricingdate, orderLine.pricingdate) &&
        Objects.equals(this.prioritypickup, orderLine.prioritypickup) &&
        Objects.equals(this.processeddate, orderLine.processeddate) &&
        Objects.equals(this.processedmessage, orderLine.processedmessage) &&
        Objects.equals(this.processflag, orderLine.processflag) &&
        Objects.equals(this.producttype, orderLine.producttype) &&
        Objects.equals(this.promiseddate, orderLine.promiseddate) &&
        Objects.equals(this.reason, orderLine.reason) &&
        Objects.equals(this.referenceheaderid, orderLine.referenceheaderid) &&
        Objects.equals(this.referencelineid, orderLine.referencelineid) &&
        Objects.equals(this.referencetype, orderLine.referencetype) &&
        Objects.equals(this.restockingfee, orderLine.restockingfee) &&
        Objects.equals(this.returnattribute1, orderLine.returnattribute1) &&
        Objects.equals(this.returnattribute2, orderLine.returnattribute2) &&
        Objects.equals(this.returncontext, orderLine.returncontext) &&
        Objects.equals(this.returnreasoncode, orderLine.returnreasoncode) &&
        Objects.equals(this.route, orderLine.route) &&
        Objects.equals(this.routesequence, orderLine.routesequence) &&
        Objects.equals(this.salesperson, orderLine.salesperson) &&
        Objects.equals(this.salesrepid, orderLine.salesrepid) &&
        Objects.equals(this.schedulearrivaldate, orderLine.schedulearrivaldate) &&
        Objects.equals(this.scheduledshipdate, orderLine.scheduledshipdate) &&
        Objects.equals(this.shipfrom, orderLine.shipfrom) &&
        Objects.equals(this.shipfromorgid, orderLine.shipfromorgid) &&
        Objects.equals(this.shipmentprioritycode, orderLine.shipmentprioritycode) &&
        Objects.equals(this.shipmentprioritymeaning, orderLine.shipmentprioritymeaning) &&
        Objects.equals(this.shippedquantity, orderLine.shippedquantity) &&
        Objects.equals(this.shippingDcOrgId, orderLine.shippingDcOrgId) &&
        Objects.equals(this.shippinginstructions, orderLine.shippinginstructions) &&
        Objects.equals(this.shippingmethodcode, orderLine.shippingmethodcode) &&
        Objects.equals(this.shippingmethodmeaning, orderLine.shippingmethodmeaning) &&
        Objects.equals(this.shipsetid, orderLine.shipsetid) &&
        Objects.equals(this.shipto, orderLine.shipto) &&
        Objects.equals(this.shiptoorgid, orderLine.shiptoorgid) &&
        Objects.equals(this.soldfrom, orderLine.soldfrom) &&
        Objects.equals(this.soldfromorgid, orderLine.soldfromorgid) &&
        Objects.equals(this.soldto, orderLine.soldto) &&
        Objects.equals(this.soldtoorgid, orderLine.soldtoorgid) &&
        Objects.equals(this.subinventory, orderLine.subinventory) &&
        Objects.equals(this.tppcostperunit, orderLine.tppcostperunit) &&
        Objects.equals(this.treaddepth, orderLine.treaddepth) &&
        Objects.equals(this.unitlistprice, orderLine.unitlistprice) &&
        Objects.equals(this.unitsellingprice, orderLine.unitsellingprice) &&
        Objects.equals(this.updateflag, orderLine.updateflag) &&
        Objects.equals(this.useritemdescription, orderLine.useritemdescription) &&
        Objects.equals(this.vendorlocation, orderLine.vendorlocation) &&
        Objects.equals(this.vendorname, orderLine.vendorname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actioncode, attributes, bandagworkordernumber, bookedflag, calculatepriceflag, cancelcomments, cancelledflag, cancelledquantity, carrierquotedfreightcost, changereason, claimnumber, consumerfreighthandling, consumersalesprice, consumersalestax, context, contractnumber, couponcodediscount, createdby, creationdate, customerReservedQty, customeritemnetprice, customerlinenumber, customerorderlinenumber, customerordernumber, customerpartnumber, custpolinenumber, custponumber, dealerSoldTo, deliverto, delivertoorgid, deliveryleadtime, dotnumber, edigtin, expectedresvqty, fetexemption, flowstatuscode, fobpointcode, fobpointmeaning, freightamount, freightcarriercode, freightcarriermeaning, freighttermscode, freighttermsmeaning, fulfillmentmethod, headerid, holdflag, holdnamedff, inventoryitemid, invoiceto, invoicetoorgid, isoline, isoordernumber, itemnumber, lastupdatedate, lastupdatedby, latestacceptabledate, linecategorycode, lineid, linenumber, linetypecode, linetypeid, linetypemeaning, mileage, naprogramnumber, openflag, orderedquantity, ordernumber, orderquantityuom, orderunitofmeasure, orgid, origsysdocumentref, origsyslineref, packinginstructions, paymenttermid, paymenttermmeaning, paymenttypecode, paymenttypemeaning, pickupDcOrgId, poxshipflag, poxshipnotes, pricelistid, pricelistname, pricingdate, prioritypickup, processeddate, processedmessage, processflag, producttype, promiseddate, reason, referenceheaderid, referencelineid, referencetype, restockingfee, returnattribute1, returnattribute2, returncontext, returnreasoncode, route, routesequence, salesperson, salesrepid, schedulearrivaldate, scheduledshipdate, shipfrom, shipfromorgid, shipmentprioritycode, shipmentprioritymeaning, shippedquantity, shippingDcOrgId, shippinginstructions, shippingmethodcode, shippingmethodmeaning, shipsetid, shipto, shiptoorgid, soldfrom, soldfromorgid, soldto, soldtoorgid, subinventory, tppcostperunit, treaddepth, unitlistprice, unitsellingprice, updateflag, useritemdescription, vendorlocation, vendorname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    sb.append("    actioncode: ").append(toIndentedString(actioncode)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    bandagworkordernumber: ").append(toIndentedString(bandagworkordernumber)).append("\n");
    sb.append("    bookedflag: ").append(toIndentedString(bookedflag)).append("\n");
    sb.append("    calculatepriceflag: ").append(toIndentedString(calculatepriceflag)).append("\n");
    sb.append("    cancelcomments: ").append(toIndentedString(cancelcomments)).append("\n");
    sb.append("    cancelledflag: ").append(toIndentedString(cancelledflag)).append("\n");
    sb.append("    cancelledquantity: ").append(toIndentedString(cancelledquantity)).append("\n");
    sb.append("    carrierquotedfreightcost: ").append(toIndentedString(carrierquotedfreightcost)).append("\n");
    sb.append("    changereason: ").append(toIndentedString(changereason)).append("\n");
    sb.append("    claimnumber: ").append(toIndentedString(claimnumber)).append("\n");
    sb.append("    consumerfreighthandling: ").append(toIndentedString(consumerfreighthandling)).append("\n");
    sb.append("    consumersalesprice: ").append(toIndentedString(consumersalesprice)).append("\n");
    sb.append("    consumersalestax: ").append(toIndentedString(consumersalestax)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contractnumber: ").append(toIndentedString(contractnumber)).append("\n");
    sb.append("    couponcodediscount: ").append(toIndentedString(couponcodediscount)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    creationdate: ").append(toIndentedString(creationdate)).append("\n");
    sb.append("    customerReservedQty: ").append(toIndentedString(customerReservedQty)).append("\n");
    sb.append("    customeritemnetprice: ").append(toIndentedString(customeritemnetprice)).append("\n");
    sb.append("    customerlinenumber: ").append(toIndentedString(customerlinenumber)).append("\n");
    sb.append("    customerorderlinenumber: ").append(toIndentedString(customerorderlinenumber)).append("\n");
    sb.append("    customerordernumber: ").append(toIndentedString(customerordernumber)).append("\n");
    sb.append("    customerpartnumber: ").append(toIndentedString(customerpartnumber)).append("\n");
    sb.append("    custpolinenumber: ").append(toIndentedString(custpolinenumber)).append("\n");
    sb.append("    custponumber: ").append(toIndentedString(custponumber)).append("\n");
    sb.append("    dealerSoldTo: ").append(toIndentedString(dealerSoldTo)).append("\n");
    sb.append("    deliverto: ").append(toIndentedString(deliverto)).append("\n");
    sb.append("    delivertoorgid: ").append(toIndentedString(delivertoorgid)).append("\n");
    sb.append("    deliveryleadtime: ").append(toIndentedString(deliveryleadtime)).append("\n");
    sb.append("    dotnumber: ").append(toIndentedString(dotnumber)).append("\n");
    sb.append("    edigtin: ").append(toIndentedString(edigtin)).append("\n");
    sb.append("    expectedresvqty: ").append(toIndentedString(expectedresvqty)).append("\n");
    sb.append("    fetexemption: ").append(toIndentedString(fetexemption)).append("\n");
    sb.append("    flowstatuscode: ").append(toIndentedString(flowstatuscode)).append("\n");
    sb.append("    fobpointcode: ").append(toIndentedString(fobpointcode)).append("\n");
    sb.append("    fobpointmeaning: ").append(toIndentedString(fobpointmeaning)).append("\n");
    sb.append("    freightamount: ").append(toIndentedString(freightamount)).append("\n");
    sb.append("    freightcarriercode: ").append(toIndentedString(freightcarriercode)).append("\n");
    sb.append("    freightcarriermeaning: ").append(toIndentedString(freightcarriermeaning)).append("\n");
    sb.append("    freighttermscode: ").append(toIndentedString(freighttermscode)).append("\n");
    sb.append("    freighttermsmeaning: ").append(toIndentedString(freighttermsmeaning)).append("\n");
    sb.append("    fulfillmentmethod: ").append(toIndentedString(fulfillmentmethod)).append("\n");
    sb.append("    headerid: ").append(toIndentedString(headerid)).append("\n");
    sb.append("    holdflag: ").append(toIndentedString(holdflag)).append("\n");
    sb.append("    holdnamedff: ").append(toIndentedString(holdnamedff)).append("\n");
    sb.append("    inventoryitemid: ").append(toIndentedString(inventoryitemid)).append("\n");
    sb.append("    invoiceto: ").append(toIndentedString(invoiceto)).append("\n");
    sb.append("    invoicetoorgid: ").append(toIndentedString(invoicetoorgid)).append("\n");
    sb.append("    isoline: ").append(toIndentedString(isoline)).append("\n");
    sb.append("    isoordernumber: ").append(toIndentedString(isoordernumber)).append("\n");
    sb.append("    itemnumber: ").append(toIndentedString(itemnumber)).append("\n");
    sb.append("    lastupdatedate: ").append(toIndentedString(lastupdatedate)).append("\n");
    sb.append("    lastupdatedby: ").append(toIndentedString(lastupdatedby)).append("\n");
    sb.append("    latestacceptabledate: ").append(toIndentedString(latestacceptabledate)).append("\n");
    sb.append("    linecategorycode: ").append(toIndentedString(linecategorycode)).append("\n");
    sb.append("    lineid: ").append(toIndentedString(lineid)).append("\n");
    sb.append("    linenumber: ").append(toIndentedString(linenumber)).append("\n");
    sb.append("    linetypecode: ").append(toIndentedString(linetypecode)).append("\n");
    sb.append("    linetypeid: ").append(toIndentedString(linetypeid)).append("\n");
    sb.append("    linetypemeaning: ").append(toIndentedString(linetypemeaning)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    naprogramnumber: ").append(toIndentedString(naprogramnumber)).append("\n");
    sb.append("    openflag: ").append(toIndentedString(openflag)).append("\n");
    sb.append("    orderedquantity: ").append(toIndentedString(orderedquantity)).append("\n");
    sb.append("    ordernumber: ").append(toIndentedString(ordernumber)).append("\n");
    sb.append("    orderquantityuom: ").append(toIndentedString(orderquantityuom)).append("\n");
    sb.append("    orderunitofmeasure: ").append(toIndentedString(orderunitofmeasure)).append("\n");
    sb.append("    orgid: ").append(toIndentedString(orgid)).append("\n");
    sb.append("    origsysdocumentref: ").append(toIndentedString(origsysdocumentref)).append("\n");
    sb.append("    origsyslineref: ").append(toIndentedString(origsyslineref)).append("\n");
    sb.append("    packinginstructions: ").append(toIndentedString(packinginstructions)).append("\n");
    sb.append("    paymenttermid: ").append(toIndentedString(paymenttermid)).append("\n");
    sb.append("    paymenttermmeaning: ").append(toIndentedString(paymenttermmeaning)).append("\n");
    sb.append("    paymenttypecode: ").append(toIndentedString(paymenttypecode)).append("\n");
    sb.append("    paymenttypemeaning: ").append(toIndentedString(paymenttypemeaning)).append("\n");
    sb.append("    pickupDcOrgId: ").append(toIndentedString(pickupDcOrgId)).append("\n");
    sb.append("    poxshipflag: ").append(toIndentedString(poxshipflag)).append("\n");
    sb.append("    poxshipnotes: ").append(toIndentedString(poxshipnotes)).append("\n");
    sb.append("    pricelistid: ").append(toIndentedString(pricelistid)).append("\n");
    sb.append("    pricelistname: ").append(toIndentedString(pricelistname)).append("\n");
    sb.append("    pricingdate: ").append(toIndentedString(pricingdate)).append("\n");
    sb.append("    prioritypickup: ").append(toIndentedString(prioritypickup)).append("\n");
    sb.append("    processeddate: ").append(toIndentedString(processeddate)).append("\n");
    sb.append("    processedmessage: ").append(toIndentedString(processedmessage)).append("\n");
    sb.append("    processflag: ").append(toIndentedString(processflag)).append("\n");
    sb.append("    producttype: ").append(toIndentedString(producttype)).append("\n");
    sb.append("    promiseddate: ").append(toIndentedString(promiseddate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    referenceheaderid: ").append(toIndentedString(referenceheaderid)).append("\n");
    sb.append("    referencelineid: ").append(toIndentedString(referencelineid)).append("\n");
    sb.append("    referencetype: ").append(toIndentedString(referencetype)).append("\n");
    sb.append("    restockingfee: ").append(toIndentedString(restockingfee)).append("\n");
    sb.append("    returnattribute1: ").append(toIndentedString(returnattribute1)).append("\n");
    sb.append("    returnattribute2: ").append(toIndentedString(returnattribute2)).append("\n");
    sb.append("    returncontext: ").append(toIndentedString(returncontext)).append("\n");
    sb.append("    returnreasoncode: ").append(toIndentedString(returnreasoncode)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    routesequence: ").append(toIndentedString(routesequence)).append("\n");
    sb.append("    salesperson: ").append(toIndentedString(salesperson)).append("\n");
    sb.append("    salesrepid: ").append(toIndentedString(salesrepid)).append("\n");
    sb.append("    schedulearrivaldate: ").append(toIndentedString(schedulearrivaldate)).append("\n");
    sb.append("    scheduledshipdate: ").append(toIndentedString(scheduledshipdate)).append("\n");
    sb.append("    shipfrom: ").append(toIndentedString(shipfrom)).append("\n");
    sb.append("    shipfromorgid: ").append(toIndentedString(shipfromorgid)).append("\n");
    sb.append("    shipmentprioritycode: ").append(toIndentedString(shipmentprioritycode)).append("\n");
    sb.append("    shipmentprioritymeaning: ").append(toIndentedString(shipmentprioritymeaning)).append("\n");
    sb.append("    shippedquantity: ").append(toIndentedString(shippedquantity)).append("\n");
    sb.append("    shippingDcOrgId: ").append(toIndentedString(shippingDcOrgId)).append("\n");
    sb.append("    shippinginstructions: ").append(toIndentedString(shippinginstructions)).append("\n");
    sb.append("    shippingmethodcode: ").append(toIndentedString(shippingmethodcode)).append("\n");
    sb.append("    shippingmethodmeaning: ").append(toIndentedString(shippingmethodmeaning)).append("\n");
    sb.append("    shipsetid: ").append(toIndentedString(shipsetid)).append("\n");
    sb.append("    shipto: ").append(toIndentedString(shipto)).append("\n");
    sb.append("    shiptoorgid: ").append(toIndentedString(shiptoorgid)).append("\n");
    sb.append("    soldfrom: ").append(toIndentedString(soldfrom)).append("\n");
    sb.append("    soldfromorgid: ").append(toIndentedString(soldfromorgid)).append("\n");
    sb.append("    soldto: ").append(toIndentedString(soldto)).append("\n");
    sb.append("    soldtoorgid: ").append(toIndentedString(soldtoorgid)).append("\n");
    sb.append("    subinventory: ").append(toIndentedString(subinventory)).append("\n");
    sb.append("    tppcostperunit: ").append(toIndentedString(tppcostperunit)).append("\n");
    sb.append("    treaddepth: ").append(toIndentedString(treaddepth)).append("\n");
    sb.append("    unitlistprice: ").append(toIndentedString(unitlistprice)).append("\n");
    sb.append("    unitsellingprice: ").append(toIndentedString(unitsellingprice)).append("\n");
    sb.append("    updateflag: ").append(toIndentedString(updateflag)).append("\n");
    sb.append("    useritemdescription: ").append(toIndentedString(useritemdescription)).append("\n");
    sb.append("    vendorlocation: ").append(toIndentedString(vendorlocation)).append("\n");
    sb.append("    vendorname: ").append(toIndentedString(vendorname)).append("\n");
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

