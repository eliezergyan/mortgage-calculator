package com.eli.mortgagecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MortgageCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MortgageCalculatorApplication.class, args);
		System.out.println("Hello Mortgage Calculator");
	}

}
