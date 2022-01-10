package com.in28minutes.rest.webservices.restfulwebservices;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class RestfulWebServicesApplication {

	private void insertFourUsers(UserRepository repo){
		repo.save(new User(1, "Tim", new Date()));
		repo.save(new User(2, "Tam", new Date()));
		repo.save(new User(3, "Tom", new Date()));
	}

	@Bean
	public CommandLineRunner run(UserRepository repo) {
		return (args -> {
			insertFourUsers(repo);
			System.out.println(repo.findAll());
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
