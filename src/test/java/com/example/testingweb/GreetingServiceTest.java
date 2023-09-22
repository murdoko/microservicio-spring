package com.example.testingweb;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertEquals;

public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		final greet resultado = greetingService.greet();
		Assertions.assertEquals("Hello, World", resultado);
		
	}
}
