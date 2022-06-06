package com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan.Model;

import org.springframework.stereotype.Service;

@Service
public class AddressService{
    public String getDetails(){
        return "Electronic City";
    }
}
