package com.example.HelloWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){

        return ("Hello world from Spring Boot"+ "hello again");

    }
}
