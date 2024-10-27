package com.venuesevents.discovery_msvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMsvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMsvcApplication.class, args);
	}

}
