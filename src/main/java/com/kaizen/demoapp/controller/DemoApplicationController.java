package com.kaizen.demoapp.controller;

import com.kaizen.demoapp.model.SampleGreetings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoApplicationController {

    @GetMapping("/api/v1/hello")
    @ResponseBody
    public SampleGreetings getGreetings() {
        System.out.println("Received greetings request");
        return new SampleGreetings("Hello World");
    }

    @GetMapping("/api/v1/debug")
    public String getDebugMessage() {
        return "Hello";
    }

    @GetMapping("/api/v1/home")
    @ResponseBody
    public SampleGreetings getHomePageMessage() {
        return new SampleGreetings("You are home!");
    }

    @GetMapping("/")
    public String getHomeUI() {
        return "home";
    }
       
}

