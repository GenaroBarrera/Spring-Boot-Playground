package com.example.SpringBootPlayground.OldSpringMockQuestions.retail.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public void addItem(Integer id) throws Exception{
        if(id>0)
            System.out.println("Item added");
        else
            throw new Exception("Invalid Item");

    }
}
