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
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableDiscoveryClient
/*@ComponentScans({ @ComponentScan("com.clover.cards.controller") })
@EnableJpaRepositories("com.clover.cards.repository")
@EntityScan("com.clover.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "clover Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Pankaj Jaiswal",
						email = "pjaiswal@clover.com",
						url = "https://clover.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://clover.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "clover Cards microservice REST API Documentation",
				url = "https://clover.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
