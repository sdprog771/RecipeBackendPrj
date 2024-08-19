package com.cookingrecipes.recipeappbackend.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")///se poio path dld?
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("PUT", "DELETE")//not post??
                .allowedHeaders("*");//bazoume oti theloume?
    }

}
