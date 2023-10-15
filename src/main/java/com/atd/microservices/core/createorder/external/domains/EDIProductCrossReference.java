package com.atd.microservices.core.createorder.external.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EDIProductCrossReference {
	private String oracleNumber;
	private String partnerId;
	private String partnerName;
	private String partnerNumber;
	private String supplierNumber;
	private String unitOfMeasure;
	private String quantity;

}
