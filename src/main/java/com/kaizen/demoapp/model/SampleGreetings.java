package com.kaizen.demoapp.model;

import lombok.Data;

@Data
public class SampleGreetings {
    
    private String message;

    public SampleGreetings(String message) {
        this.message = message;
    }
}
