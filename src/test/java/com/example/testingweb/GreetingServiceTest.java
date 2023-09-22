package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		final greet resultado = greetingService.greet();
		Assertions.assertEquals("Hello, World", resultado);
		
	}
}
