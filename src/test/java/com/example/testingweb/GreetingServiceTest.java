package com.example.testingweb;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		Assertions.assertEquals("Hello, World", greetingService.greet());
	
	}
}
