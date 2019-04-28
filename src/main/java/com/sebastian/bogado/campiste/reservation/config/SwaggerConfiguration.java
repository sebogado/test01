package com.sebastian.bogado.campiste.reservation.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false)
				.select()
				.apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.sebastian.bogado.campiste.reservation.rest"))
				.paths(paths()).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Campiste reservation")
				.description("Created by Bogado Sebastian")
				.version("1.0")
				.termsOfServiceUrl("https://github.com/sebogado/")
				.build();
	}

	private Predicate paths() {
		return or(
				regex("/api.*"));
	}
}
