package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;
import com.employee.model.Mode;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findByCity(String city);
	@Query("from Employee e inner join e.courses c where c.courseName=?1")
	List<Employee> findByCourseName(String courseName);
	@Query("from Employee e inner join e.courses c where c.category=?1 and c.mode=?2")
	List<Employee> findByCategoryMode(String category,Mode mode);
	@Query("from Employee e inner join e.courses c where c.category=?1")
	List<Employee> findByCategory(String category);
}
