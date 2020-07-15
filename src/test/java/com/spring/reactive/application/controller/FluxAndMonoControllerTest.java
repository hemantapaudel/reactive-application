package com.spring.reactive.application.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;



@WebFluxTest(FluxAndMonoController.class)
public class FluxAndMonoControllerTest {

    @Autowired
    WebTestClient webTestClient;


    @Test
    public void testFluxTest1() {

        Flux<String> response = webTestClient.get().uri("/fluxstream")
                .exchange()
                .expectStatus()
                .isOk()
                .returnResult(String.class)
                .getResponseBody();

        StepVerifier.create(response)
                .expectNext("test-data1test-data2test-data3test-data4")
                .verifyComplete();

    }

}
