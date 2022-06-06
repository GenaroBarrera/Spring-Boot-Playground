package com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeSingletonVsPrototype;

import com.example.SpringBootPlayground.NewSpringMockQuestions.BeanScopeSingletonVsPrototype.dao.StudentDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoSpringBootApplication.class, args);
        StudentDAOImpl w1 = ctx.getBean(StudentDAOImpl.class);
        StudentDAOImpl w2 = ctx.getBean(StudentDAOImpl.class);
        System.out.print(w1 == w2); //(reference/address comparison) check if it's the same object
        System.out.println(" " + w1.equals(w2)); //(content comparison) evaluates to the comparison of state/values in the objects
        /*
        NOTE: Unless the equals method is overwritten by yourself or another class ex. String,
        .equals() will always return false unless if referring to the same object.
        Essentially the same as the == operator

        From the javadoc:
        "The equals method for class Object implements the most discriminating possible equivalence relation on objects; that is,
         for any non-null reference values x and y, this method returns true if and only if x and y refer to the same object (x == y has the value true).

         Note that it is generally necessary to override the hashCode method whenever this method is overridden,
         so as to maintain the general contract for the hashCode method,
         which states that equal objects must have equal hash codes."
         */

    }
}

/*
TODO Answers
Singleton scope: true true
Singleton scope means only one instance is created and used throughout the whole application
== returns true since w1 and w2 reference the same object and because of that .equals() returns true as well.

Prototype scope: false false
Why isn't it false true? They're separate objects, but I thought they had the same contents/value? (See the note above)
Prototype scope means a separate instance of StudentDAOImpl is created for w1 and w2.
== returns false since w1 and w2 are referencing two separate objects (i.e. two unique addresses)
.equals() returns false since...

Difference between == and .equals() method in Java
https://www.geeksforgeeks.org/difference-equals-method-java/

In general, both equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

1. The main difference between the .equals() method and == operator is that one is a method and the other is the operator.

2. We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
   In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
 */