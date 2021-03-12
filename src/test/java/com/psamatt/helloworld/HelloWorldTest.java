package com.psamatt.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloWorldTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnName() {
        String actual = callEndpoint("John");

        assertThat(actual).contains("Hello John");
    }

    private String callEndpoint(String name) {
        return restTemplate.getForObject(buildUrl(name), String.class);
    }

    private String buildUrl(String name) {
        return format("http://localhost:%s/hello?name=%s", port, name);
    }
}
