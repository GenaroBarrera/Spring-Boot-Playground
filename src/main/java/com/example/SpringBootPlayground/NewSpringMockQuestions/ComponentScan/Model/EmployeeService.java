package com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{
    @Autowired //Note: if you comment out this annotation, then add won't get injected with the AddressService bean. (Results in NPE)
    private AddressService add;

    public void display() {
        System.out.println(add.getDetails()); //are the missing () after getDetails intentional?
    }

    //setter methods
    //we're not using any setter injection for this example so it won't affect the outcome
}
