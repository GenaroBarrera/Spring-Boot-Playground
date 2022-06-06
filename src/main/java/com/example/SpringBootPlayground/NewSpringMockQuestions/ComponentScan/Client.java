package com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan;

import com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan.ConfigFile.AppConfig;
import com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan.Model.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client{
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService emp = context.getBean(EmployeeService.class);
        emp.display();
    }
}

// TODO Answers
//@ComponentScan default: No qualifying bean of type 'com.example.SpringBootPlayground.ComponentScan.Model.EmployeeService' available
//Note: It's not a compilation error since the process was able to execute and finish


//@ComponentScan(basePackages = "com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan"): Compiles fine, Displays "Electronic City"

/*
Types of Errors in Java
https://www.geeksforgeeks.org/types-of-errors-in-java-with-examples/

Run Time Error: Run Time errors occur or we can say, are detected during the execution of the program.
Sometimes these are discovered when the user enters an invalid data or data which is not relevant.
Runtime errors occur when a program does not contain any syntax errors
but asks the computer to do something that the computer is unable to reliably do.

Example 1: Runtime Error caused by dividing by zero
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at DivByZero.main(File.java:14)

Example 2: Runtime Error caused by Assigning/Retrieving Value from an array using an index which is greater than the size of the array
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
    at RTErrorDemo.main(File.java:10)

Compile Time Error: Compile Time Errors are those errors which prevent the code from running because of an incorrect syntax
such as a missing semicolon at the end of a statement or a missing bracket, class not found, etc.
These errors are detected by the java compiler and an error message is displayed onto the screen while compiling.
Compile Time Errors are sometimes also referred to as Syntax errors.
These kind of errors are easy to spot and rectify because the java compiler finds them for you.

Example 1: Misspelled variable name or method names
prog.java:14: error: cannot find symbol
            + sum);
              ^
  symbol:   variable sum
  location: class MisspelledVar
1 error

Example 2: Missing semicolons
prog.java:8: error: ';' expected
        System.out.println("Welcome to " + s)
                                             ^
1 error

Example 3: Missing parenthesis, square brackets, or curly braces
prog.java:10: error: ')' expected
        for (i = 1; i <= 5; i++ {
                               ^
1 error
*/
