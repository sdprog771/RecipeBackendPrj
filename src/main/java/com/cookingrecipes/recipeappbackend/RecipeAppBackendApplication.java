package com.cookingrecipes.recipeappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.cookingrecipes.recipeappbackend.repository")
@EntityScan("com.cookingrecipes.recipeappbackend.domain")
@SpringBootApplication

public class RecipeAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeAppBackendApplication.class, args);
	}



}
