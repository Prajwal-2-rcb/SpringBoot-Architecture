package com.codesnippet.springbootdemoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.codesnippet.ecomassistance","com.codesnippet.springbootdemoapplication"})
public class SpringbootdemoapplicationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =SpringApplication.run(SpringbootdemoapplicationApplication.class, args);
		System.out.println("context created");
	}

}
