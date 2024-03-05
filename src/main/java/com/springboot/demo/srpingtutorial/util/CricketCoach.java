package com.springboot.demo.srpingtutorial.util;

import com.springboot.demo.srpingtutorial.util.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for cricket";
    }
}
