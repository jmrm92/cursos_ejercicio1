package com.master.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan (basePackages="com.master.cursos.model")
@SpringBootApplication(scanBasePackages = {"com.master.cursos.controller", "com.master.cursos.service"})
public class CursosApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

}
