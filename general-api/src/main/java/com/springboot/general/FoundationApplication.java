package com.springboot.general;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.general.dal.mapper")
public class FoundationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoundationApplication.class, args);
	}

}
