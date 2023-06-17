package com.boot3.config;

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
                        .title("SpringBoot 3 API Document")
                        .description("SpringBoot 3 API")
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

    @Bean // Redis Ranking API (Sample)
    public GroupedOpenApi redisRankingApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/redis/**"};
        return GroupedOpenApi.builder()
                .group("REDIS API")
                .pathsToMatch(paths)
                .addOperationCustomizer(addGlobalHeader)
                .build();
    }

    @Bean // Portal Blog API (Sample)
    public GroupedOpenApi portalBlodApi(OperationCustomizer addGlobalHeader) {
        String[] paths = {"/blog/**"};
        return GroupedOpenApi.builder()
                .group("BLOG API")
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
