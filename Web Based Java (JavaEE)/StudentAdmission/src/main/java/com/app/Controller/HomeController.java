package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Course;
import com.app.Service.CourseService;
import com.app.dto.ReqDto;

@RestController
@RequestMapping("/api/response")
public class HomeController {

	@Autowired
	private CourseService cService;

	public HomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("In Home Constructor" + getClass());
	}

	@GetMapping
	public List<Course> getCourses() {
		return cService.getAllCourses();
	}

	@PostMapping
	public ResponseEntity<?> newCourse(@RequestBody Course persistCourse) {
//		return cService.addNewCourse(persistCourse);
		return new ResponseEntity<Course>(cService.addNewCourse(persistCourse), HttpStatus.CREATED);
	}

	@GetMapping("/{courseName}")
	public Course courseFind(String cname) {
		return cService.getCourse(cname);
	}

	@PutMapping
	public Course UpCourse(@RequestBody Course upCourse) {
		return cService.updateCourse(upCourse);
	}

}
