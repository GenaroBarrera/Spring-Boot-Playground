package com.example.SpringBootPlayground.NewSpringMockQuestions.AutowiringAdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client{
    public static void main(String[] args){
        //Test: this is a new change
        //Test: this is a second change(test github desktop)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display();
    }
}

/*
TODO Answer: compile time error in AppConfig class
C:\Users\Genaro\Desktop\Spring-Boot-Playground\Spring-Boot-Playground___\src\main\java\com\example\SpringBootPlayground\NewSpringMockQuestions\AutowiringAdd\AppConfig.java:13:16
java: constructor EmployeeService in class com.example.SpringBootPlayground.NewSpringMockQuestions.AutowiringAdd.EmployeeService cannot be applied to given types;
  required: no arguments
  found: com.example.SpringBootPlayground.NewSpringMockQuestions.AutowiringAdd.AddressService
  reason: actual and formal argument lists differ in length
*/
