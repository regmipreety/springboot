package com.springboot.demo.srpingtutorial.dao;

import com.springboot.demo.srpingtutorial.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findByLastName(String theLastName);
    void update(Student theStudent);
}
