package com.employee.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Course {
	@Column(length = 20)
private String courseName;
@Id
@GeneratedValue(generator = "course_gen", strategy = GenerationType.AUTO)
@SequenceGenerator(name = "course_gen", sequenceName = "course_seq", initialValue = 1, allocationSize = 1)
private Integer courseId;
@Column(length = 20)
//@Enumerated(value = EnumType.STRING)
private String category;//frontend,backend,testing
@Column(length = 20)
@Enumerated(value = EnumType.STRING)
private Mode mode;//online ,offline
@ManyToMany(mappedBy="courses")
private Set<Employee> employees;
/**
 * 
 */
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param courseName
 * @param category
 * @param mode
 */
public Course(String courseName, String category, Mode mode) {
	super();
	this.courseName = courseName;
	this.category = category;
	this.mode = mode;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Mode getMode() {
	return mode;
}
public void setMode(Mode mode) {
	this.mode = mode;
}
@Override
public String toString() {
	return "Course [courseName=" + courseName + ", courseId=" + courseId + ", category=" + category + ", mode=" + mode
			+ "]";
}

}
