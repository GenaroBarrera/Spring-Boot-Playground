package com.example.SpringBootPlayground.NewSpringMockQuestions.AutowiringAdd;

public class EmployeeService{
    private AddressService add; //again, this field is never assigned

    //Note: the lack of a Constructor that would take in an instance of AddressService add()

    public void display() {
        System.out.println(add.getDetails()); //are the missing () after getDetails intentional?
    }
}
