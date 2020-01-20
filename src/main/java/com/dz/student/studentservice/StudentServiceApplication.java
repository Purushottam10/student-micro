package com.dz.student.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.dz.student.repository")
@ComponentScan(basePackages = {"com.dz.student"})
public class StudentServiceApplication   extends  SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
