package com.example.selenium_training_1.selenium_Training;

import org.springframework.boot.SpringApplication;

public class TestSeleniumTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.from(SeleniumTrainingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
