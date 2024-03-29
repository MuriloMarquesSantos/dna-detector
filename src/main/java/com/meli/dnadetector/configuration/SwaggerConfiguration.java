package com.meli.dnadetector.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        Contact contact = new Contact(
                "Murilo Santos",
                "https://github.com/MuriloMarquesSantos",
                "murilommms@gmail.com");

        return new ApiInfo(
                "Dna Detector API",
                "This API was created for Mercado Livre coding challenge." +
                        "With it, you will be able to detect DNA mutations",
                "1.0",
                "",
                contact,
                "",
                "",
                new ArrayList<>());
    }
}
