package com.app.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.ResourceNotFoundException;
import com.app.Entity.Course;
import com.app.Repository.CourseRepository;
import com.app.dto.ReqDto;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository cRepo;
	
	
	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}


	@Override
	public Course addNewCourse(Course newCourse) {
		// TODO Auto-generated method stub
		return cRepo.save(newCourse);
	}


	@Override
	public Course getCourse(String c) {
		// TODO Auto-generated method stub
		return cRepo.findByName(c).orElseThrow(()-> new ResourceNotFoundException("Course Not Found")); 
	}

	@Override
	public Course updateCourse(Course upCourse) {
		// TODO Auto-generated method stub
		return cRepo.save(upCourse);
	}
	
}
