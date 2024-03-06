package com.springboot.demo.srpingtutorial.util;

public class SwimCoach implements Coach{


   public SwimCoach(){
       System.out.println("In constructor: "+ getClass().getSimpleName());
   }
    @Override
    public String getDailyWorkout() {
        return "Swim 100m deep from SwimCoach";
    }
}
