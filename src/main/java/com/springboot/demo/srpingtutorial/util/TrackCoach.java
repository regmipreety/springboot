package com.springboot.demo.srpingtutorial.util;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkout() {
        return "spend 30 min in Tracking practice";
    }
}
