package com.springboot.demo.srpingtutorial.util;

import com.springboot.demo.srpingtutorial.util.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for cricket";
    }

    // define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartUpStuff(): "+ getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanUpStuff(): "+ getClass().getSimpleName());
    }
}
