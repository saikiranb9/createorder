package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.Attribute;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * CustomerShipTo
 */

public class CustomerShipTo {

  @JsonProperty("address1")
  private String address1;

  @JsonProperty("address2")
  private String address2;

  @JsonProperty("address3")
  private String address3;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("billtoaddress1")
  private String billtoaddress1;

  @JsonProperty("billtoaddress2")
  private String billtoaddress2;

  @JsonProperty("billtoaddress3")
  private String billtoaddress3;

  @JsonProperty("billtocity")
  private String billtocity;

  @JsonProperty("billtocountry")
  private String billtocountry;

  @JsonProperty("billtocounty")
  private String billtocounty;

  @JsonProperty("billtofirstname")
  private String billtofirstname;

  @JsonProperty("billtolastname")
  private String billtolastname;

  @JsonProperty("billtostate")
  private String billtostate;

  @JsonProperty("billtozip")
  private String billtozip;

  @JsonProperty("billtozipplus4")
  private String billtozipplus4;

  @JsonProperty("buyerlocationId")
  private Long buyerlocationId;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private String country;

  @JsonProperty("county")
  private String county;

  @JsonProperty("createdby")
  private Long createdby;

  @JsonProperty("creationdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime creationdate;

  @JsonProperty("email")
  private String email;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("languagecode")
  private String languagecode;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("lastupdatedate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime lastupdatedate;

  @JsonProperty("lastupdatedby")
  private Long lastupdatedby;

  @JsonProperty("orgid")
  private Long orgid;

  @JsonProperty("origsysdocumentref")
  private String origsysdocumentref;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("residential")
  private String residential;

  @JsonProperty("shiptoattention")
  private String shiptoattention;

  @JsonProperty("siteuseid")
  private Long siteuseid;

  @JsonProperty("state")
  private String state;

  @JsonProperty("zip")
  private String zip;

  @JsonProperty("zipplus4")
  private String zipplus4;

  public CustomerShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Get address1
   * @return address1
  */
  
  @Schema(name = "address1", required = false)
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public CustomerShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Get address2
   * @return address2
  */
  
  @Schema(name = "address2", required = false)
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public CustomerShipTo address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Get address3
   * @return address3
  */
  
  @Schema(name = "address3", required = false)
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public CustomerShipTo attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CustomerShipTo addAttributesItem(Attribute attributesItem) {
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

  public CustomerShipTo billtoaddress1(String billtoaddress1) {
    this.billtoaddress1 = billtoaddress1;
    return this;
  }

  /**
   * Get billtoaddress1
   * @return billtoaddress1
  */
  
  @Schema(name = "billtoaddress1", required = false)
  public String getBilltoaddress1() {
    return billtoaddress1;
  }

  public void setBilltoaddress1(String billtoaddress1) {
    this.billtoaddress1 = billtoaddress1;
  }

  public CustomerShipTo billtoaddress2(String billtoaddress2) {
    this.billtoaddress2 = billtoaddress2;
    return this;
  }

  /**
   * Get billtoaddress2
   * @return billtoaddress2
  */
  
  @Schema(name = "billtoaddress2", required = false)
  public String getBilltoaddress2() {
    return billtoaddress2;
  }

  public void setBilltoaddress2(String billtoaddress2) {
    this.billtoaddress2 = billtoaddress2;
  }

  public CustomerShipTo billtoaddress3(String billtoaddress3) {
    this.billtoaddress3 = billtoaddress3;
    return this;
  }

  /**
   * Get billtoaddress3
   * @return billtoaddress3
  */
  
  @Schema(name = "billtoaddress3", required = false)
  public String getBilltoaddress3() {
    return billtoaddress3;
  }

  public void setBilltoaddress3(String billtoaddress3) {
    this.billtoaddress3 = billtoaddress3;
  }

  public CustomerShipTo billtocity(String billtocity) {
    this.billtocity = billtocity;
    return this;
  }

  /**
   * Get billtocity
   * @return billtocity
  */
  
  @Schema(name = "billtocity", required = false)
  public String getBilltocity() {
    return billtocity;
  }

  public void setBilltocity(String billtocity) {
    this.billtocity = billtocity;
  }

  public CustomerShipTo billtocountry(String billtocountry) {
    this.billtocountry = billtocountry;
    return this;
  }

  /**
   * Get billtocountry
   * @return billtocountry
  */
  
  @Schema(name = "billtocountry", required = false)
  public String getBilltocountry() {
    return billtocountry;
  }

  public void setBilltocountry(String billtocountry) {
    this.billtocountry = billtocountry;
  }

  public CustomerShipTo billtocounty(String billtocounty) {
    this.billtocounty = billtocounty;
    return this;
  }

  /**
   * Get billtocounty
   * @return billtocounty
  */
  
  @Schema(name = "billtocounty", required = false)
  public String getBilltocounty() {
    return billtocounty;
  }

  public void setBilltocounty(String billtocounty) {
    this.billtocounty = billtocounty;
  }

  public CustomerShipTo billtofirstname(String billtofirstname) {
    this.billtofirstname = billtofirstname;
    return this;
  }

  /**
   * Get billtofirstname
   * @return billtofirstname
  */
  
  @Schema(name = "billtofirstname", required = false)
  public String getBilltofirstname() {
    return billtofirstname;
  }

  public void setBilltofirstname(String billtofirstname) {
    this.billtofirstname = billtofirstname;
  }

  public CustomerShipTo billtolastname(String billtolastname) {
    this.billtolastname = billtolastname;
    return this;
  }

  /**
   * Get billtolastname
   * @return billtolastname
  */
  
  @Schema(name = "billtolastname", required = false)
  public String getBilltolastname() {
    return billtolastname;
  }

  public void setBilltolastname(String billtolastname) {
    this.billtolastname = billtolastname;
  }

  public CustomerShipTo billtostate(String billtostate) {
    this.billtostate = billtostate;
    return this;
  }

  /**
   * Get billtostate
   * @return billtostate
  */
  
  @Schema(name = "billtostate", required = false)
  public String getBilltostate() {
    return billtostate;
  }

  public void setBilltostate(String billtostate) {
    this.billtostate = billtostate;
  }

  public CustomerShipTo billtozip(String billtozip) {
    this.billtozip = billtozip;
    return this;
  }

  /**
   * Get billtozip
   * @return billtozip
  */
  
  @Schema(name = "billtozip", required = false)
  public String getBilltozip() {
    return billtozip;
  }

  public void setBilltozip(String billtozip) {
    this.billtozip = billtozip;
  }

  public CustomerShipTo billtozipplus4(String billtozipplus4) {
    this.billtozipplus4 = billtozipplus4;
    return this;
  }

  /**
   * Get billtozipplus4
   * @return billtozipplus4
  */
  
  @Schema(name = "billtozipplus4", required = false)
  public String getBilltozipplus4() {
    return billtozipplus4;
  }

  public void setBilltozipplus4(String billtozipplus4) {
    this.billtozipplus4 = billtozipplus4;
  }

  public CustomerShipTo buyerlocationId(Long buyerlocationId) {
    this.buyerlocationId = buyerlocationId;
    return this;
  }

  /**
   * Get buyerlocationId
   * @return buyerlocationId
  */
  
  @Schema(name = "buyerlocationId", required = false)
  public Long getBuyerlocationId() {
    return buyerlocationId;
  }

  public void setBuyerlocationId(Long buyerlocationId) {
    this.buyerlocationId = buyerlocationId;
  }

  public CustomerShipTo city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CustomerShipTo country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CustomerShipTo county(String county) {
    this.county = county;
    return this;
  }

  /**
   * Get county
   * @return county
  */
  
  @Schema(name = "county", required = false)
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public CustomerShipTo createdby(Long createdby) {
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

  public CustomerShipTo creationdate(ZonedDateTime creationdate) {
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

  public CustomerShipTo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerShipTo firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
  */
  
  @Schema(name = "firstname", required = false)
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public CustomerShipTo languagecode(String languagecode) {
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

  public CustomerShipTo lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  */
  
  @Schema(name = "lastname", required = false)
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public CustomerShipTo lastupdatedate(ZonedDateTime lastupdatedate) {
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

  public CustomerShipTo lastupdatedby(Long lastupdatedby) {
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

  public CustomerShipTo orgid(Long orgid) {
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

  public CustomerShipTo origsysdocumentref(String origsysdocumentref) {
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

  public CustomerShipTo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CustomerShipTo residential(String residential) {
    this.residential = residential;
    return this;
  }

  /**
   * Get residential
   * @return residential
  */
  
  @Schema(name = "residential", required = false)
  public String getResidential() {
    return residential;
  }

  public void setResidential(String residential) {
    this.residential = residential;
  }

  public CustomerShipTo shiptoattention(String shiptoattention) {
    this.shiptoattention = shiptoattention;
    return this;
  }

  /**
   * Get shiptoattention
   * @return shiptoattention
  */
  
  @Schema(name = "shiptoattention", required = false)
  public String getShiptoattention() {
    return shiptoattention;
  }

  public void setShiptoattention(String shiptoattention) {
    this.shiptoattention = shiptoattention;
  }

  public CustomerShipTo siteuseid(Long siteuseid) {
    this.siteuseid = siteuseid;
    return this;
  }

  /**
   * Get siteuseid
   * @return siteuseid
  */
  
  @Schema(name = "siteuseid", required = false)
  public Long getSiteuseid() {
    return siteuseid;
  }

  public void setSiteuseid(Long siteuseid) {
    this.siteuseid = siteuseid;
  }

  public CustomerShipTo state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CustomerShipTo zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
  */
  
  @Schema(name = "zip", required = false)
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public CustomerShipTo zipplus4(String zipplus4) {
    this.zipplus4 = zipplus4;
    return this;
  }

  /**
   * Get zipplus4
   * @return zipplus4
  */
  
  @Schema(name = "zipplus4", required = false)
  public String getZipplus4() {
    return zipplus4;
  }

  public void setZipplus4(String zipplus4) {
    this.zipplus4 = zipplus4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerShipTo customerShipTo = (CustomerShipTo) o;
    return Objects.equals(this.address1, customerShipTo.address1) &&
        Objects.equals(this.address2, customerShipTo.address2) &&
        Objects.equals(this.address3, customerShipTo.address3) &&
        Objects.equals(this.attributes, customerShipTo.attributes) &&
        Objects.equals(this.billtoaddress1, customerShipTo.billtoaddress1) &&
        Objects.equals(this.billtoaddress2, customerShipTo.billtoaddress2) &&
        Objects.equals(this.billtoaddress3, customerShipTo.billtoaddress3) &&
        Objects.equals(this.billtocity, customerShipTo.billtocity) &&
        Objects.equals(this.billtocountry, customerShipTo.billtocountry) &&
        Objects.equals(this.billtocounty, customerShipTo.billtocounty) &&
        Objects.equals(this.billtofirstname, customerShipTo.billtofirstname) &&
        Objects.equals(this.billtolastname, customerShipTo.billtolastname) &&
        Objects.equals(this.billtostate, customerShipTo.billtostate) &&
        Objects.equals(this.billtozip, customerShipTo.billtozip) &&
        Objects.equals(this.billtozipplus4, customerShipTo.billtozipplus4) &&
        Objects.equals(this.buyerlocationId, customerShipTo.buyerlocationId) &&
        Objects.equals(this.city, customerShipTo.city) &&
        Objects.equals(this.country, customerShipTo.country) &&
        Objects.equals(this.county, customerShipTo.county) &&
        Objects.equals(this.createdby, customerShipTo.createdby) &&
        Objects.equals(this.creationdate, customerShipTo.creationdate) &&
        Objects.equals(this.email, customerShipTo.email) &&
        Objects.equals(this.firstname, customerShipTo.firstname) &&
        Objects.equals(this.languagecode, customerShipTo.languagecode) &&
        Objects.equals(this.lastname, customerShipTo.lastname) &&
        Objects.equals(this.lastupdatedate, customerShipTo.lastupdatedate) &&
        Objects.equals(this.lastupdatedby, customerShipTo.lastupdatedby) &&
        Objects.equals(this.orgid, customerShipTo.orgid) &&
        Objects.equals(this.origsysdocumentref, customerShipTo.origsysdocumentref) &&
        Objects.equals(this.phone, customerShipTo.phone) &&
        Objects.equals(this.residential, customerShipTo.residential) &&
        Objects.equals(this.shiptoattention, customerShipTo.shiptoattention) &&
        Objects.equals(this.siteuseid, customerShipTo.siteuseid) &&
        Objects.equals(this.state, customerShipTo.state) &&
        Objects.equals(this.zip, customerShipTo.zip) &&
        Objects.equals(this.zipplus4, customerShipTo.zipplus4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, attributes, billtoaddress1, billtoaddress2, billtoaddress3, billtocity, billtocountry, billtocounty, billtofirstname, billtolastname, billtostate, billtozip, billtozipplus4, buyerlocationId, city, country, county, createdby, creationdate, email, firstname, languagecode, lastname, lastupdatedate, lastupdatedby, orgid, origsysdocumentref, phone, residential, shiptoattention, siteuseid, state, zip, zipplus4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerShipTo {\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    billtoaddress1: ").append(toIndentedString(billtoaddress1)).append("\n");
    sb.append("    billtoaddress2: ").append(toIndentedString(billtoaddress2)).append("\n");
    sb.append("    billtoaddress3: ").append(toIndentedString(billtoaddress3)).append("\n");
    sb.append("    billtocity: ").append(toIndentedString(billtocity)).append("\n");
    sb.append("    billtocountry: ").append(toIndentedString(billtocountry)).append("\n");
    sb.append("    billtocounty: ").append(toIndentedString(billtocounty)).append("\n");
    sb.append("    billtofirstname: ").append(toIndentedString(billtofirstname)).append("\n");
    sb.append("    billtolastname: ").append(toIndentedString(billtolastname)).append("\n");
    sb.append("    billtostate: ").append(toIndentedString(billtostate)).append("\n");
    sb.append("    billtozip: ").append(toIndentedString(billtozip)).append("\n");
    sb.append("    billtozipplus4: ").append(toIndentedString(billtozipplus4)).append("\n");
    sb.append("    buyerlocationId: ").append(toIndentedString(buyerlocationId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    creationdate: ").append(toIndentedString(creationdate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    languagecode: ").append(toIndentedString(languagecode)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    lastupdatedate: ").append(toIndentedString(lastupdatedate)).append("\n");
    sb.append("    lastupdatedby: ").append(toIndentedString(lastupdatedby)).append("\n");
    sb.append("    orgid: ").append(toIndentedString(orgid)).append("\n");
    sb.append("    origsysdocumentref: ").append(toIndentedString(origsysdocumentref)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    shiptoattention: ").append(toIndentedString(shiptoattention)).append("\n");
    sb.append("    siteuseid: ").append(toIndentedString(siteuseid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    zipplus4: ").append(toIndentedString(zipplus4)).append("\n");
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

