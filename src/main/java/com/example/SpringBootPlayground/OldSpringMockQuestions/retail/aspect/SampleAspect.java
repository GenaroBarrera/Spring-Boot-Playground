package com.example.SpringBootPlayground.OldSpringMockQuestions.retail.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {
    //@AfterThrowing(pointcut = execution(Integer ProductService.add*(..)), throwing = "e")
    public void logExceptionFromDAO(Exception e) throws Exception{
        System.out.println(e.getMessage());
    }
}
