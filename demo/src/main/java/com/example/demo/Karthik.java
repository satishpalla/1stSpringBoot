package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Karthik {
	Karthik()
	{
		System.out.println("Karthik config class");
	}
@Bean
	public Motor getInstance()
	{
		Motor m=new Motor();
		
		return m;
	}
	
}
