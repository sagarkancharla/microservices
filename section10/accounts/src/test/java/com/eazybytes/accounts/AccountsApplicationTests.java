package com.eazybytes.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatusCode;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AccountsApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	@DisplayName("test case for actuator health endpoint")
	@Test
	void testActuatorHealthEndpoint() {
		Assertions.assertEquals(restTemplate.getForEntity("/actuator/health", Object.class).getStatusCode(),
				HttpStatusCode.valueOf(200));
	}

}
