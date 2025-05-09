package com.example.transferserviceapi;

import com.example.transferserviceapi.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransferControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void testSuccessfulTransfer() {
		Transaction transaction = new Transaction("80801215", "80811215", 100.0);
		ResponseEntity<String> response = restTemplate.postForEntity("/api/transfer", transaction, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Transfer successful.", response.getBody());
	}
}