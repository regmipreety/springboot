package com.springboot.demo.srpingtutorial.config;

import com.springboot.demo.srpingtutorial.util.Coach;
import com.springboot.demo.srpingtutorial.util.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    // creating a custom bean id
    @Bean ("aquatic")

    public Coach swimCoach(){
        return new SwimCoach();
    }
}
