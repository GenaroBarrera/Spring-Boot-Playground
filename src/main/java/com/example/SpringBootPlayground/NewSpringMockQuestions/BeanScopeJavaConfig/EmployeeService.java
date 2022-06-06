package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeJavaConfig;

public class EmployeeService{
    private AddressService add; //this field is never assigned
    //we never create a new instance of AddressService
    //That's why we get a NullPointerException thrown on execute

    //what if we did assign add to a new instance of AddressService?
    //private AddressService add = new AddressService();
    //this would work and display Electronic city.
    //Note: this is tightly coupled, and it's not using Dependency Injection. BAD DESIGN
    //probably use constructor injection instead? TODO yeah, check out "Why Spring" in the "Introduction" Section

    public void display() {
        System.out.println(add.getDetails()); //the missing () is a mistake not part of  the question.
    }
}
