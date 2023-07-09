package com.app.Service;

import java.util.List;

import com.app.Entity.Course;
import com.app.dto.ReqDto;

public interface CourseService {

	List<Course> getAllCourses();

	Course addNewCourse(Course newCourse);

	Course getCourse(String c);
	
	Course updateCourse(Course upCourse);

}
