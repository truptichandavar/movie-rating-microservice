package com.trupti.moviedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDataApplication.class, args);
	}

}
