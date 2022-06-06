package com.example.SpringBootPlayground.NewSpringMockQuestions.WhatConstructorPrintsFirst.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao{

    //Constructor
    public CustomerDao(){
        System.out.println("CustomerDao constructor called. ");
    }
}
