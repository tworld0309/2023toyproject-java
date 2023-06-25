package com.hotel.serverapi.config;

import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;

@Configuration
public class SwaggerConfig {

    @Bean // Global API
    public OpenAPI customizeGlobalApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Hotel Reservation API Document")
                        .description("Hotel Reservation")
                );
    }

    @Bean // TEST API
    public GroupedOpenApi testApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/test/**"};
        return GroupedOpenApi.builder()
                .group("TEST API")
                .pathsToMatch(paths)
                .addOperationCustomizer(addGlobalHeader)
                .build();
    }

    @Bean // USER API
    public GroupedOpenApi userApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/user/**"};
        return GroupedOpenApi.builder()
                .group("USER API")
                .pathsToMatch(paths)
                .addOperationCustomizer(addGlobalHeader)
                .build();
    }

    @Bean // reservation
    public GroupedOpenApi reservationApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/reservation/**"};
        return GroupedOpenApi.builder()
                .group("Reservation API")
                .pathsToMatch(paths)
                .addOperationCustomizer(addGlobalHeader)
                .build();
    }

    @Bean // Stock
    public GroupedOpenApi stockApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/stock/**"};
        return GroupedOpenApi.builder()
                .group("Stock API")
                .pathsToMatch(paths)
                .addOperationCustomizer(addGlobalHeader)
                .build();
    }

    @Bean // Stock
    public GroupedOpenApi assignApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/assign/**"};
        return GroupedOpenApi.builder()
                .group("Assign API")
                .pathsToMatch(paths)
                .addOperationCustomizer(addGlobalHeader)
                .build();
    }


    @Bean // Global Parameter
    public OperationCustomizer addGlobalParameter() {
        return (Operation operation, HandlerMethod handlerMethod) -> {
            Parameter acceptLanguageHeader = new Parameter()
                    .in(ParameterIn.HEADER.toString())
                    .schema(new StringSchema()._default("KO_KR").name("Accept-Language"))
                    .name("Accept-Language")
                    .description("Accept Language(Default: KO_KR)")
                    .required(true);
            operation.addParametersItem(acceptLanguageHeader);
            return operation;
        };
    }


}
