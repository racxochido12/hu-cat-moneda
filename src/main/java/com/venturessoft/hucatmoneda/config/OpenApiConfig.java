package com.venturessoft.hucatmoneda.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API HU_CAT_MONEDA - Venturessoft")
                        .version("v1")
                        .description("API para CRUD y búsqueda dinámica de HU_CAT_MONEDA")
                        .contact(new Contact().name("OSCAR RAMIREZ").email("rodrigo.gomezrodri@hotmail.com"))
                        .license(new License().name("Proprietary")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("hu-cat-moneda")
                .packagesToScan("com.venturessoft.hucatmoneda.controller")
                .build();
    }
}