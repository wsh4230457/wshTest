package com.example.myspringboot.controller;

import com.example.myspringboot.pojo.Person;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class testController {
    @GetMapping("/aa")
    public String one(HttpServletRequest request){
        String s=request.getRequestURI();
        log.info("路径："+s);
        return s;
    }
    @GetMapping("person")
    public Person two(){

        Person p=new Person();

        return p;
    }
}
