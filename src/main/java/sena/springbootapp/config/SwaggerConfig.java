package sena.springbootapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	 public OpenAPI apiDocumentation() {
        return new OpenAPI()
                .info(new Info()
                        .title("API del Sistema de RRHH")
                        .version("1.0")
                        .description("Documentación de los endpoints del sistema. Esta API está en desarrollo."));
    }
}
