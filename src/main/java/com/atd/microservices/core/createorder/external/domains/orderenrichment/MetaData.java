package com.atd.microservices.core.createorder.external.domains.orderenrichment;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.ProductFill;
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
 * MetaData
 */

public class MetaData {

  @JsonProperty("locationNumber")
  private String locationNumber;

  @JsonProperty("products")
  @Valid
  private List<ProductFill> products = null;

  public MetaData locationNumber(String locationNumber) {
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

  public MetaData products(List<ProductFill> products) {
    this.products = products;
    return this;
  }

  public MetaData addProductsItem(ProductFill productsItem) {
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
  public List<ProductFill> getProducts() {
    return products;
  }

  public void setProducts(List<ProductFill> products) {
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
    MetaData metaData = (MetaData) o;
    return Objects.equals(this.locationNumber, metaData.locationNumber) &&
        Objects.equals(this.products, metaData.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationNumber, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaData {\n");
    sb.append("    locationNumber: ").append(toIndentedString(locationNumber)).append("\n");
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

