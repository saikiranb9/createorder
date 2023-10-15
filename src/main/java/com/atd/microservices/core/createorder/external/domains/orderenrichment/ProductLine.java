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
 * ProductLine
 */

public class ProductLine {

  @JsonProperty("lineId")
  private String lineId;

  @JsonProperty("productNumber")
  private String productNumber;

  @JsonProperty("customerPOLineId")
  private String customerPOLineId;

  @JsonProperty("quantity")
  private Long quantity;

  public ProductLine lineId(String lineId) {
    this.lineId = lineId;
    return this;
  }

  /**
   * Get lineId
   * @return lineId
  */
  
  @Schema(name = "lineId", required = false)
  public String getLineId() {
    return lineId;
  }

  public void setLineId(String lineId) {
    this.lineId = lineId;
  }

  public ProductLine productNumber(String productNumber) {
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

  public ProductLine customerPOLineId(String customerPOLineId) {
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

  public ProductLine quantity(Long quantity) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductLine productLine = (ProductLine) o;
    return Objects.equals(this.lineId, productLine.lineId) &&
        Objects.equals(this.productNumber, productLine.productNumber) &&
        Objects.equals(this.customerPOLineId, productLine.customerPOLineId) &&
        Objects.equals(this.quantity, productLine.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineId, productNumber, customerPOLineId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLine {\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    customerPOLineId: ").append(toIndentedString(customerPOLineId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

