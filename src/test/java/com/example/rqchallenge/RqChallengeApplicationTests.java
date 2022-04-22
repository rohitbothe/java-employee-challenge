package com.example.rqchallenge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.rqchallenge.employees.controller.IEmployeeController;
import com.example.rqchallenge.employees.service.IEmployeeService;

@SpringBootTest
class RqChallengeApplicationTests {
    
    @Autowired
	private IEmployeeController iEmployeecontroller;
    
    @Autowired
	private IEmployeeService iEmployeeService;

	@Test
	public void contextLoads() throws Exception {
		assertThat(iEmployeecontroller).isNotNull();
		assertThat(iEmployeeService).isNotNull();
	}
	
}
