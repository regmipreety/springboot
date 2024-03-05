package com.springboot.demo.srpingtutorial.springcoredemo.rest;

import com.springboot.demo.srpingtutorial.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define private field for dependency

    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController (Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkouts")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
