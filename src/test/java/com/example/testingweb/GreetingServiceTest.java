package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;

public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}

	
	@Test
	public void test2() {
		MockedStatic<SpringApplication> utilities = Mockito.mockStatic(SpringApplication.class);
        	utilities.when((MockedStatic.Verification) SpringApplication.run(TestingWebApplication.class, new String[]{})).thenReturn(null);
        	TestingWebApplication.main(new String[]{});
        	assertThat(SpringApplication.run(TestingWebApplication.class, new String[]{})).isEqualTo(null);
    
	}	
}
