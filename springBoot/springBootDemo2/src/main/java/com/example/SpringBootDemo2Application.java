package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
		performAction();
	}

	 private static final Logger logger = LoggerFactory.getLogger(SpringBootDemo2Application.class);

	    public static void performAction() {
	        logger.trace("A trace message.");
	        logger.debug("A debug message.");
	        logger.info("Performing an action in MyService.");
	        logger.warn("A warning occurred.");
	        logger.error("An error occurred!");
	    }
}
