package com.example.SpringBootPlayground.NewSpringMockQuestions.MultipleBeanDefinitions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeService employeeService1(){
        return new EmployeeService();
    }

    @Bean
    public EmployeeService employeeService2(){
        return new EmployeeService();
    }
}
