package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.processorderv2.ReleaseLines;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.ZonedDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderReleaseRequest
 */

public class OrderReleaseRequest {

  @JsonProperty("customerStockNumber")
  private String customerStockNumber;

  @JsonProperty("orgId")
  private Long orgId;

  @JsonProperty("origSysDocumentRef")
  private String origSysDocumentRef;

  @JsonProperty("releaseLines")
  @Valid
  private List<ReleaseLines> releaseLines = null;

  public OrderReleaseRequest customerStockNumber(String customerStockNumber) {
    this.customerStockNumber = customerStockNumber;
    return this;
  }

  /**
   * Get customerStockNumber
   * @return customerStockNumber
  */
  
  @Schema(name = "customerStockNumber", required = false)
  public String getCustomerStockNumber() {
    return customerStockNumber;
  }

  public void setCustomerStockNumber(String customerStockNumber) {
    this.customerStockNumber = customerStockNumber;
  }

  public OrderReleaseRequest orgId(Long orgId) {
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

  public OrderReleaseRequest origSysDocumentRef(String origSysDocumentRef) {
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

  public OrderReleaseRequest releaseLines(List<ReleaseLines> releaseLines) {
    this.releaseLines = releaseLines;
    return this;
  }

  public OrderReleaseRequest addReleaseLinesItem(ReleaseLines releaseLinesItem) {
    if (this.releaseLines == null) {
      this.releaseLines = new ArrayList<>();
    }
    this.releaseLines.add(releaseLinesItem);
    return this;
  }

  /**
   * Get releaseLines
   * @return releaseLines
  */
  @Valid 
  @Schema(name = "releaseLines", required = false)
  public List<ReleaseLines> getReleaseLines() {
    return releaseLines;
  }

  public void setReleaseLines(List<ReleaseLines> releaseLines) {
    this.releaseLines = releaseLines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReleaseRequest orderReleaseRequest = (OrderReleaseRequest) o;
    return Objects.equals(this.customerStockNumber, orderReleaseRequest.customerStockNumber) &&
        Objects.equals(this.orgId, orderReleaseRequest.orgId) &&
        Objects.equals(this.origSysDocumentRef, orderReleaseRequest.origSysDocumentRef) &&
        Objects.equals(this.releaseLines, orderReleaseRequest.releaseLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerStockNumber, orgId, origSysDocumentRef, releaseLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReleaseRequest {\n");
    sb.append("    customerStockNumber: ").append(toIndentedString(customerStockNumber)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    origSysDocumentRef: ").append(toIndentedString(origSysDocumentRef)).append("\n");
    sb.append("    releaseLines: ").append(toIndentedString(releaseLines)).append("\n");
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

