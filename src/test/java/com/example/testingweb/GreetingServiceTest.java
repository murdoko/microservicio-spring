package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}
	@Test
	public void test2() {
		TestingWebApplication testingWebApplication = new TestingWebApplication();
		String[] arrayParam = [1,2];
		assertThat(testingWebApplication.main(arrayParam)).isNotNull();
	
	}	
}
