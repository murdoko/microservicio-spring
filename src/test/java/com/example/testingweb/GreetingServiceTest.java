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
	    @PrepareForTest(SpringApplication.class)
	    public void mainPassesArguments() {
	        mockStatic(SpringApplication.class);
	
	        TestingWebApplication.main(new String[]{"Hello", "World"});
	
	        // start verifying behavior
	        PowerMockito.verifyStatic();
	        // call the static method you want to verify
	        SpringApplication.run(TestingWebApplication.class, new String[]{"Hello", "World"});
	    }
    
	}	
}
