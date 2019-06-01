package com.devoxx.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default", "en"})
public class HelloWorldServiceEngImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}
