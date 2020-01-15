package com.zeta.services;

import com.zeta.repository.HelloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloRepository  helloRepository;
    
    public String get( ) {
        return helloRepository.get();
    }

}