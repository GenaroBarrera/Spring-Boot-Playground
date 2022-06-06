package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeSingletonVsPrototype.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
//default scope is singleton
@Scope("prototype")
public class StudentDAOImpl {
//    int n1 = 1;
//    public void displayN1() {
//        System.out.println(n1);
//    }
}
