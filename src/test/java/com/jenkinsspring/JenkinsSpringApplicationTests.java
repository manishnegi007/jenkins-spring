package com.jenkinsspring;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsSpringApplicationTests {

	public static Logger log = LoggerFactory.getLogger(JenkinsSpringApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Test case executed.....");
		assertEquals("true", true);
	}

}
