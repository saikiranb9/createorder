package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.ZonedDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductFill
 */

public class ProductFill {

  @JsonProperty("productNumber")
  private String productNumber;

  @JsonProperty("customerPOLineId")
  private String customerPOLineId;

  @JsonProperty("lineId")
  private Long lineId;

  @JsonProperty("filledQty")
  private Long filledQty;

  @JsonProperty("killedQty")
  private Long killedQty;

  @JsonProperty("vendorName")
  private String vendorName;

  public ProductFill productNumber(String productNumber) {
    this.productNumber = productNumber;
    return this;
  }

  /**
   * Get productNumber
   * @return productNumber
  */
  
  @Schema(name = "productNumber", required = false)
  public String getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }

  public ProductFill customerPOLineId(String customerPOLineId) {
    this.customerPOLineId = customerPOLineId;
    return this;
  }

  /**
   * Get customerPOLineId
   * @return customerPOLineId
  */
  
  @Schema(name = "customerPOLineId", required = false)
  public String getCustomerPOLineId() {
    return customerPOLineId;
  }

  public void setCustomerPOLineId(String customerPOLineId) {
    this.customerPOLineId = customerPOLineId;
  }

  public ProductFill lineId(Long lineId) {
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

  public ProductFill filledQty(Long filledQty) {
    this.filledQty = filledQty;
    return this;
  }

  /**
   * Get filledQty
   * @return filledQty
  */
  
  @Schema(name = "filledQty", required = false)
  public Long getFilledQty() {
    return filledQty;
  }

  public void setFilledQty(Long filledQty) {
    this.filledQty = filledQty;
  }

  public ProductFill killedQty(Long killedQty) {
    this.killedQty = killedQty;
    return this;
  }

  /**
   * Get killedQty
   * @return killedQty
  */
  
  @Schema(name = "killedQty", required = false)
  public Long getKilledQty() {
    return killedQty;
  }

  public void setKilledQty(Long killedQty) {
    this.killedQty = killedQty;
  }

  public ProductFill vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * Get vendorName
   * @return vendorName
  */
  
  @Schema(name = "vendorName", required = false)
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFill productFill = (ProductFill) o;
    return Objects.equals(this.productNumber, productFill.productNumber) &&
        Objects.equals(this.customerPOLineId, productFill.customerPOLineId) &&
        Objects.equals(this.lineId, productFill.lineId) &&
        Objects.equals(this.filledQty, productFill.filledQty) &&
        Objects.equals(this.killedQty, productFill.killedQty) &&
        Objects.equals(this.vendorName, productFill.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productNumber, customerPOLineId, lineId, filledQty, killedQty, vendorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFill {\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    customerPOLineId: ").append(toIndentedString(customerPOLineId)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    filledQty: ").append(toIndentedString(filledQty)).append("\n");
    sb.append("    killedQty: ").append(toIndentedString(killedQty)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

