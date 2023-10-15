package com.atd.microservices.core.createorder.router;

import com.atd.microservices.core.createorder.domains.CreateOrder;
import com.atd.microservices.core.createorder.domains.CreateOrderMaster;
import com.atd.microservices.core.createorder.exception.ErrorDetails;
import com.atd.microservices.core.createorder.external.domains.FillStatus;
import com.atd.microservices.core.createorder.external.domains.FulfillSourceType;
import com.atd.microservices.core.createorder.handler.CreateOrderHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class CreateOrderRouter {

    @Bean
    @RouterOperation(operation = @Operation(description = "Create Order.", operationId = "createorder", tags = "Create Order",
        requestBody = @RequestBody(description = "Create Order Request", required = true, content = @Content(schema = @Schema(implementation = CreateOrder.class))),
        responses = {
                @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Fields are with validation errors", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                @ApiResponse(responseCode = "404", description = "Data not found with provided ProductReq Group Id for Create Order", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                @ApiResponse(responseCode = "406", description = "Request not acceptable for Create Order", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                @ApiResponse(responseCode = "424", description = "Request not processed due to failed dependecy Create Order", content = @Content(schema = @Schema(implementation = ErrorDetails.class)))

        }
    ))
    public RouterFunction<ServerResponse> createOrder(final CreateOrderHandler createOrderHandler) {
        return route()
                .POST("/", accept(APPLICATION_JSON), createOrderHandler::createOrder)
                .build();
    }

    @Bean
    @RouterOperation(operation = @Operation(description = "Create Order by location.", operationId = "createorderbylocation", tags = "Create Order",
            parameters = {
                @Parameter(in = ParameterIn.PATH, name = "locationNumber", description = "Location Number"),
                @Parameter(in = ParameterIn.QUERY, name = "fillOrKill", description = "Fill or Kill", schema = @Schema(implementation = FillStatus.class)),
                @Parameter(in = ParameterIn.QUERY, name = "customerID", description = "Customer ID"),
                @Parameter(in = ParameterIn.QUERY, name = "fulfillmentType", description = "Fulfillment Type", schema = @Schema(implementation = FulfillSourceType.class))
            },
            requestBody = @RequestBody(description = "Create Order Request", required = true, content = @Content(schema = @Schema(implementation = CreateOrderMaster.class))),
            responses = {
                    @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = String.class))),
                    @ApiResponse(responseCode = "400", description = "Fields are with validation errors", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                    @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                    @ApiResponse(responseCode = "404", description = "Data not found with provided ProductReq Group Id for Create Order", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                    @ApiResponse(responseCode = "406", description = "Request not acceptable for Create Order", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
                    @ApiResponse(responseCode = "424", description = "Request not processed due to failed dependecy Create Order", content = @Content(schema = @Schema(implementation = ErrorDetails.class)))

            }
    ))
    public RouterFunction<ServerResponse> createOrderByLocation(final CreateOrderHandler createOrderHandler) {
        return route()
                .POST("/location/{locationNumber}", accept(APPLICATION_JSON), createOrderHandler::createOrderByLocation)
                .build();
    }
}
