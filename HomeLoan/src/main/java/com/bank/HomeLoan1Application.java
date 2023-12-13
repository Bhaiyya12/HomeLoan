package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoan1Application {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoan1Application.class, args);
	}

}
