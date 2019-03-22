package com.benjamin.requiredNeeds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class RequiredNeedsApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(RequiredNeedsApplication.class, args);
		
		
	}

}
