package com.josamtechie.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootJenkinsApplicationTests {

    public static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
        log.info("Spring Boot Jenkins Application test case execution started");
        log.info("Spring Boot Jenkins Application test case execution started second log for testing");
        assertEquals(true,true);
	}

}
