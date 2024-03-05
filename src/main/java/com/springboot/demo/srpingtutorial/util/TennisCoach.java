package com.springboot.demo.srpingtutorial.util;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "spend 30 min in Tennis practice";
    }
}
