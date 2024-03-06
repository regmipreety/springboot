package com.springboot.demo.srpingtutorial.util;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkout() {
        return "spend 30 min in Baseball practice";
    }
}
