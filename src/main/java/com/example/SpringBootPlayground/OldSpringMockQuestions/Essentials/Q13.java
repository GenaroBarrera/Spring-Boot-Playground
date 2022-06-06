package com.example.SpringBootPlayground.OldSpringMockQuestions.Essentials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class MobileService{
    public MobileService(){
        System.out.println("In Constructor");
    }
    public void display() {
        System.out.println("In display");
    }
}

class SpringConfig{
    @Bean
    public MobileService mobileService(){
        return new MobileService();
    }
}

//What will be the output when following Tester class is executed :
class Tester {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        MobileService mobileService = (MobileService) applicationContext.getBean(MobileService.class);
        mobileService.display();
        MobileService mobileService1 = (MobileService) applicationContext.getBean(MobileService.class);
        mobileService1.display();
    }
}