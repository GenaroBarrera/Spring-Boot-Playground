package com.example.SpringBootPlayground.NewSpringMockQuestions.SetterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{

    @Bean // EmployeeService bean definition using Setter Injection
    public EmployeeService employee(){
        EmployeeService e= new EmployeeService(); //we can't just return a new instance, we have inject our values as well
        e.setAdd(add()); //use the SetAdd() method from EmployeeService to inject add() (our AddressService bean defining method) into the property add found in EmployeeService
        return e; //now we can return our new instance of EmployeeService e after we have injected our value (add) through setter injection e.setAdd(add())
    }

    @Bean
    public AddressService add(){
        return new AddressService();
        //Note: all we're doing here is returning a new instance of AddressService
        //same as instantiating an object using: EmployeeService e= new EmployeeService();
        //but without making it tightly coupled
    }
}
