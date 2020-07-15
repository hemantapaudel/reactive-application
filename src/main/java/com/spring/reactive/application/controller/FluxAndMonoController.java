package com.spring.reactive.application.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class FluxAndMonoController {


   @GetMapping(value = "/flux" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<String> getFlux(){

       return Flux.just("test-data1","test-data2","test-data3","test-data4")
               .delayElements(Duration.ofSeconds(2))
               .log();


   }

    @GetMapping(value = "/fluxstream",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<String> getFluxStream(){

        return Flux.just("test-data1","test-data2","test-data3","test-data4")
                .delayElements(Duration.ofSeconds(2))
                .log();


    }





}
