package com.example.SpringBootPlayground.NewSpringMockQuestions.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client{
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display();
    }
}

/*
TODO Answer displays Electronic City
This is an example of setter injection in which we inject an object dependency (AddressService) into EmployeeService.
Read the comments in the application to understand the process of setter injection!
 */
