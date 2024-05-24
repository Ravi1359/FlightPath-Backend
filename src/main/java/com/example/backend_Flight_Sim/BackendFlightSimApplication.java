package com.example.backend_Flight_Sim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BackendFlightSimApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendFlightSimApplication.class, args);
	}

}
