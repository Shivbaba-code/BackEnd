package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.example.demo.model")
@EnableJpaRepositories(basePackages="com.example.demo.repository")

@SpringBootApplication
@EnableConfigurationProperties
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DeploedtomcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploedtomcatApplication.class, args);
		System.out.println("Hello java");
	}

}
