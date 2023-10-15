package com.atd.microservices.core.createorder.external.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FndConfig {
    private String attribute1;
    private String flexValue;
    private int categoryId;
    private String categorySetName;
    private String description;
    private int flexValueSetId;
    private String flexValueSetName;


}
