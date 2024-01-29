package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties({AccountsContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableFeignClients
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices RESt API Documentation",
				description = "EazyBank Accounts microservices RESt API Documentation",
				version = "v1",
				contact = @Contact(
						name = "sagar",
						email = "sagar.k@gmail.com",
						url = "https://sagar.com"
				),
				license = @License(
						name = "Apache2.0",
						url = "https://sagar.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservices RESt API Documentation",
				url = "https://sagar.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
