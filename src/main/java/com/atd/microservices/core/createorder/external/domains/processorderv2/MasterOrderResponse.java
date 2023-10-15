package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.processorderv2.Order;
import com.atd.microservices.core.createorder.external.domains.processorderv2.OrderResponse;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * MasterOrderResponse
 */

public class MasterOrderResponse {

  @JsonProperty("orderReferenceId")
  private String orderReferenceId;

  @JsonProperty("orderSubmitTimestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime orderSubmitTimestamp;

  @JsonProperty("requestPayload")
  private Order requestPayload;

  @JsonProperty("splittedOrderResponse")
  @Valid
  private List<OrderResponse> splittedOrderResponse = null;

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

  public MasterOrderResponse orderReferenceId(String orderReferenceId) {
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

  public MasterOrderResponse orderSubmitTimestamp(ZonedDateTime orderSubmitTimestamp) {
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

  public MasterOrderResponse requestPayload(Order requestPayload) {
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

  public MasterOrderResponse splittedOrderResponse(List<OrderResponse> splittedOrderResponse) {
    this.splittedOrderResponse = splittedOrderResponse;
    return this;
  }

  public MasterOrderResponse addSplittedOrderResponseItem(OrderResponse splittedOrderResponseItem) {
    if (this.splittedOrderResponse == null) {
      this.splittedOrderResponse = new ArrayList<>();
    }
    this.splittedOrderResponse.add(splittedOrderResponseItem);
    return this;
  }

  /**
   * Get splittedOrderResponse
   * @return splittedOrderResponse
  */
  @Valid 
  @Schema(name = "splittedOrderResponse", required = false)
  public List<OrderResponse> getSplittedOrderResponse() {
    return splittedOrderResponse;
  }

  public void setSplittedOrderResponse(List<OrderResponse> splittedOrderResponse) {
    this.splittedOrderResponse = splittedOrderResponse;
  }

  public MasterOrderResponse status(StatusEnum status) {
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
    MasterOrderResponse masterOrderResponse = (MasterOrderResponse) o;
    return Objects.equals(this.orderReferenceId, masterOrderResponse.orderReferenceId) &&
        Objects.equals(this.orderSubmitTimestamp, masterOrderResponse.orderSubmitTimestamp) &&
        Objects.equals(this.requestPayload, masterOrderResponse.requestPayload) &&
        Objects.equals(this.splittedOrderResponse, masterOrderResponse.splittedOrderResponse) &&
        Objects.equals(this.status, masterOrderResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderReferenceId, orderSubmitTimestamp, requestPayload, splittedOrderResponse, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterOrderResponse {\n");
    sb.append("    orderReferenceId: ").append(toIndentedString(orderReferenceId)).append("\n");
    sb.append("    orderSubmitTimestamp: ").append(toIndentedString(orderSubmitTimestamp)).append("\n");
    sb.append("    requestPayload: ").append(toIndentedString(requestPayload)).append("\n");
    sb.append("    splittedOrderResponse: ").append(toIndentedString(splittedOrderResponse)).append("\n");
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

