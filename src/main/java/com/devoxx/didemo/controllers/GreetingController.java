package com.devoxx.didemo.controllers;

import com.devoxx.didemo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greet = helloWorldService.getGreeting();
        System.out.println(greet);

        return greet;
    }
}
