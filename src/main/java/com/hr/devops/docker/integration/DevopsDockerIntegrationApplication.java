package com.hr.devops.docker.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDockerIntegrationApplication {

	@GetMapping
	public String message()
	{
		return "Welcome to Devops integration of docker project";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsDockerIntegrationApplication.class, args);
	}

}
