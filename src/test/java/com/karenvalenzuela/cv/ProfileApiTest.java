package com.karenvalenzuela.cv;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProfileApiTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnProfile() {
        String response = this.restTemplate
                .getForObject("http://localhost:" + port + "/api/v1/profile", String.class);

        assertThat(response).contains("Karen Valenzuela");
    }
    
}
