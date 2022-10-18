package com.employee.service;

import java.util.List;

import com.employee.model.Employee;
import com.employee.model.Mode;

public interface IEmployeeService {
Employee addEmployee(Employee employee);
void updateEmployee(Employee employee);
void deleteEmployee(int employeeId);
List<Employee> getAll();
Employee getById(int employeeId);

//derived queries
List<Employee> getByCity(String city);
List<Employee> getByCourseName(String courseName);
List<Employee> getByCategoryMode(String category,Mode mode);
List<Employee> getByCategory(String category);
}
