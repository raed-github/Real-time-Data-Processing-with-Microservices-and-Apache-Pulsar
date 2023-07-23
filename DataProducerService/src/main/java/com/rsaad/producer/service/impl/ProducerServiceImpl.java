package com.rsaad.producer.service.impl;

import com.rsaad.producer.service.ProducerService;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Override
    public void produce(String message) {
        System.out.println("mesasge:" + message);
    }
}
