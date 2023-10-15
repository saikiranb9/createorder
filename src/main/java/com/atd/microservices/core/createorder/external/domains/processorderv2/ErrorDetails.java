package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.processorderv2.FieldError;
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
 * ErrorDetails
 */

public class ErrorDetails {

  @JsonProperty("details")
  private String details;

  @JsonProperty("fieldErrorsList")
  @Valid
  private List<FieldError> fieldErrorsList = null;

  @JsonProperty("message")
  private String message;

  @JsonProperty("origsysdocumentref")
  private String origsysdocumentref;

  @JsonProperty("requestPath")
  private String requestPath;

  @JsonProperty("requestPayLoad")
  private String requestPayLoad;

  @JsonProperty("status")
  private String status;

  @JsonProperty("timestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private ZonedDateTime timestamp;

  public ErrorDetails details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", required = false)
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ErrorDetails fieldErrorsList(List<FieldError> fieldErrorsList) {
    this.fieldErrorsList = fieldErrorsList;
    return this;
  }

  public ErrorDetails addFieldErrorsListItem(FieldError fieldErrorsListItem) {
    if (this.fieldErrorsList == null) {
      this.fieldErrorsList = new ArrayList<>();
    }
    this.fieldErrorsList.add(fieldErrorsListItem);
    return this;
  }

  /**
   * Get fieldErrorsList
   * @return fieldErrorsList
  */
  @Valid 
  @Schema(name = "fieldErrorsList", required = false)
  public List<FieldError> getFieldErrorsList() {
    return fieldErrorsList;
  }

  public void setFieldErrorsList(List<FieldError> fieldErrorsList) {
    this.fieldErrorsList = fieldErrorsList;
  }

  public ErrorDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDetails origsysdocumentref(String origsysdocumentref) {
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

  public ErrorDetails requestPath(String requestPath) {
    this.requestPath = requestPath;
    return this;
  }

  /**
   * Get requestPath
   * @return requestPath
  */
  
  @Schema(name = "requestPath", required = false)
  public String getRequestPath() {
    return requestPath;
  }

  public void setRequestPath(String requestPath) {
    this.requestPath = requestPath;
  }

  public ErrorDetails requestPayLoad(String requestPayLoad) {
    this.requestPayLoad = requestPayLoad;
    return this;
  }

  /**
   * Get requestPayLoad
   * @return requestPayLoad
  */
  
  @Schema(name = "requestPayLoad", required = false)
  public String getRequestPayLoad() {
    return requestPayLoad;
  }

  public void setRequestPayLoad(String requestPayLoad) {
    this.requestPayLoad = requestPayLoad;
  }

  public ErrorDetails status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", required = false)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorDetails timestamp(ZonedDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", required = false)
  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(ZonedDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.details, errorDetails.details) &&
        Objects.equals(this.fieldErrorsList, errorDetails.fieldErrorsList) &&
        Objects.equals(this.message, errorDetails.message) &&
        Objects.equals(this.origsysdocumentref, errorDetails.origsysdocumentref) &&
        Objects.equals(this.requestPath, errorDetails.requestPath) &&
        Objects.equals(this.requestPayLoad, errorDetails.requestPayLoad) &&
        Objects.equals(this.status, errorDetails.status) &&
        Objects.equals(this.timestamp, errorDetails.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, fieldErrorsList, message, origsysdocumentref, requestPath, requestPayLoad, status, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    fieldErrorsList: ").append(toIndentedString(fieldErrorsList)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    origsysdocumentref: ").append(toIndentedString(origsysdocumentref)).append("\n");
    sb.append("    requestPath: ").append(toIndentedString(requestPath)).append("\n");
    sb.append("    requestPayLoad: ").append(toIndentedString(requestPayLoad)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

