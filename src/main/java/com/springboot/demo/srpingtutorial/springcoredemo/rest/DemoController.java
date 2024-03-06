package com.springboot.demo.srpingtutorial.springcoredemo.rest;

import com.springboot.demo.srpingtutorial.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define private field for dependency

    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController (@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
    }

    /* Adding dependency injection via setter
    * it is used for optional dependency injection*
    Qualifier annotation takes over Primary annotation to define which component to use
    * */
//    @Autowired
//    public void setMyCoach (@Qualifier("baseballCoach") Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkouts")
    public String getDailyWorkout() {

        return myCoach.getDailyWorkout();
    }
}
