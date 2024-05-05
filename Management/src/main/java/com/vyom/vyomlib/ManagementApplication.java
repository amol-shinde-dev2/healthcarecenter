package com.vyom.vyomlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/portal")
public class ManagementApplication {

	@RequestMapping("/id")
	public String getid() {
		
		return "hello dear679";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

}
