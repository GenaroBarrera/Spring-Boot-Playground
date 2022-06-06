package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeQ1;

//A spring configuration file is shown below:
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean
    public EmployeeService employeeServ(){
        return new EmployeeService();
    }
}
