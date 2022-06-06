package com.example.SpringBootPlayground.OldSpringMockQuestions.Essentials;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Consider the below class
class UserLoginService{
    public void welcome() {
        System.out.print("Hello User");
    }

}

@Configuration
class AppConfig {

    @Bean
    public UserLoginService userService() {
        return new UserLoginService();
    }
}

//What will be tha output of the below code?
@SpringBootApplication
class UserInterface{
    public static void main(String args[]){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserLoginService service = (UserLoginService) ctx.getBean("userService"); //Fixed! (you need to cast it) it's using the method name as the bean name
        //UserLoginService service = ctx.getBean(UserLoginService.class); //getting the bean from the class directly works as well (no need to cast!)
        service.welcome();
    }
}
