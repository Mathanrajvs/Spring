package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudentService{
	IStudentRepository studentRepository;
	@Autowired
	public void setStudentRepository(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	
	@Override
	public void delete(int studentId) {
		studentRepository.deleteById(studentId);
	}


	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}


	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);		
	}


	@Override
	public String getById(int studentId) {
		return studentRepository.findById(studentId).toString();
	}


	@Override
	public List<Student> getByDepartment(String department) {
		return studentRepository.findByDepartment(department);
	}


	@Override
	public List<Student> getByCity(String city) {
		return studentRepository.findByCity(city);
	}


	@Override
	public List<Student> getByCityAndDepartment(String city, String department) {
		return studentRepository.findByCityAndDepartment(city, department);
	}


	@Override
	public List<Student> getByCityState(String city, String state) {
		return studentRepository.findByCityState(city, state);
	}

}
