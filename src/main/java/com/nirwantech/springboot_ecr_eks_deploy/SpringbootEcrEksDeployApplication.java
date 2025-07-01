package com.nirwantech.springboot_ecr_eks_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootEcrEksDeployApplication {

	@GetMapping("/hello")
	public String message(){
		return "Wlcome to Nirwantech app deploy into AWS EKS!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEcrEksDeployApplication.class, args);
	}

}
