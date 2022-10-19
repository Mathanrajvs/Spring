package com.employee;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.Category;
import com.employee.model.Course;
import com.employee.model.Employee;
import com.employee.model.Mode;
import com.employee.service.ICourseService;
import com.employee.service.IEmployeeService;

@SpringBootApplication
public class SpringJpaManytomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaManytomanyApplication.class, args);
	}
	@Autowired
	ICourseService courseService;
	@Autowired
	IEmployeeService employeeService;
	
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Course course1=new Course("Java",Category.BACKEND.name(),Mode.ONLINE);//error
		Course course2=new Course("HTML&CSS",Category.FRONTEND.name(),Mode.OFFLINE);
		Course course3=new Course("JUNIT",Category.TESTING.name(),Mode.ONLINE);
		Set<Course> courses=new HashSet<>(Arrays.asList(course1,course2,course3));
		Employee employee1=new Employee("Banu","CSE","Hyderabad",courses);
		employeeService.addEmployee(employee1);
		
//		Set<Course> courseList=new HashSet<>(Arrays.asList(course1,course2));
//		Employee employee2=new Employee("Ramya","IT","Hyderabad",courseList);
//		employeeService.addEmployee(employee2);
		
		//passed
		System.out.println("Adding....");
		employeeService.getAll().forEach(System.out::println);
		
//		System.out.println("Updating....");//error
//		Course course4=new Course("JS",Category.BACKEND.name(),Mode.OFFLINE);
//		Set<Course> courseList1=new HashSet<>(Arrays.asList(course4));
//		Employee employee3=employeeService.getById(100);
//		employee3.setCourses(employee3.getCourses().add(course4));
//		System.out.println("Updating Restaurant....");
//		employeeService.updateEmployee(employee3);
//		employeeService.getAll().forEach(System.out::println);
		
//		System.out.println("Deleting...");//passed
//		employeeService.deleteEmployee(101);
//		System.out.println("Print All...");//passed
//		employeeService.getAll().forEach(System.out::println);
		
//		System.out.println("Get By City....");// passed
//		employeeService.getByCity("Hyderabad").forEach(System.out::println);
//		System.out.println("Get By Course Name....");//passed
//		employeeService.getByCourseName("Java").forEach(System.out::println);
//		System.out.println("Get By Category....");//passed
//		employeeService.getByCategory(Category.BACKEND.name()).forEach(System.out::println);
//		System.out.println("Get By Category and Mode....");
//		employeeService.getByCategoryMode(Category.BACKEND.name(),Mode.ONLINE).forEach(System.out::println);
	}

}
