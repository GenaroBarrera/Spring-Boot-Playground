package com.example.SpringBootPlayground.NewSpringMockQuestions.MultipleBeanDefinitions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client{
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = (EmployeeService) context.getBean("employeeService1");
        EmployeeService emp2 = context.getBean("employeeService2", EmployeeService.class);
        emp.display();
        emp2.display();
    }
}

/*
TODO Answer create two beans employeeService1 and employeeService2 of type EmployeeService
Note: however you can't simply access the beans using class type access context.getBean(EmployeeService.class);
That method only works when unique bean of that is present in the container (not multiple bean definitions)

Access instead using bean Id and type cast as above
or access the bean by bean Id and type context.getBean("employeeService1", EmployeeService.class);

This is a similar situation as needing @Qualifier when specifying between two beans such as in the RegularVsCommercial example
 */

