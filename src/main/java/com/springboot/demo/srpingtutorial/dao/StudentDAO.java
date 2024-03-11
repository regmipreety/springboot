package com.springboot.demo.srpingtutorial.dao;

import com.springboot.demo.srpingtutorial.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
