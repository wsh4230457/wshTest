package com.example.myspringboot;

import com.example.myspringboot.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MySpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=SpringApplication.run(MySpringBootApplication.class, args);
        Person person=(Person) applicationContext.getBean("person");
        System.out.println(person);
    }

}
