package com.example.demo;

import com.example.demo.dao.HomeAddressDAO;
import com.example.demo.dao.StudentDAO;
import com.example.demo.model.HomeAddress;
import com.example.demo.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(StudentDAO studentDAO, HomeAddressDAO homeAddressDAO){
		return runner -> {
			addStudent(studentDAO);
			addHomeAddress(homeAddressDAO);
		};
	}
	private void addStudent(StudentDAO studentDAO){
		Student student = new Student("test", "student", "test@hotmail.com");
		studentDAO.addStudent(student);
	}
	private void addHomeAddress(HomeAddressDAO homeAddressDAO){
		HomeAddress homeAddress = new HomeAddress("Street 36",14144);
		homeAddressDAO.addHomeAddress(homeAddress);

	}

}
