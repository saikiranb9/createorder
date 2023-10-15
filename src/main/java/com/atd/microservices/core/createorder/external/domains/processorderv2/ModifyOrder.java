package com.atd.microservices.core.createorder.external.domains.processorderv2;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.processorderv2.ModifyHeader;
import com.atd.microservices.core.createorder.external.domains.processorderv2.ModifyOrderLine;
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
 * ModifyOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-30T16:31:09.331599-05:00[America/New_York]")
public class ModifyOrder {

  @JsonProperty("header")
  private ModifyHeader header;

  @JsonProperty("lines")
  @Valid
  private List<ModifyOrderLine> lines = null;

  public ModifyOrder header(ModifyHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  */
  @Valid 
  @Schema(name = "header", required = false)
  public ModifyHeader getHeader() {
    return header;
  }

  public void setHeader(ModifyHeader header) {
    this.header = header;
  }

  public ModifyOrder lines(List<ModifyOrderLine> lines) {
    this.lines = lines;
    return this;
  }

  public ModifyOrder addLinesItem(ModifyOrderLine linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Get lines
   * @return lines
  */
  @Valid 
  @Schema(name = "lines", required = false)
  public List<ModifyOrderLine> getLines() {
    return lines;
  }

  public void setLines(List<ModifyOrderLine> lines) {
    this.lines = lines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyOrder modifyOrder = (ModifyOrder) o;
    return Objects.equals(this.header, modifyOrder.header) &&
        Objects.equals(this.lines, modifyOrder.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyOrder {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

