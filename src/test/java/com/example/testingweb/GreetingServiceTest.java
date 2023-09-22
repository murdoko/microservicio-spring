package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;


import org.springframework.test.web.servlet.MockMvc;


import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.mock.mockito.MockBean;

public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}

	@MockBean
  	private SpringApplicationBuilder springApplicationBuilder;
	
	@Test
	public void test2() {
		//TestingWebApplication.main(new String[] {});
		//Assertions.assertTrue(true);
		//Mockito.mockStatic(SpringApplication.class);
		//TestingWebApplication.main(new String[]{"Hello", "World"});
		//Mockito.verify(SpringApplication.class);
		//SpringApplication.run(TestingWebApplication.class, new String[]{"Hello", "World"});
	
		//TestingWebApplication app = new TestingWebApplication();		
		//app.main(new String[]{});

			
		TestingWebApplication app = new TestingWebApplication();
		Mockito.when(springApplicationBuilder.sources(TestingWebApplication.class)).thenReturn(springApplicationBuilder);
		SpringApplicationBuilder result = app.main(new String[]{"Hello", "World"});
		Mockito.verify(springApplicationBuilder).sources(TestingWebApplication.class);
		Assertions.assertEquals(springApplicationBuilder, result);
	    
	}
    
		
}
