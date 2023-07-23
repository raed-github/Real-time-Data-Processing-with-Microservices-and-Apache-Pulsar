package com.rsaad.producer.controller;

import com.rsaad.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producers")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping
    public void produceMessage(@RequestBody String message) {
        producerService.produce(message);
    }
}
