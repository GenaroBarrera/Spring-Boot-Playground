package com.example.SpringBootPlayground.OldSpringMockQuestions.DependencyInjectionQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//What will be the output of the below code? TODO answer is in EmployeeService
public class Client{
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display();
    }
}
