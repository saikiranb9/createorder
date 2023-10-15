package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.processorderv2.Order;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * OrderResponse
 */

public class OrderResponse {

  @JsonProperty("orderReferenceId")
  private String orderReferenceId;

  @JsonProperty("orderSubmitTimestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime orderSubmitTimestamp;

  /**
   * Gets or Sets orderType
   */
  public enum OrderTypeEnum {
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

    OrderTypeEnum(String value) {
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
    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("orderType")
  private OrderTypeEnum orderType;

  @JsonProperty("requestPayload")
  private Order requestPayload;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    SUBMITTED("SUBMITTED"),
    
    FILLED("FILLED"),
    
    FAILED("FAILED"),
    
    ERROR("ERROR"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public OrderResponse orderReferenceId(String orderReferenceId) {
    this.orderReferenceId = orderReferenceId;
    return this;
  }

  /**
   * Get orderReferenceId
   * @return orderReferenceId
  */
  
  @Schema(name = "orderReferenceId", required = false)
  public String getOrderReferenceId() {
    return orderReferenceId;
  }

  public void setOrderReferenceId(String orderReferenceId) {
    this.orderReferenceId = orderReferenceId;
  }

  public OrderResponse orderSubmitTimestamp(ZonedDateTime orderSubmitTimestamp) {
    this.orderSubmitTimestamp = orderSubmitTimestamp;
    return this;
  }

  /**
   * Get orderSubmitTimestamp
   * @return orderSubmitTimestamp
  */
  @Valid 
  @Schema(name = "orderSubmitTimestamp", required = false)
  public ZonedDateTime getOrderSubmitTimestamp() {
    return orderSubmitTimestamp;
  }

  public void setOrderSubmitTimestamp(ZonedDateTime orderSubmitTimestamp) {
    this.orderSubmitTimestamp = orderSubmitTimestamp;
  }

  public OrderResponse orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * Get orderType
   * @return orderType
  */
  
  @Schema(name = "orderType", required = false)
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public OrderResponse requestPayload(Order requestPayload) {
    this.requestPayload = requestPayload;
    return this;
  }

  /**
   * Get requestPayload
   * @return requestPayload
  */
  @Valid 
  @Schema(name = "requestPayload", required = false)
  public Order getRequestPayload() {
    return requestPayload;
  }

  public void setRequestPayload(Order requestPayload) {
    this.requestPayload = requestPayload;
  }

  public OrderResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.orderReferenceId, orderResponse.orderReferenceId) &&
        Objects.equals(this.orderSubmitTimestamp, orderResponse.orderSubmitTimestamp) &&
        Objects.equals(this.orderType, orderResponse.orderType) &&
        Objects.equals(this.requestPayload, orderResponse.requestPayload) &&
        Objects.equals(this.status, orderResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderReferenceId, orderSubmitTimestamp, orderType, requestPayload, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    sb.append("    orderReferenceId: ").append(toIndentedString(orderReferenceId)).append("\n");
    sb.append("    orderSubmitTimestamp: ").append(toIndentedString(orderSubmitTimestamp)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    requestPayload: ").append(toIndentedString(requestPayload)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

