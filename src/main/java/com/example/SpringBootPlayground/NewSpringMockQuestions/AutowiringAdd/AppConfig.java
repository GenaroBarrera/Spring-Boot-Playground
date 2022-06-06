package com.example.SpringBootPlayground.NewSpringMockQuestions.AutowiringAdd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean
    public EmployeeService employee(){
        //Simple line to get rid of the compilation error
        return new EmployeeService(); //this would return a NullPointerException similar to BeanScopeJavaConfig

        //return new EmployeeService(add()); //what is this trying to do?
        //passing a method call/bean instance? we only have the default constructor in EmployeeService
        //this won't compile as is
    }

    @Bean
    public AddressService add(){
        return new AddressService();
    }
}
