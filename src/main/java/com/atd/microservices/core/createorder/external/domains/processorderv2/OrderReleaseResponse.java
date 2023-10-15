package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.processorderv2.OrderReleaseRequest;
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
 * OrderReleaseResponse
 */

public class OrderReleaseResponse {

  @JsonProperty("orderReferenceId")
  private String orderReferenceId;

  @JsonProperty("requestPayload")
  private OrderReleaseRequest requestPayload;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SUBMITTED("SUBMITTED");

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

  public OrderReleaseResponse orderReferenceId(String orderReferenceId) {
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

  public OrderReleaseResponse requestPayload(OrderReleaseRequest requestPayload) {
    this.requestPayload = requestPayload;
    return this;
  }

  /**
   * Get requestPayload
   * @return requestPayload
  */
  @Valid 
  @Schema(name = "requestPayload", required = false)
  public OrderReleaseRequest getRequestPayload() {
    return requestPayload;
  }

  public void setRequestPayload(OrderReleaseRequest requestPayload) {
    this.requestPayload = requestPayload;
  }

  public OrderReleaseResponse status(StatusEnum status) {
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
    OrderReleaseResponse orderReleaseResponse = (OrderReleaseResponse) o;
    return Objects.equals(this.orderReferenceId, orderReleaseResponse.orderReferenceId) &&
        Objects.equals(this.requestPayload, orderReleaseResponse.requestPayload) &&
        Objects.equals(this.status, orderReleaseResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderReferenceId, requestPayload, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReleaseResponse {\n");
    sb.append("    orderReferenceId: ").append(toIndentedString(orderReferenceId)).append("\n");
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

