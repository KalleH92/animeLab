package com.kalleH.animeLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "com.kalleH.animeLab.Controller")
public class AnimeLabApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnimeLabApplication.class, args);
	}

}
