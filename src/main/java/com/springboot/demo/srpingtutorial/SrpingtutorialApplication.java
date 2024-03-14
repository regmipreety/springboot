package com.springboot.demo.srpingtutorial;

import com.springboot.demo.srpingtutorial.dao.StudentDAO;
import com.springboot.demo.srpingtutorial.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication(
		scanBasePackages = {"com.springboot.demo.srpingtutorial.springcoredemo",
							"com.springboot.demo.srpingtutorial.util",
							"com.springboot.demo.srpingtutorial.config",
							"com.springboot.demo.srpingtutorial.dao"

		}
)
public class SrpingtutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SrpingtutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner-> {
			//createStudent(studentDAO);
			//updateStudent(studentDAO);
			deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int rows = studentDAO.deleteAll();
		System.out.println("Deleted row count:"+ rows);
	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve student based on the id
		int studentId = 1;
		System.out.println("Getting student with id:"+ studentId);
		Student theStudent = studentDAO.findById(studentId);

		//change first name
		System.out.println("updating student...");
		theStudent.setFirstName("Preety");
		studentDAO.update(theStudent);

		//display updated student
		System.out.println("updated student: "+ theStudent);
		this.deleteStudent(studentDAO);
	}

	private void deleteStudent(StudentDAO studentDAO){
		//get the detail to be deleted
		int studentId = 2;

		//perform delete
		studentDAO.deleteStudentById(studentId);
		System.out.println("Student detail has been deleted"+ studentId);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object

		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Daffy", "Doe", "daffy@doe.com");

		//save the object
		System.out.println("Saving the student....");
		studentDAO.save(tempStudent);

		//display the id of saved student
		System.out.println("Saved student. Generated id: "+ tempStudent.getId());

		this.readStudent(studentDAO, tempStudent);
		this.findByLastName(studentDAO);
	}

	private void readStudent(StudentDAO studentDAO, Student tempStudent) {
		System.out.println("\nRetrieving student with id"+ tempStudent.getId());
		Student result = studentDAO.findById(tempStudent.getId());
		System.out.println("Found the student: "+ result);
	}

	private void findByLastName(StudentDAO studentDAO){
		System.out.println("\nRetrieving student by last name Doe");
		List<Student> students = studentDAO.findByLastName("Doe");
		for (Student tempStudent: students) {
			System.out.println(tempStudent);
		}

	}


}
