package com.mauricio.todoapp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


// @Configuration tiene la capacidad de crear bean
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // este es el bean
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    // El bean de arriba tiene un grupo de información asociado que es este ste
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Todo API",
                "La API REST de ToDo App.",
                "v1",
                "Terms of service",
                new Contact("MauricioOcampo S.A", "maoocampo.wixsite.com/mauricio-ocampo", "maoocampo@hotmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }

    /*

    // este es el bean
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mauricio.todoapp"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apinfo());
    }

    // El bean de arriba tiene un grupo de información asociado
    private ApiInfo apinfo(){

        Contact contact = new Contact("MauricioOcampo S.A", "maoocampo.wixsite.com/mauricio-ocampo", "maoocampo@hotmail.com");

        String title, description, version, termsOfServiceUrl, contactName,contactEmail,license,licenseUrl ;

        return new ApiInfo(
                title = "TodoApp",
                description = "Todo app",
                version = "1.0",
                termsOfServiceUrl = "1.0",
                contactName = contact.getName(),
                license = "1.0",
                licenseUrl ="maoocampo.wixsite.com/mauricio-ocampo"

        );

    }*/

}
