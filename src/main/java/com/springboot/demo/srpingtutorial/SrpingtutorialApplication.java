package com.springboot.demo.srpingtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(
		scanBasePackages = {"com.springboot.demo.srpingtutorial.springcoredemo",
							"com.springboot.demo.srpingtutorial.util"

		}
)
public class SrpingtutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SrpingtutorialApplication.class, args);
	}

}
