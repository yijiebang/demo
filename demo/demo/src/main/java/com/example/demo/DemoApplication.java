package com.example.demo;
 
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2 
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller","com.example.server"})
@MapperScan(basePackages ="com.example.dao")
public class DemoApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(DemoApplication.class, args);
	}

}
 
