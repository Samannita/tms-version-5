package com.cg.tms.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cg.tms.dao.CourseDaoImpl;
import com.cg.tms.dao.CrudService;
import com.cg.tms.entity.Course;
import com.cg.tms.exception.ProgramException;

/**
 * 
 */
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CrudService<Course> crudOperation;

	// This method will add the course
	@Override
	public boolean addCourse(Course course) throws ProgramException {

		return crudOperation.create(course);
	}

	// this will delete the course from database by giving id
	@Override
	public boolean deleteCourse(Course course) throws ProgramException {

		return crudOperation.delete(course);
	}

	// this method will retrieve all the data present in the database
	@Override
	public Set<Course> getAllCourse() throws ProgramException {
		return crudOperation.retrieveAll();
	}

	// this will get the course details by giving id
	@Override
	public Course getCourseDetails(final int courseId) throws ProgramException {
		

		return crudOperation.retrieve(courseId);
	}

	@Override
	public boolean modifyCourse(Course course) throws ProgramException {

		return crudOperation.update(course);
	}

	public List<Course> expensiveCourse(Course course) throws ProgramException {
		
		return crudOperation.expensiveCourse(course);
	}
}