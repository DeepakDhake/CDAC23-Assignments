package com.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByFirstName(String em);
	
	Optional<Employee> findByEmailAndPassword(String em, String pwd);
}
