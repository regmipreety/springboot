package com.springboot.demo.srpingtutorial.util;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "spend 30 min in Tracking practice";
    }
}
