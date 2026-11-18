package br.com.fiap.paradacerta.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI paradaCertaOpenAPI() {
        return new OpenAPI().info(new Info()
            .title("ParadaCerta API")
            .description("API backend para a CitizenTech ParadaCerta (Mobilidade Acessível)")
            .version("v1.0.0"));
    }
}