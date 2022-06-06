package com.example.SpringBootPlayground.NewSpringMockQuestions.WhatConstructorPrintsFirst.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    //constructor
    public CustomerService(){
        System.out.println("CustomerService constructor called. ");
    }
}
