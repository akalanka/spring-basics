package com.devoxx.didemo;

import com.devoxx.didemo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        GreetingController greetingController = (GreetingController) context.getBean("greetingController");
        greetingController.sayHello();
    }
}
