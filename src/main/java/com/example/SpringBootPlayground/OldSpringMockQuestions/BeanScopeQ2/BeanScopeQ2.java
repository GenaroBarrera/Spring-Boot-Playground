package com.example.SpringBootPlayground.OldSpringMockQuestions.BeanScopeQ2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class EmployeeService{ //NOTE: I had to remove public from each class since I'm running them in a single file
    //private AddressService add; //(original) this is just a declaration
    private AddressService add = new AddressService(); //This is valid way of using add, (creating an addressService object)
    public void display() {
        System.out.println(add.getDetails()); //NOTE: I also fixed what's I'm assuming was a bug here (missing () in getDetails() method)
    }
}

class AddressService{
    public String getDetails(){

        return "Electronic City";
    }
}

@Configuration
class AppConfig{
    @Bean
    public EmployeeService employee(){
        //return new EmployeeService(add()); //(original) what is add()? Error EmployeeService() takes in no arguments!
        return new EmployeeService();
    }

    @Bean
    public AddressService add(){
        return new AddressService();
    }
}

//What will be the output of the below code?
class Client{
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display(); //TODO: (answer) ultimately I'm getting a NPE from display() how do I fix this?
    }
}
