package com.jenkinsspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringApplication {

	public static Logger log = LoggerFactory.getLogger(JenkinsSpringApplication.class);

	public static void main(String[] args) {
		log.info("Jekins-Application Running....");
		SpringApplication.run(JenkinsSpringApplication.class, args);
	}

}
