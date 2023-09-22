package com.example.testingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingWebApplication.class, args);
		System.out.println(printMessage1("Ok"));
	}

	static String printMessage1(String value) {
            return value;
    }
}
