package com.cg.tms.controller;

import java.util.List;
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

import com.cg.tms.TmsBootApplication;
import com.cg.tms.entity.Course;
import com.cg.tms.exception.ErrorMessages;
import com.cg.tms.exception.ProgramException;
import com.cg.tms.service.CourseService;

@RestController
public class CoordinatorController {

	@Autowired
	private CourseService courseService;

	public void setCourseOperation(CourseService courseOperation) {
		this.courseService = courseOperation;
	}

	Logger log = LoggerFactory.getLogger(TmsBootApplication.class);

	@RequestMapping(value = "/expensiveCourse", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")

	public List<Course> getExpensiveCourseDetails(@RequestBody Course course) throws ProgramException {

		List<Course> programs = courseService.expensiveCourse(course);
		log.info("Get All offered Course: SUCEESS");
		return programs;
	}

	// this will add courses
	@PostMapping(value = "/addCourse", consumes = "application/json ")
	public Course course(@RequestBody Course course) throws ProgramException {

		course.setCourseName(course.getCourseName());
		course.setCourseDesc(course.getCourseDesc());
		course.setCourseCharges(course.getCourseCharges());
		courseService.addCourse(course);
		log.info("course added successfully");
		return course;

	}

	// this will delete the course from database by giving id
	@DeleteMapping(value = "/deleteCourse", consumes = "application/json ", headers = "accept=application/json")
	public String courses(@RequestBody Course course) throws ProgramException {

		boolean response = false;
		response = courseService.deleteCourse(course);
		if (response == true)
			return "Success";
		else
			log.info("Course cant be deleted");
		return "Deletion UnSuccessful";
	}

	// this method will retrieve all the data present in the database
	@GetMapping(value = "/getAllCourse", produces = "application/json")

	public Set<Course> getAllCourseDetails() throws ProgramException {

		Set<Course> programs = courseService.getAllCourse();
		log.info("Get All Course: SUCEESS");
		return programs;
	}

	// this will get the course details by giving id
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET, produces = "application/json")
	public Course getCourseById(@PathVariable("id") int courseId) throws ProgramException {
		log.info("Getting details of course through course id");
		Course course = courseService.getCourseDetails(courseId);
		if (course == null) {
			throw new ProgramException(ErrorMessages.MESSAGE7);
		}
		return course;
	}

	@PutMapping(value = "/updateCourse/{id}", consumes = "application/json", produces = "application/json")
	public String updateCourse(@PathVariable("id") int courseId) throws ProgramException {
		Course course = new Course();
		boolean result = false;
		course.setCourseCharges(course.getCourseCharges());
		result = courseService.modifyCourse(course);
		if (result == true)
			return "Updated";
		else

			return "Cant update";
	}

}
