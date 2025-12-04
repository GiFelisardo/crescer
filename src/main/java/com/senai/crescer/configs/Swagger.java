package com.senai.crescer.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Crescer - loja infantil",
        version = "1.0",
        description = "Giovanna Fernandes Felisardo - 2 Info B"
    )
)
public class Swagger {
    
}