package com.group7.bookshopwebsite;

import com.github.slugify.Slugify;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition()
public class BookshopwebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopwebsiteApplication.class, args);
    }

    @Bean
    public Slugify slugify() {
        return new Slugify();
    }

}
