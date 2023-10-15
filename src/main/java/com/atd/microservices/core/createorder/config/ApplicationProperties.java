package com.atd.microservices.core.createorder.config;

import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Vijay, YERRA
 */
@Component
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public @Data class ApplicationProperties {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${env.host.url:#{null}}")
    private String envHostURL;
    private String kafkaOrderAckTopic;
    private WebClient webclient;

    @Setter
    public static class WebClient {
        private String apigatewayUrl;
        private String msaBasePath;
        private String customerlocationStorenumberUrl;
        private String customerlocationAttribute4Url;
        private String ediconfigUrl;
        private String edicrossrefUrl;
        private String orderenrichmentUrl;
        private String productXrefUrl;
        private String processorderProcessUrl;
        private String catalogOrgidUrl;
        private String productInvidOrgidUrl;
        private String productInvidOrgidAttrUrl;
        private String customerlocationLocationnumberUrl;
        private String productFindbyproductnumberUrl;
        private String fndConfigUrl;

        public String getCustomerlocationStorenumberUrl() {
            return msaBasePath + ApplicationConstants.SLASH + customerlocationStorenumberUrl;
        }

        public String getCustomerlocationAttribute4Url() {
            return msaBasePath + ApplicationConstants.SLASH + customerlocationAttribute4Url;
        }

        public String getCustomerlocationLocationnumberUrl() {
            return msaBasePath + ApplicationConstants.SLASH + customerlocationLocationnumberUrl;
        }

        public String getEdiconfigUrl() {
            return apigatewayUrl + ApplicationConstants.SLASH + ediconfigUrl;
        }
        
        public String getEdicrossrefUrl() {
        	return apigatewayUrl + ApplicationConstants.SLASH + edicrossrefUrl;
        }

        public String getOrderenrichmentUrl() {
            return msaBasePath + ApplicationConstants.SLASH + orderenrichmentUrl;
        }

        public String getProductXrefUrl() {
            return msaBasePath + ApplicationConstants.SLASH + productXrefUrl;
        }

        public String getProcessorderProcessUrl() {
            return msaBasePath + ApplicationConstants.SLASH + processorderProcessUrl;
        }

        public String getCatalogOrgidUrl() {
            return msaBasePath + ApplicationConstants.SLASH + catalogOrgidUrl;
        }

        public String getProductInvidOrgidUrl() {
            return msaBasePath + ApplicationConstants.SLASH + productInvidOrgidUrl;
        }

        public String getProductInvidOrgidUrlAttrnme(){
            return msaBasePath + ApplicationConstants.SLASH + productInvidOrgidAttrUrl;
        }

        public String getProductFindbyproductnumberUrl() {
            return msaBasePath + ApplicationConstants.SLASH + productFindbyproductnumberUrl;
        }

        public String getFndConfigUrl(){
            return msaBasePath + ApplicationConstants.SLASH + fndConfigUrl;
        }

        public String getApigatewayUrl() {
            return apigatewayUrl;
        }

        public String getMsaBasePath() {
            return msaBasePath;
        }
    }
}
