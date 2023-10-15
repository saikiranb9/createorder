package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.ZonedDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.ZonedDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ISOLine
 */

public class ISOLine {

  @JsonProperty("batchid")
  private Long batchid;

  @JsonProperty("cancelcomments")
  private String cancelcomments;

  @JsonProperty("categoryid")
  private Long categoryid;

  @JsonProperty("createdby")
  private Long createdby;

  @JsonProperty("creationdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime creationdate;

  @JsonProperty("delivertolocationid")
  private Long delivertolocationid;

  @JsonProperty("destinationorganizationid")
  private Long destinationorganizationid;

  @JsonProperty("destinationsubinventory")
  private String destinationsubinventory;

  @JsonProperty("employeeid")
  private Long employeeid;

  @JsonProperty("interfacesourcecode")
  private String interfacesourcecode;

  @JsonProperty("inventoryitemid")
  private Long inventoryitemid;

  @JsonProperty("isofuiid")
  private Long isofuiid;

  @JsonProperty("isoheaderid")
  private Long isoheaderid;

  @JsonProperty("isolineid")
  private Long isolineid;

  @JsonProperty("isoordernumber")
  private Long isoordernumber;

  @JsonProperty("isoreqid")
  private Long isoreqid;

  @JsonProperty("itemnumber")
  private String itemnumber;

  @JsonProperty("languagecode")
  private String languagecode;

  @JsonProperty("lastupdatedate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime lastupdatedate;

  @JsonProperty("lastupdatedby")
  private Long lastupdatedby;

  @JsonProperty("linesetheader")
  private String linesetheader;

  @JsonProperty("needbydate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime needbydate;

  @JsonProperty("ordercomments")
  private String ordercomments;

  @JsonProperty("orgid")
  private Long orgid;

  @JsonProperty("pickupDcOrgId")
  private String pickupDcOrgId;

  @JsonProperty("processbatchid")
  private Long processbatchid;

  @JsonProperty("processedmessage")
  private String processedmessage;

  @JsonProperty("processflag")
  private String processflag;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("requisitionheaderid")
  private Long requisitionheaderid;

  @JsonProperty("requisitionlineid")
  private Long requisitionlineid;

  @JsonProperty("requisitiontype")
  private String requisitiontype;

  @JsonProperty("routeid")
  private String routeid;

  @JsonProperty("routesequence")
  private String routesequence;

  @JsonProperty("salesorder")
  private Long salesorder;

  @JsonProperty("salesorderlineno")
  private Long salesorderlineno;

  @JsonProperty("salesordershipmentno")
  private Long salesordershipmentno;

  @JsonProperty("shipmentprioritycode")
  private String shipmentprioritycode;

  @JsonProperty("shippingDcOrgId")
  private String shippingDcOrgId;

  @JsonProperty("shippinginstructions")
  private String shippinginstructions;

  @JsonProperty("shippingmethodcode")
  private String shippingmethodcode;

  @JsonProperty("shipsetline")
  private Long shipsetline;

  @JsonProperty("sourceorganizationid")
  private Long sourceorganizationid;

  @JsonProperty("sourcesubinventory")
  private String sourcesubinventory;

  @JsonProperty("transactionid")
  private Long transactionid;

  @JsonProperty("uomcode")
  private String uomcode;

  @JsonProperty("vendorid")
  private Long vendorid;

  @JsonProperty("vendorlocation")
  private String vendorlocation;

  @JsonProperty("vendorname")
  private String vendorname;

  @JsonProperty("vendorsiteid")
  private Long vendorsiteid;

  public ISOLine batchid(Long batchid) {
    this.batchid = batchid;
    return this;
  }

  /**
   * Get batchid
   * @return batchid
  */
  
  @Schema(name = "batchid", required = false)
  public Long getBatchid() {
    return batchid;
  }

  public void setBatchid(Long batchid) {
    this.batchid = batchid;
  }

  public ISOLine cancelcomments(String cancelcomments) {
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

  public ISOLine categoryid(Long categoryid) {
    this.categoryid = categoryid;
    return this;
  }

  /**
   * Get categoryid
   * @return categoryid
  */
  
  @Schema(name = "categoryid", required = false)
  public Long getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(Long categoryid) {
    this.categoryid = categoryid;
  }

  public ISOLine createdby(Long createdby) {
    this.createdby = createdby;
    return this;
  }

  /**
   * Get createdby
   * @return createdby
  */
  
  @Schema(name = "createdby", required = false)
  public Long getCreatedby() {
    return createdby;
  }

  public void setCreatedby(Long createdby) {
    this.createdby = createdby;
  }

  public ISOLine creationdate(ZonedDateTime creationdate) {
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

  public ISOLine delivertolocationid(Long delivertolocationid) {
    this.delivertolocationid = delivertolocationid;
    return this;
  }

  /**
   * Get delivertolocationid
   * @return delivertolocationid
  */
  
  @Schema(name = "delivertolocationid", required = false)
  public Long getDelivertolocationid() {
    return delivertolocationid;
  }

  public void setDelivertolocationid(Long delivertolocationid) {
    this.delivertolocationid = delivertolocationid;
  }

  public ISOLine destinationorganizationid(Long destinationorganizationid) {
    this.destinationorganizationid = destinationorganizationid;
    return this;
  }

  /**
   * Get destinationorganizationid
   * @return destinationorganizationid
  */
  
  @Schema(name = "destinationorganizationid", required = false)
  public Long getDestinationorganizationid() {
    return destinationorganizationid;
  }

  public void setDestinationorganizationid(Long destinationorganizationid) {
    this.destinationorganizationid = destinationorganizationid;
  }

  public ISOLine destinationsubinventory(String destinationsubinventory) {
    this.destinationsubinventory = destinationsubinventory;
    return this;
  }

  /**
   * Get destinationsubinventory
   * @return destinationsubinventory
  */
  
  @Schema(name = "destinationsubinventory", required = false)
  public String getDestinationsubinventory() {
    return destinationsubinventory;
  }

  public void setDestinationsubinventory(String destinationsubinventory) {
    this.destinationsubinventory = destinationsubinventory;
  }

  public ISOLine employeeid(Long employeeid) {
    this.employeeid = employeeid;
    return this;
  }

  /**
   * Get employeeid
   * @return employeeid
  */
  
  @Schema(name = "employeeid", required = false)
  public Long getEmployeeid() {
    return employeeid;
  }

  public void setEmployeeid(Long employeeid) {
    this.employeeid = employeeid;
  }

  public ISOLine interfacesourcecode(String interfacesourcecode) {
    this.interfacesourcecode = interfacesourcecode;
    return this;
  }

  /**
   * Get interfacesourcecode
   * @return interfacesourcecode
  */
  
  @Schema(name = "interfacesourcecode", required = false)
  public String getInterfacesourcecode() {
    return interfacesourcecode;
  }

  public void setInterfacesourcecode(String interfacesourcecode) {
    this.interfacesourcecode = interfacesourcecode;
  }

  public ISOLine inventoryitemid(Long inventoryitemid) {
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

  public ISOLine isofuiid(Long isofuiid) {
    this.isofuiid = isofuiid;
    return this;
  }

  /**
   * Get isofuiid
   * @return isofuiid
  */
  
  @Schema(name = "isofuiid", required = false)
  public Long getIsofuiid() {
    return isofuiid;
  }

  public void setIsofuiid(Long isofuiid) {
    this.isofuiid = isofuiid;
  }

  public ISOLine isoheaderid(Long isoheaderid) {
    this.isoheaderid = isoheaderid;
    return this;
  }

  /**
   * Get isoheaderid
   * @return isoheaderid
  */
  
  @Schema(name = "isoheaderid", required = false)
  public Long getIsoheaderid() {
    return isoheaderid;
  }

  public void setIsoheaderid(Long isoheaderid) {
    this.isoheaderid = isoheaderid;
  }

  public ISOLine isolineid(Long isolineid) {
    this.isolineid = isolineid;
    return this;
  }

  /**
   * Get isolineid
   * @return isolineid
  */
  
  @Schema(name = "isolineid", required = false)
  public Long getIsolineid() {
    return isolineid;
  }

  public void setIsolineid(Long isolineid) {
    this.isolineid = isolineid;
  }

  public ISOLine isoordernumber(Long isoordernumber) {
    this.isoordernumber = isoordernumber;
    return this;
  }

  /**
   * Get isoordernumber
   * @return isoordernumber
  */
  
  @Schema(name = "isoordernumber", required = false)
  public Long getIsoordernumber() {
    return isoordernumber;
  }

  public void setIsoordernumber(Long isoordernumber) {
    this.isoordernumber = isoordernumber;
  }

  public ISOLine isoreqid(Long isoreqid) {
    this.isoreqid = isoreqid;
    return this;
  }

  /**
   * Get isoreqid
   * @return isoreqid
  */
  
  @Schema(name = "isoreqid", required = false)
  public Long getIsoreqid() {
    return isoreqid;
  }

  public void setIsoreqid(Long isoreqid) {
    this.isoreqid = isoreqid;
  }

  public ISOLine itemnumber(String itemnumber) {
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

  public ISOLine languagecode(String languagecode) {
    this.languagecode = languagecode;
    return this;
  }

  /**
   * Get languagecode
   * @return languagecode
  */
  
  @Schema(name = "languagecode", required = false)
  public String getLanguagecode() {
    return languagecode;
  }

  public void setLanguagecode(String languagecode) {
    this.languagecode = languagecode;
  }

  public ISOLine lastupdatedate(ZonedDateTime lastupdatedate) {
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

  public ISOLine lastupdatedby(Long lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
    return this;
  }

  /**
   * Get lastupdatedby
   * @return lastupdatedby
  */
  
  @Schema(name = "lastupdatedby", required = false)
  public Long getLastupdatedby() {
    return lastupdatedby;
  }

  public void setLastupdatedby(Long lastupdatedby) {
    this.lastupdatedby = lastupdatedby;
  }

  public ISOLine linesetheader(String linesetheader) {
    this.linesetheader = linesetheader;
    return this;
  }

  /**
   * Get linesetheader
   * @return linesetheader
  */
  
  @Schema(name = "linesetheader", required = false)
  public String getLinesetheader() {
    return linesetheader;
  }

  public void setLinesetheader(String linesetheader) {
    this.linesetheader = linesetheader;
  }

  public ISOLine needbydate(ZonedDateTime needbydate) {
    this.needbydate = needbydate;
    return this;
  }

  /**
   * Get needbydate
   * @return needbydate
  */
  @Valid 
  @Schema(name = "needbydate", required = false)
  public ZonedDateTime getNeedbydate() {
    return needbydate;
  }

  public void setNeedbydate(ZonedDateTime needbydate) {
    this.needbydate = needbydate;
  }

  public ISOLine ordercomments(String ordercomments) {
    this.ordercomments = ordercomments;
    return this;
  }

  /**
   * Get ordercomments
   * @return ordercomments
  */
  
  @Schema(name = "ordercomments", required = false)
  public String getOrdercomments() {
    return ordercomments;
  }

  public void setOrdercomments(String ordercomments) {
    this.ordercomments = ordercomments;
  }

  public ISOLine orgid(Long orgid) {
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

  public ISOLine pickupDcOrgId(String pickupDcOrgId) {
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

  public ISOLine processbatchid(Long processbatchid) {
    this.processbatchid = processbatchid;
    return this;
  }

  /**
   * Get processbatchid
   * @return processbatchid
  */
  
  @Schema(name = "processbatchid", required = false)
  public Long getProcessbatchid() {
    return processbatchid;
  }

  public void setProcessbatchid(Long processbatchid) {
    this.processbatchid = processbatchid;
  }

  public ISOLine processedmessage(String processedmessage) {
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

  public ISOLine processflag(String processflag) {
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

  public ISOLine quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", required = false)
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public ISOLine requisitionheaderid(Long requisitionheaderid) {
    this.requisitionheaderid = requisitionheaderid;
    return this;
  }

  /**
   * Get requisitionheaderid
   * @return requisitionheaderid
  */
  
  @Schema(name = "requisitionheaderid", required = false)
  public Long getRequisitionheaderid() {
    return requisitionheaderid;
  }

  public void setRequisitionheaderid(Long requisitionheaderid) {
    this.requisitionheaderid = requisitionheaderid;
  }

  public ISOLine requisitionlineid(Long requisitionlineid) {
    this.requisitionlineid = requisitionlineid;
    return this;
  }

  /**
   * Get requisitionlineid
   * @return requisitionlineid
  */
  
  @Schema(name = "requisitionlineid", required = false)
  public Long getRequisitionlineid() {
    return requisitionlineid;
  }

  public void setRequisitionlineid(Long requisitionlineid) {
    this.requisitionlineid = requisitionlineid;
  }

  public ISOLine requisitiontype(String requisitiontype) {
    this.requisitiontype = requisitiontype;
    return this;
  }

  /**
   * Get requisitiontype
   * @return requisitiontype
  */
  
  @Schema(name = "requisitiontype", required = false)
  public String getRequisitiontype() {
    return requisitiontype;
  }

  public void setRequisitiontype(String requisitiontype) {
    this.requisitiontype = requisitiontype;
  }

  public ISOLine routeid(String routeid) {
    this.routeid = routeid;
    return this;
  }

  /**
   * Get routeid
   * @return routeid
  */
  
  @Schema(name = "routeid", required = false)
  public String getRouteid() {
    return routeid;
  }

  public void setRouteid(String routeid) {
    this.routeid = routeid;
  }

  public ISOLine routesequence(String routesequence) {
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

  public ISOLine salesorder(Long salesorder) {
    this.salesorder = salesorder;
    return this;
  }

  /**
   * Get salesorder
   * @return salesorder
  */
  
  @Schema(name = "salesorder", required = false)
  public Long getSalesorder() {
    return salesorder;
  }

  public void setSalesorder(Long salesorder) {
    this.salesorder = salesorder;
  }

  public ISOLine salesorderlineno(Long salesorderlineno) {
    this.salesorderlineno = salesorderlineno;
    return this;
  }

  /**
   * Get salesorderlineno
   * @return salesorderlineno
  */
  
  @Schema(name = "salesorderlineno", required = false)
  public Long getSalesorderlineno() {
    return salesorderlineno;
  }

  public void setSalesorderlineno(Long salesorderlineno) {
    this.salesorderlineno = salesorderlineno;
  }

  public ISOLine salesordershipmentno(Long salesordershipmentno) {
    this.salesordershipmentno = salesordershipmentno;
    return this;
  }

  /**
   * Get salesordershipmentno
   * @return salesordershipmentno
  */
  
  @Schema(name = "salesordershipmentno", required = false)
  public Long getSalesordershipmentno() {
    return salesordershipmentno;
  }

  public void setSalesordershipmentno(Long salesordershipmentno) {
    this.salesordershipmentno = salesordershipmentno;
  }

  public ISOLine shipmentprioritycode(String shipmentprioritycode) {
    this.shipmentprioritycode = shipmentprioritycode;
    return this;
  }

  /**
   * Get shipmentprioritycode
   * @return shipmentprioritycode
  */
  
  @Schema(name = "shipmentprioritycode", required = false)
  public String getShipmentprioritycode() {
    return shipmentprioritycode;
  }

  public void setShipmentprioritycode(String shipmentprioritycode) {
    this.shipmentprioritycode = shipmentprioritycode;
  }

  public ISOLine shippingDcOrgId(String shippingDcOrgId) {
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

  public ISOLine shippinginstructions(String shippinginstructions) {
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

  public ISOLine shippingmethodcode(String shippingmethodcode) {
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

  public ISOLine shipsetline(Long shipsetline) {
    this.shipsetline = shipsetline;
    return this;
  }

  /**
   * Get shipsetline
   * @return shipsetline
  */
  
  @Schema(name = "shipsetline", required = false)
  public Long getShipsetline() {
    return shipsetline;
  }

  public void setShipsetline(Long shipsetline) {
    this.shipsetline = shipsetline;
  }

  public ISOLine sourceorganizationid(Long sourceorganizationid) {
    this.sourceorganizationid = sourceorganizationid;
    return this;
  }

  /**
   * Get sourceorganizationid
   * @return sourceorganizationid
  */
  
  @Schema(name = "sourceorganizationid", required = false)
  public Long getSourceorganizationid() {
    return sourceorganizationid;
  }

  public void setSourceorganizationid(Long sourceorganizationid) {
    this.sourceorganizationid = sourceorganizationid;
  }

  public ISOLine sourcesubinventory(String sourcesubinventory) {
    this.sourcesubinventory = sourcesubinventory;
    return this;
  }

  /**
   * Get sourcesubinventory
   * @return sourcesubinventory
  */
  
  @Schema(name = "sourcesubinventory", required = false)
  public String getSourcesubinventory() {
    return sourcesubinventory;
  }

  public void setSourcesubinventory(String sourcesubinventory) {
    this.sourcesubinventory = sourcesubinventory;
  }

  public ISOLine transactionid(Long transactionid) {
    this.transactionid = transactionid;
    return this;
  }

  /**
   * Get transactionid
   * @return transactionid
  */
  
  @Schema(name = "transactionid", required = false)
  public Long getTransactionid() {
    return transactionid;
  }

  public void setTransactionid(Long transactionid) {
    this.transactionid = transactionid;
  }

  public ISOLine uomcode(String uomcode) {
    this.uomcode = uomcode;
    return this;
  }

  /**
   * Get uomcode
   * @return uomcode
  */
  
  @Schema(name = "uomcode", required = false)
  public String getUomcode() {
    return uomcode;
  }

  public void setUomcode(String uomcode) {
    this.uomcode = uomcode;
  }

  public ISOLine vendorid(Long vendorid) {
    this.vendorid = vendorid;
    return this;
  }

  /**
   * Get vendorid
   * @return vendorid
  */
  
  @Schema(name = "vendorid", required = false)
  public Long getVendorid() {
    return vendorid;
  }

  public void setVendorid(Long vendorid) {
    this.vendorid = vendorid;
  }

  public ISOLine vendorlocation(String vendorlocation) {
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

  public ISOLine vendorname(String vendorname) {
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

  public ISOLine vendorsiteid(Long vendorsiteid) {
    this.vendorsiteid = vendorsiteid;
    return this;
  }

  /**
   * Get vendorsiteid
   * @return vendorsiteid
  */
  
  @Schema(name = "vendorsiteid", required = false)
  public Long getVendorsiteid() {
    return vendorsiteid;
  }

  public void setVendorsiteid(Long vendorsiteid) {
    this.vendorsiteid = vendorsiteid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ISOLine isOLine = (ISOLine) o;
    return Objects.equals(this.batchid, isOLine.batchid) &&
        Objects.equals(this.cancelcomments, isOLine.cancelcomments) &&
        Objects.equals(this.categoryid, isOLine.categoryid) &&
        Objects.equals(this.createdby, isOLine.createdby) &&
        Objects.equals(this.creationdate, isOLine.creationdate) &&
        Objects.equals(this.delivertolocationid, isOLine.delivertolocationid) &&
        Objects.equals(this.destinationorganizationid, isOLine.destinationorganizationid) &&
        Objects.equals(this.destinationsubinventory, isOLine.destinationsubinventory) &&
        Objects.equals(this.employeeid, isOLine.employeeid) &&
        Objects.equals(this.interfacesourcecode, isOLine.interfacesourcecode) &&
        Objects.equals(this.inventoryitemid, isOLine.inventoryitemid) &&
        Objects.equals(this.isofuiid, isOLine.isofuiid) &&
        Objects.equals(this.isoheaderid, isOLine.isoheaderid) &&
        Objects.equals(this.isolineid, isOLine.isolineid) &&
        Objects.equals(this.isoordernumber, isOLine.isoordernumber) &&
        Objects.equals(this.isoreqid, isOLine.isoreqid) &&
        Objects.equals(this.itemnumber, isOLine.itemnumber) &&
        Objects.equals(this.languagecode, isOLine.languagecode) &&
        Objects.equals(this.lastupdatedate, isOLine.lastupdatedate) &&
        Objects.equals(this.lastupdatedby, isOLine.lastupdatedby) &&
        Objects.equals(this.linesetheader, isOLine.linesetheader) &&
        Objects.equals(this.needbydate, isOLine.needbydate) &&
        Objects.equals(this.ordercomments, isOLine.ordercomments) &&
        Objects.equals(this.orgid, isOLine.orgid) &&
        Objects.equals(this.pickupDcOrgId, isOLine.pickupDcOrgId) &&
        Objects.equals(this.processbatchid, isOLine.processbatchid) &&
        Objects.equals(this.processedmessage, isOLine.processedmessage) &&
        Objects.equals(this.processflag, isOLine.processflag) &&
        Objects.equals(this.quantity, isOLine.quantity) &&
        Objects.equals(this.requisitionheaderid, isOLine.requisitionheaderid) &&
        Objects.equals(this.requisitionlineid, isOLine.requisitionlineid) &&
        Objects.equals(this.requisitiontype, isOLine.requisitiontype) &&
        Objects.equals(this.routeid, isOLine.routeid) &&
        Objects.equals(this.routesequence, isOLine.routesequence) &&
        Objects.equals(this.salesorder, isOLine.salesorder) &&
        Objects.equals(this.salesorderlineno, isOLine.salesorderlineno) &&
        Objects.equals(this.salesordershipmentno, isOLine.salesordershipmentno) &&
        Objects.equals(this.shipmentprioritycode, isOLine.shipmentprioritycode) &&
        Objects.equals(this.shippingDcOrgId, isOLine.shippingDcOrgId) &&
        Objects.equals(this.shippinginstructions, isOLine.shippinginstructions) &&
        Objects.equals(this.shippingmethodcode, isOLine.shippingmethodcode) &&
        Objects.equals(this.shipsetline, isOLine.shipsetline) &&
        Objects.equals(this.sourceorganizationid, isOLine.sourceorganizationid) &&
        Objects.equals(this.sourcesubinventory, isOLine.sourcesubinventory) &&
        Objects.equals(this.transactionid, isOLine.transactionid) &&
        Objects.equals(this.uomcode, isOLine.uomcode) &&
        Objects.equals(this.vendorid, isOLine.vendorid) &&
        Objects.equals(this.vendorlocation, isOLine.vendorlocation) &&
        Objects.equals(this.vendorname, isOLine.vendorname) &&
        Objects.equals(this.vendorsiteid, isOLine.vendorsiteid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchid, cancelcomments, categoryid, createdby, creationdate, delivertolocationid, destinationorganizationid, destinationsubinventory, employeeid, interfacesourcecode, inventoryitemid, isofuiid, isoheaderid, isolineid, isoordernumber, isoreqid, itemnumber, languagecode, lastupdatedate, lastupdatedby, linesetheader, needbydate, ordercomments, orgid, pickupDcOrgId, processbatchid, processedmessage, processflag, quantity, requisitionheaderid, requisitionlineid, requisitiontype, routeid, routesequence, salesorder, salesorderlineno, salesordershipmentno, shipmentprioritycode, shippingDcOrgId, shippinginstructions, shippingmethodcode, shipsetline, sourceorganizationid, sourcesubinventory, transactionid, uomcode, vendorid, vendorlocation, vendorname, vendorsiteid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ISOLine {\n");
    sb.append("    batchid: ").append(toIndentedString(batchid)).append("\n");
    sb.append("    cancelcomments: ").append(toIndentedString(cancelcomments)).append("\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    creationdate: ").append(toIndentedString(creationdate)).append("\n");
    sb.append("    delivertolocationid: ").append(toIndentedString(delivertolocationid)).append("\n");
    sb.append("    destinationorganizationid: ").append(toIndentedString(destinationorganizationid)).append("\n");
    sb.append("    destinationsubinventory: ").append(toIndentedString(destinationsubinventory)).append("\n");
    sb.append("    employeeid: ").append(toIndentedString(employeeid)).append("\n");
    sb.append("    interfacesourcecode: ").append(toIndentedString(interfacesourcecode)).append("\n");
    sb.append("    inventoryitemid: ").append(toIndentedString(inventoryitemid)).append("\n");
    sb.append("    isofuiid: ").append(toIndentedString(isofuiid)).append("\n");
    sb.append("    isoheaderid: ").append(toIndentedString(isoheaderid)).append("\n");
    sb.append("    isolineid: ").append(toIndentedString(isolineid)).append("\n");
    sb.append("    isoordernumber: ").append(toIndentedString(isoordernumber)).append("\n");
    sb.append("    isoreqid: ").append(toIndentedString(isoreqid)).append("\n");
    sb.append("    itemnumber: ").append(toIndentedString(itemnumber)).append("\n");
    sb.append("    languagecode: ").append(toIndentedString(languagecode)).append("\n");
    sb.append("    lastupdatedate: ").append(toIndentedString(lastupdatedate)).append("\n");
    sb.append("    lastupdatedby: ").append(toIndentedString(lastupdatedby)).append("\n");
    sb.append("    linesetheader: ").append(toIndentedString(linesetheader)).append("\n");
    sb.append("    needbydate: ").append(toIndentedString(needbydate)).append("\n");
    sb.append("    ordercomments: ").append(toIndentedString(ordercomments)).append("\n");
    sb.append("    orgid: ").append(toIndentedString(orgid)).append("\n");
    sb.append("    pickupDcOrgId: ").append(toIndentedString(pickupDcOrgId)).append("\n");
    sb.append("    processbatchid: ").append(toIndentedString(processbatchid)).append("\n");
    sb.append("    processedmessage: ").append(toIndentedString(processedmessage)).append("\n");
    sb.append("    processflag: ").append(toIndentedString(processflag)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    requisitionheaderid: ").append(toIndentedString(requisitionheaderid)).append("\n");
    sb.append("    requisitionlineid: ").append(toIndentedString(requisitionlineid)).append("\n");
    sb.append("    requisitiontype: ").append(toIndentedString(requisitiontype)).append("\n");
    sb.append("    routeid: ").append(toIndentedString(routeid)).append("\n");
    sb.append("    routesequence: ").append(toIndentedString(routesequence)).append("\n");
    sb.append("    salesorder: ").append(toIndentedString(salesorder)).append("\n");
    sb.append("    salesorderlineno: ").append(toIndentedString(salesorderlineno)).append("\n");
    sb.append("    salesordershipmentno: ").append(toIndentedString(salesordershipmentno)).append("\n");
    sb.append("    shipmentprioritycode: ").append(toIndentedString(shipmentprioritycode)).append("\n");
    sb.append("    shippingDcOrgId: ").append(toIndentedString(shippingDcOrgId)).append("\n");
    sb.append("    shippinginstructions: ").append(toIndentedString(shippinginstructions)).append("\n");
    sb.append("    shippingmethodcode: ").append(toIndentedString(shippingmethodcode)).append("\n");
    sb.append("    shipsetline: ").append(toIndentedString(shipsetline)).append("\n");
    sb.append("    sourceorganizationid: ").append(toIndentedString(sourceorganizationid)).append("\n");
    sb.append("    sourcesubinventory: ").append(toIndentedString(sourcesubinventory)).append("\n");
    sb.append("    transactionid: ").append(toIndentedString(transactionid)).append("\n");
    sb.append("    uomcode: ").append(toIndentedString(uomcode)).append("\n");
    sb.append("    vendorid: ").append(toIndentedString(vendorid)).append("\n");
    sb.append("    vendorlocation: ").append(toIndentedString(vendorlocation)).append("\n");
    sb.append("    vendorname: ").append(toIndentedString(vendorname)).append("\n");
    sb.append("    vendorsiteid: ").append(toIndentedString(vendorsiteid)).append("\n");
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

