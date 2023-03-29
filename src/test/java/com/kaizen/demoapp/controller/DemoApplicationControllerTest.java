package com.kaizen.demoapp.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kaizen.demoapp.model.SampleGreetings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DemoApplicationControllerTest {
    
    private static DemoApplicationController controller;

    @BeforeAll
    public static void setup() {
        controller = new DemoApplicationController();
    }
    
    @Test
    public void testGetGreetings() {
        SampleGreetings greetings = controller.getGreetings();
        SampleGreetings expectedGreetings = new SampleGreetings("Hello World");
        assertEquals(expectedGreetings.getMessage(), greetings.getMessage());
    }

    @Test
    public void testDebugGreetings() {
        String greetings = controller.getDebugMessage();
        String expGreetings = new String("Hello");
        assertEquals(expGreetings, greetings);
    }

    @Test
    public void testHomePageGreetings() {
        SampleGreetings greetings = controller.getHomePageMessage();
        SampleGreetings expGreetings = new SampleGreetings("You are home!");
        assertEquals(expGreetings.getMessage(), greetings.getMessage());
    }

    @Test
    public void testGetHomeUI() {
        String greetings = controller.getHomeUI();
        String expGreetings = new String("home");
        assertEquals(expGreetings, greetings);
    }

}
