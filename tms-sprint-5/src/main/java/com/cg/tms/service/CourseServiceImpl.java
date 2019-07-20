package com.cg.tms.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

//import com.cg.tms.dao.CourseDaoImpl;
import com.cg.tms.dao.CrudService;
import com.cg.tms.entity.Course;
import com.cg.tms.exception.ErrorMessages;
import com.cg.tms.exception.ProgramException;

/**
 * 
 */
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CrudService<Course> crudOperation;

	// This method will add the course
	public boolean addCourse(Course course) throws ProgramException {

		
		return crudOperation.create(course);
	}

	// this will delete the course from database by giving id
	public boolean deleteCourse(Course course) throws ProgramException {
		
		
		return crudOperation.delete(course);
	}

	// this method will retrieve all the data present in the database
	public Set<Course> getAllCourse() throws ProgramException {
		return crudOperation.retrieveAll();
	}

	// this will get the course details by giving id
	public Course getCourseDetails(final int courseId) throws ProgramException {
		System.out.println(courseId);
//		if (courseId==0) {
//			System.out.println("Course not present");
//			throw new ProgramException(ErrorMessages.MESSAGE7,HttpStatus.NOT_FOUND);
//		}

		return crudOperation.retrieve(courseId);
	}

	public boolean modifyCourse(Course course) throws ProgramException {
		
		return  crudOperation.update(course);
	}

}