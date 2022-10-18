package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringJpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOnetooneApplication.class, args);
	}
	@Autowired
	IStudentService studentService;

	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Address address=new Address("Ban","Kar");
//		Student student=new Student("Banu","CSE","Banu@gmail.com",address);
//		studentService.addStudent(student);
//		System.out.println("Get All");
//		studentService.getAll().forEach(System.out::println);
//		System.out.println("Get City and Department");
//		studentService.getByCityAndDepartment("Hyd", "CSE").forEach(System.out::println);
//		System.out.println("Get City");
//		studentService.getByCity("Hyd").forEach(System.out::println);
//		System.out.println("Get Department");
//		studentService.getByDepartment("CSE").forEach(System.out::println);
//		System.out.println("Get City and State");
//		studentService.getByCityState("Hyd", "And").forEach(System.out::println);
		
		
	}

}
