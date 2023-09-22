package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingServiceTest {

	@Autowired
	private GreetingService service;

	@Test
	public void contextLoads() throws Exception {
		assertThat(service).isNotNull();
	}
}
