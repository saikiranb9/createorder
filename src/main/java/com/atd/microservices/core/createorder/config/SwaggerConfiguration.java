package com.atd.microservices.core.createorder.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfiguration {

    private final ApplicationProperties applicationProperties;

    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI()
                .components(new Components())
                .servers(getServerList())
                .info(new Info()
                        .title("Create Order")
                        .version(appVersion)
                        .license(new License().name("Apache 2.0")
                        .url("http://springdoc.org")));
    }

    private List<Server> getServerList(){
        Server server;
        if(applicationProperties.getEnvHostURL()!=null) {
            server = new Server()
                    .url("/".concat(applicationProperties.getApplicationName()))
                    .description("Create Order Server");
        } else {
            server = new Server()
                    .url("/")
                    .description("Create Order Server");
        }
        return Collections.singletonList(server);
    }

}
