//package com.example.SpringBootPlayground.SpringAOP.retail;
//
//import com.example.SpringBootPlayground.SpringAOP.retail.service.ProductService;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class SampleApplication {
//    public static void main(String[] args) {
//        ApplicationContext context = SpringBootApplication.run(SampleApplication.class, args);
//        ProductService ps = context.getBean(ProductService.class);
//        try {
//            ps.addItem(0);
//        }
//        catch (Exception e){
//            System.out.println("Exception caught in main " +e.getMessage());
//        }
//    }
//}
