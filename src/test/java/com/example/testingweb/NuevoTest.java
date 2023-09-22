package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IreyesTest {

	@Test
	public void test1()  {
		GreetingService greetingService = new GreetingService();
		final resultado = greetingService.greet();
		Assertions.equal("Hello, World", resultado)		
	}
}
