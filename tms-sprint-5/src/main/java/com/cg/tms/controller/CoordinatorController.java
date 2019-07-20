package com.cg.tms.controller;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tms.entity.Course;
import com.cg.tms.exception.ErrorMessages;
import com.cg.tms.exception.ProgramException;
import com.cg.tms.main.TmsBootApplication;
import com.cg.tms.service.CourseService;


@RestController
public class CoordinatorController {

	
	@Autowired
	private CourseService courseService;



	public void setCourseOperation(CourseService courseOperation) {
		this.courseService = courseOperation;
	}
	Logger log = LoggerFactory.getLogger(TmsBootApplication.class);

	//this will add courses
	@PostMapping(value = "/addCourse", consumes = "application/json ", produces = "application/json")
	public Course course(@RequestBody Course course) throws ProgramException {

		System.out.println("course added successfully");
		course.setCourseName(course.getCourseName());
		course.setCourseDesc(course.getCourseDesc());
		course.setCourseCharges(course.getCourseCharges());
		courseService.addCourse(course);
		System.out.println("course added successfully");
		return course;
		
	}

	//this will delete the course from database by giving id
	@DeleteMapping(value = "/deleteCourse", consumes = "application/json ", headers = "accept=application/json")
	public String courses(@RequestBody Course course) throws ProgramException {
		
		boolean response = false;
		response = courseService.deleteCourse(course);
		if (response == true)
			return "Success";
		else
			return "Deletion UnSuccessful";
	}

	//this method will retrieve all the data present in the database 
	@GetMapping(value = "/",  produces = "application/json")
//	public @ResponseBody Set<Course> getAllCourseDetails() throws ProgramException {
//		
//		Set<Course> course = courseOperation.getAllCourse();
//		System.out.println("Get All Course ACCESSED");
//
//		return course;
	public Set<Course> getAllCourseDetails() throws ProgramException {
		log.info("Get All Course: STARTED at");
		Set<Course> programs = courseService.getAllCourse();
		log.info("Get All Course: SUCEESS");
		return programs;
	}

	

	//this will get the course details by giving id
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET, produces = "application/json")
	public Course getCourseById(@PathVariable("id") Integer courseId) throws ProgramException {
		System.out.println(courseId);
		Course course = courseService.getCourseDetails(courseId);
		if(course==null) {
			throw new ProgramException(ErrorMessages.MESSAGE7);
		}
		return course;
	}
	
	@PutMapping(value = "/updateCourse", consumes="application/json", produces = "application/json")
	public String updateCourse(@RequestBody Course course) throws ProgramException {
		boolean result=false;
		result = courseService.modifyCourse(course);
		if(result==true)
			return "Updated";
		else
		return "Cant update";
	}

}
