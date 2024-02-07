package com.clover.accounts;

import com.clover.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/*@ComponentScans({ @ComponentScan("com.clover.accounts.controller") })
@EnableJpaRepositories("com.clover.accounts.repository")
@EntityScan("com.clover.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Clover Accounts microservice REST API Documentation",
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
				description =  "clover Accounts microservice REST API Documentation",
				url = "https://clover.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
