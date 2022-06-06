package com.example.SpringBootPlayground.NewSpringMockQuestions.RegularVsCommercial.component;

import org.springframework.stereotype.Component;

@Component(value = "commercial")
public class CommercialCustomer implements Customer {
    @Override
    public void display() {
        System.out.println("Commercial Customer");
    }
}
