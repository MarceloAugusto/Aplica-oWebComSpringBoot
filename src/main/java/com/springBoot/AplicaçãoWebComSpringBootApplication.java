package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.springBoot.entity" })
@EnableJpaRepositories(basePackages = { "com.springBoot.repository" })
@ComponentScan(basePackages = {"com.springBoot.controller"})
public class AplicaçãoWebComSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicaçãoWebComSpringBootApplication.class, args);
	}
}
