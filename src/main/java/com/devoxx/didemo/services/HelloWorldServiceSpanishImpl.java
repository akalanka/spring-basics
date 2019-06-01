package com.devoxx.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sp")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola Mundo!!!";
    }
}
