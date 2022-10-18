package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Course;
import com.employee.model.Employee;
@Repository
public interface ICourseRepository extends JpaRepository<Course, Integer> {
	List<Course> findByCategory(String category);
	@Query("from Course c inner join c.employees e where c.category=?1 and c.mode=?2")
	List<Course> findByCategoryMode(String category,String mode);
	@Query("from Employee e inner join e.courses c where e.name=?1")
	List<Course> findByEmployee(String name);
	@Query("from Employee e inner join e.courses c where e.city=?1")
	List<Course> findByCity(String city);
}
