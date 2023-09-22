package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import org.springframework.test.web.servlet.MockMvc;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

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
	    public void mainPassesArguments() {
		mockStatic(SpringApplication.class);
	        TestingWebApplication.main(new String[]{"Hello", "World"});
		verifyStatic(SpringApplication.class);
        	SpringApplication.run(ElectronicGiftcardServiceApplication.class, new String[]{"Hello", "World"});
	    }
    
		
}
