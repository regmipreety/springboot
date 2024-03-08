package com.springboot.demo.srpingtutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(
		scanBasePackages = {"com.springboot.demo.srpingtutorial.springcoredemo",
							"com.springboot.demo.srpingtutorial.util",
							"com.springboot.demo.srpingtutorial.config"

		}
)
public class SrpingtutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SrpingtutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner-> {
			System.out.println("Hello world");
		};
	}

}
