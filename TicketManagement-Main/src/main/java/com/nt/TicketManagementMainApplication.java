package com.nt;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketManagementMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketManagementMainApplication.class, args);
		//kusuma hhjhjh
	}
	
	@Bean//singleTon map objectt
	public Map<String,Object> singletonMapObject()
	{
		return new HashMap<>();
	}

}
