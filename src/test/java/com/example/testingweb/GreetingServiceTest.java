package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


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
	    public void mainPassesArguments() {
		Mockito.mockStatic(SpringApplication.class);
	        TestingWebApplication.main(new String[]{"Hello", "World"});
		Mockito.verify(SpringApplication.class);
        	//SpringApplication.run(TestingWebApplication.class, new String[]{"Hello", "World"});
	    }
    
		
}
