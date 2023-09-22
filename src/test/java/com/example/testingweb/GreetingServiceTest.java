package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.test.web.servlet.MockMvc;

public class GreetingServiceTest {

	@Test
	public void test1() {
		GreetingService greetingService = new GreetingService();
		assertThat(greetingService.greet()).contains("Hello, World");
	
	}

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void test2() {
		TestingWebApplication myList = mockMvc(TestingWebApplication.class);
		String[] strAr1=new String[] {"Ani", "Sam", "Joe"}; //inline initialization  
		assertThat(myList.main(strAr1)).isNotNull();
	
	}	
}
