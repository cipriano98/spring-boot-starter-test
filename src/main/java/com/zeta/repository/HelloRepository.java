package com.zeta.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String get( ) {
        return "Hello JUnit 5";
    }
    
}