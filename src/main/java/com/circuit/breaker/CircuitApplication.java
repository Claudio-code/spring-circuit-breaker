package com.circuit.breaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
class CircuitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitApplication.class, args);
	}

}
