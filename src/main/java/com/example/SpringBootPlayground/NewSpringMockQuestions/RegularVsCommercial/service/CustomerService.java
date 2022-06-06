package com.example.SpringBootPlayground.NewSpringMockQuestions.RegularVsCommercial.service;

import com.example.SpringBootPlayground.NewSpringMockQuestions.RegularVsCommercial.component.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    @Qualifier("commercial")
    Customer cus;
    //without @Qualifier to specify which bean to autowire, the application fails to start
    //This is because we have two beans that implement from the same interface Customer
    //Thus when autowiring Customer cus, spring doesn't know which implementation to use

    public void display() {
        cus.display();
    }
}
