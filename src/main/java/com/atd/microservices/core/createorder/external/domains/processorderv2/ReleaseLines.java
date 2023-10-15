package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.ZonedDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReleaseLines
 */

public class ReleaseLines {

  @JsonProperty("actionCode")
  private String actionCode;

  @JsonProperty("cancelledFlag")
  private String cancelledFlag;

  @JsonProperty("custPoNumber")
  private String custPoNumber;

  @JsonProperty("customerLineNumber")
  private Long customerLineNumber;

  @JsonProperty("headerId")
  private Long headerId;

  @JsonProperty("holdId")
  private Long holdId;

  /**
   * Gets or Sets holdNameDff
   */
  public enum HoldNameDffEnum {
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

    HoldNameDffEnum(String value) {
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
    public static HoldNameDffEnum fromValue(String value) {
      for (HoldNameDffEnum b : HoldNameDffEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("holdNameDff")
  private HoldNameDffEnum holdNameDff;

  @JsonProperty("lineId")
  private Long lineId;

  @JsonProperty("openFlag")
  private String openFlag;

  @JsonProperty("orderNumber")
  private String orderNumber;

  @JsonProperty("orderSourceId")
  private Long orderSourceId;

  @JsonProperty("orderSourceMeaning")
  private String orderSourceMeaning;

  @JsonProperty("orgId")
  private Long orgId;

  @JsonProperty("origSysDocumentRef")
  private String origSysDocumentRef;

  @JsonProperty("origSysLineRef")
  private String origSysLineRef;

  @JsonProperty("processedFlag")
  private String processedFlag;

  public ReleaseLines actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  /**
   * Get actionCode
   * @return actionCode
  */
  
  @Schema(name = "actionCode", required = false)
  public String getActionCode() {
    return actionCode;
  }

  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  public ReleaseLines cancelledFlag(String cancelledFlag) {
    this.cancelledFlag = cancelledFlag;
    return this;
  }

  /**
   * Get cancelledFlag
   * @return cancelledFlag
  */
  
  @Schema(name = "cancelledFlag", required = false)
  public String getCancelledFlag() {
    return cancelledFlag;
  }

  public void setCancelledFlag(String cancelledFlag) {
    this.cancelledFlag = cancelledFlag;
  }

  public ReleaseLines custPoNumber(String custPoNumber) {
    this.custPoNumber = custPoNumber;
    return this;
  }

  /**
   * Get custPoNumber
   * @return custPoNumber
  */
  
  @Schema(name = "custPoNumber", required = false)
  public String getCustPoNumber() {
    return custPoNumber;
  }

  public void setCustPoNumber(String custPoNumber) {
    this.custPoNumber = custPoNumber;
  }

  public ReleaseLines customerLineNumber(Long customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

  /**
   * Get customerLineNumber
   * @return customerLineNumber
  */
  
  @Schema(name = "customerLineNumber", required = false)
  public Long getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(Long customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }

  public ReleaseLines headerId(Long headerId) {
    this.headerId = headerId;
    return this;
  }

  /**
   * Get headerId
   * @return headerId
  */
  
  @Schema(name = "headerId", required = false)
  public Long getHeaderId() {
    return headerId;
  }

  public void setHeaderId(Long headerId) {
    this.headerId = headerId;
  }

  public ReleaseLines holdId(Long holdId) {
    this.holdId = holdId;
    return this;
  }

  /**
   * Get holdId
   * @return holdId
  */
  
  @Schema(name = "holdId", required = false)
  public Long getHoldId() {
    return holdId;
  }

  public void setHoldId(Long holdId) {
    this.holdId = holdId;
  }

  public ReleaseLines holdNameDff(HoldNameDffEnum holdNameDff) {
    this.holdNameDff = holdNameDff;
    return this;
  }

  /**
   * Get holdNameDff
   * @return holdNameDff
  */
  
  @Schema(name = "holdNameDff", required = false)
  public HoldNameDffEnum getHoldNameDff() {
    return holdNameDff;
  }

  public void setHoldNameDff(HoldNameDffEnum holdNameDff) {
    this.holdNameDff = holdNameDff;
  }

  public ReleaseLines lineId(Long lineId) {
    this.lineId = lineId;
    return this;
  }

  /**
   * Get lineId
   * @return lineId
  */
  
  @Schema(name = "lineId", required = false)
  public Long getLineId() {
    return lineId;
  }

  public void setLineId(Long lineId) {
    this.lineId = lineId;
  }

  public ReleaseLines openFlag(String openFlag) {
    this.openFlag = openFlag;
    return this;
  }

  /**
   * Get openFlag
   * @return openFlag
  */
  
  @Schema(name = "openFlag", required = false)
  public String getOpenFlag() {
    return openFlag;
  }

  public void setOpenFlag(String openFlag) {
    this.openFlag = openFlag;
  }

  public ReleaseLines orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  */
  
  @Schema(name = "orderNumber", required = false)
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public ReleaseLines orderSourceId(Long orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

  /**
   * Get orderSourceId
   * @return orderSourceId
  */
  
  @Schema(name = "orderSourceId", required = false)
  public Long getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Long orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  public ReleaseLines orderSourceMeaning(String orderSourceMeaning) {
    this.orderSourceMeaning = orderSourceMeaning;
    return this;
  }

  /**
   * Get orderSourceMeaning
   * @return orderSourceMeaning
  */
  
  @Schema(name = "orderSourceMeaning", required = false)
  public String getOrderSourceMeaning() {
    return orderSourceMeaning;
  }

  public void setOrderSourceMeaning(String orderSourceMeaning) {
    this.orderSourceMeaning = orderSourceMeaning;
  }

  public ReleaseLines orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Get orgId
   * @return orgId
  */
  
  @Schema(name = "orgId", required = false)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public ReleaseLines origSysDocumentRef(String origSysDocumentRef) {
    this.origSysDocumentRef = origSysDocumentRef;
    return this;
  }

  /**
   * Get origSysDocumentRef
   * @return origSysDocumentRef
  */
  
  @Schema(name = "origSysDocumentRef", required = false)
  public String getOrigSysDocumentRef() {
    return origSysDocumentRef;
  }

  public void setOrigSysDocumentRef(String origSysDocumentRef) {
    this.origSysDocumentRef = origSysDocumentRef;
  }

  public ReleaseLines origSysLineRef(String origSysLineRef) {
    this.origSysLineRef = origSysLineRef;
    return this;
  }

  /**
   * Get origSysLineRef
   * @return origSysLineRef
  */
  
  @Schema(name = "origSysLineRef", required = false)
  public String getOrigSysLineRef() {
    return origSysLineRef;
  }

  public void setOrigSysLineRef(String origSysLineRef) {
    this.origSysLineRef = origSysLineRef;
  }

  public ReleaseLines processedFlag(String processedFlag) {
    this.processedFlag = processedFlag;
    return this;
  }

  /**
   * Get processedFlag
   * @return processedFlag
  */
  
  @Schema(name = "processedFlag", required = false)
  public String getProcessedFlag() {
    return processedFlag;
  }

  public void setProcessedFlag(String processedFlag) {
    this.processedFlag = processedFlag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseLines releaseLines = (ReleaseLines) o;
    return Objects.equals(this.actionCode, releaseLines.actionCode) &&
        Objects.equals(this.cancelledFlag, releaseLines.cancelledFlag) &&
        Objects.equals(this.custPoNumber, releaseLines.custPoNumber) &&
        Objects.equals(this.customerLineNumber, releaseLines.customerLineNumber) &&
        Objects.equals(this.headerId, releaseLines.headerId) &&
        Objects.equals(this.holdId, releaseLines.holdId) &&
        Objects.equals(this.holdNameDff, releaseLines.holdNameDff) &&
        Objects.equals(this.lineId, releaseLines.lineId) &&
        Objects.equals(this.openFlag, releaseLines.openFlag) &&
        Objects.equals(this.orderNumber, releaseLines.orderNumber) &&
        Objects.equals(this.orderSourceId, releaseLines.orderSourceId) &&
        Objects.equals(this.orderSourceMeaning, releaseLines.orderSourceMeaning) &&
        Objects.equals(this.orgId, releaseLines.orgId) &&
        Objects.equals(this.origSysDocumentRef, releaseLines.origSysDocumentRef) &&
        Objects.equals(this.origSysLineRef, releaseLines.origSysLineRef) &&
        Objects.equals(this.processedFlag, releaseLines.processedFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCode, cancelledFlag, custPoNumber, customerLineNumber, headerId, holdId, holdNameDff, lineId, openFlag, orderNumber, orderSourceId, orderSourceMeaning, orgId, origSysDocumentRef, origSysLineRef, processedFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseLines {\n");
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    cancelledFlag: ").append(toIndentedString(cancelledFlag)).append("\n");
    sb.append("    custPoNumber: ").append(toIndentedString(custPoNumber)).append("\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    holdId: ").append(toIndentedString(holdId)).append("\n");
    sb.append("    holdNameDff: ").append(toIndentedString(holdNameDff)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    openFlag: ").append(toIndentedString(openFlag)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    orderSourceMeaning: ").append(toIndentedString(orderSourceMeaning)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    origSysDocumentRef: ").append(toIndentedString(origSysDocumentRef)).append("\n");
    sb.append("    origSysLineRef: ").append(toIndentedString(origSysLineRef)).append("\n");
    sb.append("    processedFlag: ").append(toIndentedString(processedFlag)).append("\n");
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

