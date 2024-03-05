package com.springboot.demo.srpingtutorial.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties for team.name
    @Value( "${team.name}")
    private String teamName;

    @GetMapping ("/")
    public String sayHello(){
        return teamName;
    }

    // Add a new endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "new method to test";
    }

    //add a new endpoint for fortune
    @GetMapping ("/fortune")
    public String getDailyFortune(){
        return "Congratulations Preety! yeyyy";
    }

}
