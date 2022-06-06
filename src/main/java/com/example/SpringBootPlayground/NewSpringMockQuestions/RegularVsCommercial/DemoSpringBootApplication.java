package com.example.SpringBootPlayground.NewSpringMockQuestions.RegularVsCommercial;

import com.example.SpringBootPlayground.NewSpringMockQuestions.RegularVsCommercial.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class DemoSpringBootApplication{
    public static void main(String[] args){
        //Note: the original question didn't include the variable context of type ApplicationContext
        //I'm assuming that's a mistake
        ApplicationContext context = SpringApplication.run(DemoSpringBootApplication.class, args);
        CustomerService service = context.getBean(CustomerService.class);
        service.display();
    }
}

/*
TODO Answer displays Commercial Customer
Since we're using @Qualifier("commercial") in CustomerService to specify which bean to autowire into Customer cus,
the application runs without issue.

without using @Qualifier in CustomerService spring throws the following error
***************************
APPLICATION FAILED TO START
***************************

Description:

Field cus in com.example.SpringBootPlayground.NewSpringMockQuestions.RegularVsCommercial.service.CustomerService required a single bean, but 2 were found:
	- commercial: defined in file [C:\Users\Genaro\Desktop\Spring-Boot-Playground\Spring-Boot-Playground___\target\classes\com\example\SpringBootPlayground\NewSpringMockQuestions\RegularVsCommercial\component\CommercialCustomer.class]
	- regular: defined in file [C:\Users\Genaro\Desktop\Spring-Boot-Playground\Spring-Boot-Playground___\target\classes\com\example\SpringBootPlayground\NewSpringMockQuestions\RegularVsCommercial\component\RegularCustomer.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


Process finished with exit code 1
 */