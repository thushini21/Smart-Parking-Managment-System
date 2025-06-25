package com.example.parkingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ParkingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingServerApplication.class, args);
	}

}
