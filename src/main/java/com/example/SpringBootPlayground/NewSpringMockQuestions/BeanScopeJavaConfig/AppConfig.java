package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean
    public EmployeeService employee(){
        return new EmployeeService();
    }

    @Bean
    public AddressService add(){
        return new AddressService();
    }
}
