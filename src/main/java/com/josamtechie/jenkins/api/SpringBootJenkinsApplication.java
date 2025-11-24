package com.josamtechie.jenkins.api;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

    public static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

    @PostConstruct
    public void init()
    {
        log.info("Spring Boot Jenkins Application started successfully.!!");
    }

	public static void main(String[] args) {
		log.info("Inside SpringBootJenkinsApplication main method.");
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
