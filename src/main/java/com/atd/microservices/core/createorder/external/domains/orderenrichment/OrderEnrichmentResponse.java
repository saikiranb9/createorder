package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.Header;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.MetaData;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderLine;
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
 * OrderEnrichmentResponse
 */

public class OrderEnrichmentResponse {

  @JsonProperty("metaData")
  private MetaData metaData;

  @JsonProperty("header")
  private Header header;

  @JsonProperty("lines")
  @Valid
  private List<OrderLine> lines = null;

  public OrderEnrichmentResponse metaData(MetaData metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
  */
  @Valid 
  @Schema(name = "metaData", required = false)
  public MetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(MetaData metaData) {
    this.metaData = metaData;
  }

  public OrderEnrichmentResponse header(Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  */
  @Valid 
  @Schema(name = "header", required = false)
  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public OrderEnrichmentResponse lines(List<OrderLine> lines) {
    this.lines = lines;
    return this;
  }

  public OrderEnrichmentResponse addLinesItem(OrderLine linesItem) {
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
  public List<OrderLine> getLines() {
    return lines;
  }

  public void setLines(List<OrderLine> lines) {
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
    OrderEnrichmentResponse orderEnrichmentResponse = (OrderEnrichmentResponse) o;
    return Objects.equals(this.metaData, orderEnrichmentResponse.metaData) &&
        Objects.equals(this.header, orderEnrichmentResponse.header) &&
        Objects.equals(this.lines, orderEnrichmentResponse.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, header, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEnrichmentResponse {\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

