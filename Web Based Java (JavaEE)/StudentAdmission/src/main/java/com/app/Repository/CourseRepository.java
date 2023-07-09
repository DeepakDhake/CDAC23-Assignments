package com.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	Optional<Course> findByName(String cn);
	
}
