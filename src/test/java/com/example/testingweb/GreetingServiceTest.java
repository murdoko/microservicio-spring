package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;


import org.springframework.test.web.servlet.MockMvc;


import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;

@RunWith(MockitoJUnitRunner.class)
public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}
	
	@Mock
	private SpringApplicationBuilder springApplicationBuilder;
	
	    @Test
	    public void mainPassesArguments() {
		//TestingWebApplication.main(new String[] {});
		//Assertions.assertTrue(true);
		//Mockito.mockStatic(SpringApplication.class);
	        //TestingWebApplication.main(new String[]{"Hello", "World"});
		//Mockito.verify(SpringApplication.class);
        	//SpringApplication.run(TestingWebApplication.class, new String[]{"Hello", "World"});

		TestingWebApplication app = new TestingWebApplication();
		Mockito.when(springApplicationBuilder.sources(TestingWebApplication.class)).thenReturn(springApplicationBuilder);
		SpringApplicationBuilder result = app.configure(springApplicationBuilder);
		Mockito.verify(springApplicationBuilder).sources(TestingWebApplication.class);
		assertEquals(springApplicationBuilder, result);
		    
	    }
    
		
}
