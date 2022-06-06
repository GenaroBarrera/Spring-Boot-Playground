package com.example.SpringBootPlayground.NewSpringMockQuestions.WhatConstructorPrintsFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication{
    public static void main(String[] args){
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }
}

/*
TODO Answer
CustomerDao constructor called.
CustomerService constructor called.

Why does the CustomerDao constructor print first?
I'm assuming it has to do with project structure and how Spring Boot configures beans...
I renamed the service package to Aservice and that made the CustomerService costructor print first.
From what I remember it depends on which beans are defined first.
In what order does @ComponentScan scan beans???
couldn't find much info on this one

 */