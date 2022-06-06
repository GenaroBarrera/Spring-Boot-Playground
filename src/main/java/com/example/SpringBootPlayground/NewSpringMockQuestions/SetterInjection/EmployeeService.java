package com.example.SpringBootPlayground.NewSpringMockQuestions.SetterInjection;

public class EmployeeService{
    private AddressService add;

    //we're gonna use this setter method to inject an instance of AddressService (our AddressService bean)
    // into our add property above in the AppConfig class when defining our beans
    public void setAdd(AddressService add){
        this.add = add;
    }

    public void display() {
        System.out.println(add.getDetails()); //the missing () is a mistake not part of  the question.
    }
}
