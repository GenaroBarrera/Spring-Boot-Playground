package com.example.SpringBootPlayground.OldSpringMockQuestions.DependencyInjectionQ3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class EmployeeService{
    @Autowired
    private AddressService add;

//    public void display(){
//        System.out.println(add.getDetails); //NOTE: the () symbols are missing after the getDetails() method is referenced (is this on purpose?)
//                                            //I'm gonna assume the answer is "Compilation error" then.
//    }

    public void display(){
        System.out.println(add.getDetails()); //fixed version, it will print "Electronic City"
    }

    //setter methods?
}
