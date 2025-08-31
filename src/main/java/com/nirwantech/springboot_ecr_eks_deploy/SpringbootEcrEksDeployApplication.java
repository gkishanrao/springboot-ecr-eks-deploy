package com.nirwantech.springboot_ecr_eks_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class SpringbootEcrEksDeployApplication {


	@GetMapping("/hello")
	public String message(){
		String title = "Congratulation you successfully deployed your application to AWS Kubernetes!!";
		 return "<h1>" + title + "</h1>" ;
	}

	@GetMapping("/getCustomers")
	public List<Customer> getCustomer(){
		return Stream.of(new Customer("Kishan","kishanrao@gmail.com","Male"),
				new Customer("Sahasra","sahara@gmail.com","Female"),
				new Customer("Sunitha","sunitha@gmail.com","Female"),
				new Customer("Jyodeep","jyodeep@gmail.com","Male"),
				new Customer("Vinay","vinay@gmail.com","Male"))
				.collect(Collectors.toList());
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootEcrEksDeployApplication.class, args);
	}

}
