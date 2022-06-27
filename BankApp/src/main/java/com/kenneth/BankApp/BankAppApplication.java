package com.kenneth.BankApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.kenneth.BankApp.Beans")
public class BankAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankAppApplication.class, args);
	}

}
