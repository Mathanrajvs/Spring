package com.employee.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Employee {
	@Column(length = 20)
private String name;
@Id
@GeneratedValue(generator = "employee_gen", strategy = GenerationType.AUTO)
@SequenceGenerator(name = "employee_gen", sequenceName = "employee_seq", initialValue = 100, allocationSize = 1)
private Integer employeeId;
@Column(length = 20)
private String department;
@Column(length = 20)
private String city;
@ManyToMany(cascade = {CascadeType.MERGE},fetch=FetchType.EAGER)
@JoinTable(
		name="employee_course",
		joinColumns= @JoinColumn(name="employee_id"),
		inverseJoinColumns = @JoinColumn(name="course_id")
		)
private Set<Course> courses;
/**
 * 
 */
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param name
 * @param department
 * @param city
 * @param courses
 */
public Employee(String name, String department, String city, Set<Course> courses) {
	super();
	this.name = name;
	this.department = department;
	this.city = city;
	this.courses = courses;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Set<Course> getCourses() {
	return courses;
}
public void setCourses(Set<Course> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", employeeId=" + employeeId + ", department=" + department + ", city=" + city
			+ ", courses=" + courses + "]";
}


}
