package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
//@EnableHystrix
public class EurekeaAPiGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekeaAPiGetwayApplication.class, args);
	}

}
