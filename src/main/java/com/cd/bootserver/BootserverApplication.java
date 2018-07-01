package com.cd.bootserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BootserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootserverApplication.class, args);
	}
}
