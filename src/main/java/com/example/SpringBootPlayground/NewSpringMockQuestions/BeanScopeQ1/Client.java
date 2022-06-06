package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//What will be the output of the below code?
public class Client{
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //EmployeeService emp = context.getBean("employeeServ"); //TODO (answer) compile time error: type mismatch in client class
        EmployeeService emp = (EmployeeService) context.getBean("employeeServ"); //fixed: Cast bean object to EmployeeService class??? make sure this is accurate!
        //EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display();
    }
}
