package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//What will be the output of the below code?
public class Client{
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display();
    }
}

/*
TODO Answer
Exception in thread "main" java.lang.NullPointerException
	at com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeJavaConfig.EmployeeService.display(EmployeeService.java:7)
	at com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeJavaConfig.Client.main(Client.java:13)

See explanation in EmployeeService.java
 */
