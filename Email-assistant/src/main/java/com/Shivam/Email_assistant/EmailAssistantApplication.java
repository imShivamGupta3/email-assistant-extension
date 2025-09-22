package com.Shivam.Email_assistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailAssistantApplication {

	public static void main(String[] args) {
		//System.out.println("Reading GEMINI_API_URL from environment: " + System.getenv("GEMINI_API_URL"));
		//System.out.println("Reading GEMINI_API_KEY from environment: " + System.getenv("GEMINI_API_KEY"));
		SpringApplication.run(EmailAssistantApplication.class, args);
	}

}
