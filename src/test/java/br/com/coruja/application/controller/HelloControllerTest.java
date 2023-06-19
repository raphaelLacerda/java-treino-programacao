package br.com.coruja.application.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {
    @Autowired
    protected WebTestClient web;

    @BeforeEach
    public void setUp() {
        web = web.mutate().responseTimeout(Duration.ofMillis(10000)).build();
    }

    @Test
    public void deve_dizer_ola_mundo() {

        web.get().uri("/api/ola").accept(MediaType.ALL).exchange().expectStatus().isOk().expectBody(String.class)
                .value(c -> assertEquals("Olá Mundo!", c));
    }

}