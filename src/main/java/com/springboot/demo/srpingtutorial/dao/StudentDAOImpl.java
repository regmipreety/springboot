package com.springboot.demo.srpingtutorial.dao;

import com.springboot.demo.srpingtutorial.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
/*Supports component scanning
* translates JDBC exceptions
**/
public class StudentDAOImpl implements StudentDAO {

    //define field for entity manager
    private EntityManager entityManager;
    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName= :theData order by firstName asc", Student.class);
        //Note: Student is not the name of the database table but the name of the JPA entity class.
        // All JPQL syntax is based on entity name and entity fields
        theQuery.setParameter("theData", theLastName);
        //return query results;
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }
}
