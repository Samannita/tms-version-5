package com.cg.tms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cg.tms"})
public class TmsBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsBootApplication.class, args);
		System.out.print("WELCOME TO SPRING BOOT APPLICATION");
	}

	}


