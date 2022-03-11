package com.lab.engenharia.apirotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiRotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRotasApplication.class, args);
	}

}
