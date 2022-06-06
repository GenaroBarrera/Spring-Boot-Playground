package com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan.ConfigFile;

//A spring configuration file is shown below:
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan.Model") //Cannot Resolve package Model

@ComponentScan(basePackages = "com.example.SpringBootPlayground.NewSpringMockQuestions.ComponentScan") //Note: needs the full package path from the root
//This will scan ComponentScan and all its subpackages (Model and ConfigFile)

//@ComponentScan //Default behavior is to scan the package and subpackages where the config class is contained
//That means it will scan ConfigFile and its subpackages if any
public class AppConfig{

}
