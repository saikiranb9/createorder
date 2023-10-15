package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.ProductLine;
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
 * OrderEnrichment
 */

public class OrderEnrichment {

  @JsonProperty("customerPONumber")
  private String customerPONumber;

  @JsonProperty("locationNumber")
  private String locationNumber;

  @JsonProperty("fillOrKill")
  private String fillOrKill;

  @JsonProperty("fulfilmentType")
  private String fulfilmentType;

  @JsonProperty("prxCheckEnabled")
  private Boolean prxCheckEnabled;

  @JsonProperty("disableViv")
  private Boolean disableViv;

  @JsonProperty("products")
  @Valid
  private List<ProductLine> products = null;

  public OrderEnrichment customerPONumber(String customerPONumber) {
    this.customerPONumber = customerPONumber;
    return this;
  }

  /**
   * Get customerPONumber
   * @return customerPONumber
  */
  
  @Schema(name = "customerPONumber", required = false)
  public String getCustomerPONumber() {
    return customerPONumber;
  }

  public void setCustomerPONumber(String customerPONumber) {
    this.customerPONumber = customerPONumber;
  }

  public OrderEnrichment locationNumber(String locationNumber) {
    this.locationNumber = locationNumber;
    return this;
  }

  /**
   * Get locationNumber
   * @return locationNumber
  */
  
  @Schema(name = "locationNumber", required = false)
  public String getLocationNumber() {
    return locationNumber;
  }

  public void setLocationNumber(String locationNumber) {
    this.locationNumber = locationNumber;
  }

  public OrderEnrichment fillOrKill(String fillOrKill) {
    this.fillOrKill = fillOrKill;
    return this;
  }

  /**
   * Get fillOrKill
   * @return fillOrKill
  */
  
  @Schema(name = "fillOrKill", required = false)
  public String getFillOrKill() {
    return fillOrKill;
  }

  public void setFillOrKill(String fillOrKill) {
    this.fillOrKill = fillOrKill;
  }

  public OrderEnrichment fulfilmentType(String fulfilmentType) {
    this.fulfilmentType = fulfilmentType;
    return this;
  }

  /**
   * Get fulfilmentType
   * @return fulfilmentType
  */
  
  @Schema(name = "fulfilmentType", required = false)
  public String getFulfilmentType() {
    return fulfilmentType;
  }

  public void setFulfilmentType(String fulfilmentType) {
    this.fulfilmentType = fulfilmentType;
  }

  public OrderEnrichment prxCheckEnabled(Boolean prxCheckEnabled) {
    this.prxCheckEnabled = prxCheckEnabled;
    return this;
  }

  /**
   * Get prxCheckEnabled
   * @return prxCheckEnabled
  */
  
  @Schema(name = "prxCheckEnabled", required = false)
  public Boolean getPrxCheckEnabled() {
    return prxCheckEnabled;
  }

  public void setPrxCheckEnabled(Boolean prxCheckEnabled) {
    this.prxCheckEnabled = prxCheckEnabled;
  }

  public OrderEnrichment disableViv(Boolean disableViv) {
    this.disableViv = disableViv;
    return this;
  }

  /**
   * Get disableViv
   * @return disableViv
  */
  
  @Schema(name = "disableViv", required = false)
  public Boolean getDisableViv() {
    return disableViv;
  }

  public void setDisableViv(Boolean disableViv) {
    this.disableViv = disableViv;
  }

  public OrderEnrichment products(List<ProductLine> products) {
    this.products = products;
    return this;
  }

  public OrderEnrichment addProductsItem(ProductLine productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  */
  @Valid 
  @Schema(name = "products", required = false)
  public List<ProductLine> getProducts() {
    return products;
  }

  public void setProducts(List<ProductLine> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEnrichment orderEnrichment = (OrderEnrichment) o;
    return Objects.equals(this.customerPONumber, orderEnrichment.customerPONumber) &&
        Objects.equals(this.locationNumber, orderEnrichment.locationNumber) &&
        Objects.equals(this.fillOrKill, orderEnrichment.fillOrKill) &&
        Objects.equals(this.fulfilmentType, orderEnrichment.fulfilmentType) &&
        Objects.equals(this.prxCheckEnabled, orderEnrichment.prxCheckEnabled) &&
        Objects.equals(this.disableViv, orderEnrichment.disableViv) &&
        Objects.equals(this.products, orderEnrichment.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPONumber, locationNumber, fillOrKill, fulfilmentType, prxCheckEnabled, disableViv, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEnrichment {\n");
    sb.append("    customerPONumber: ").append(toIndentedString(customerPONumber)).append("\n");
    sb.append("    locationNumber: ").append(toIndentedString(locationNumber)).append("\n");
    sb.append("    fillOrKill: ").append(toIndentedString(fillOrKill)).append("\n");
    sb.append("    fulfilmentType: ").append(toIndentedString(fulfilmentType)).append("\n");
    sb.append("    prxCheckEnabled: ").append(toIndentedString(prxCheckEnabled)).append("\n");
    sb.append("    disableViv: ").append(toIndentedString(disableViv)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

