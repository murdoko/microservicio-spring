package com.example.testingweb;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
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
		TestingWebApplication myList = this.mockMvc(TestingWebApplication.class);
		String[] strAr1=new String[] {"Ani", "Sam", "Joe"}; //inline initialization  
		assertThat(myList.main(strAr1)).isNotNull();
	
	}	
}
