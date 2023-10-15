package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * FieldError
 */

public class FieldError {

  @JsonProperty("arguments")
  @Valid
  private List<Object> arguments = null;

  @JsonProperty("bindingFailure")
  private Boolean bindingFailure;

  @JsonProperty("code")
  private String code;

  @JsonProperty("codes")
  @Valid
  private List<String> codes = null;

  @JsonProperty("defaultMessage")
  private String defaultMessage;

  @JsonProperty("field")
  private String field;

  @JsonProperty("objectName")
  private String objectName;

  @JsonProperty("rejectedValue")
  private Object rejectedValue;

  public FieldError arguments(List<Object> arguments) {
    this.arguments = arguments;
    return this;
  }

  public FieldError addArgumentsItem(Object argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  */
  
  @Schema(name = "arguments", required = false)
  public List<Object> getArguments() {
    return arguments;
  }

  public void setArguments(List<Object> arguments) {
    this.arguments = arguments;
  }

  public FieldError bindingFailure(Boolean bindingFailure) {
    this.bindingFailure = bindingFailure;
    return this;
  }

  /**
   * Get bindingFailure
   * @return bindingFailure
  */
  
  @Schema(name = "bindingFailure", required = false)
  public Boolean getBindingFailure() {
    return bindingFailure;
  }

  public void setBindingFailure(Boolean bindingFailure) {
    this.bindingFailure = bindingFailure;
  }

  public FieldError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public FieldError codes(List<String> codes) {
    this.codes = codes;
    return this;
  }

  public FieldError addCodesItem(String codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<>();
    }
    this.codes.add(codesItem);
    return this;
  }

  /**
   * Get codes
   * @return codes
  */
  
  @Schema(name = "codes", required = false)
  public List<String> getCodes() {
    return codes;
  }

  public void setCodes(List<String> codes) {
    this.codes = codes;
  }

  public FieldError defaultMessage(String defaultMessage) {
    this.defaultMessage = defaultMessage;
    return this;
  }

  /**
   * Get defaultMessage
   * @return defaultMessage
  */
  
  @Schema(name = "defaultMessage", required = false)
  public String getDefaultMessage() {
    return defaultMessage;
  }

  public void setDefaultMessage(String defaultMessage) {
    this.defaultMessage = defaultMessage;
  }

  public FieldError field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  
  @Schema(name = "field", required = false)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public FieldError objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * Get objectName
   * @return objectName
  */
  
  @Schema(name = "objectName", required = false)
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public FieldError rejectedValue(Object rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  /**
   * Get rejectedValue
   * @return rejectedValue
  */
  
  @Schema(name = "rejectedValue", required = false)
  public Object getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(Object rejectedValue) {
    this.rejectedValue = rejectedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldError fieldError = (FieldError) o;
    return Objects.equals(this.arguments, fieldError.arguments) &&
        Objects.equals(this.bindingFailure, fieldError.bindingFailure) &&
        Objects.equals(this.code, fieldError.code) &&
        Objects.equals(this.codes, fieldError.codes) &&
        Objects.equals(this.defaultMessage, fieldError.defaultMessage) &&
        Objects.equals(this.field, fieldError.field) &&
        Objects.equals(this.objectName, fieldError.objectName) &&
        Objects.equals(this.rejectedValue, fieldError.rejectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, bindingFailure, code, codes, defaultMessage, field, objectName, rejectedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldError {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    bindingFailure: ").append(toIndentedString(bindingFailure)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
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

