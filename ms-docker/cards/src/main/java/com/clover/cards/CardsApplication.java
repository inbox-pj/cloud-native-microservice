package com.clover.cards;

import com.clover.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.clover.cards.controller") })
@EnableJpaRepositories("com.clover.cards.repository")
@EntityScan("com.clover.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Clover Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Pankaj Jaiswal",
						email = "pjaiswal@clover.com",
						url = "https://www.clover.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.clover.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Clover Cards microservice REST API Documentation",
				url = "https://www.clover.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
