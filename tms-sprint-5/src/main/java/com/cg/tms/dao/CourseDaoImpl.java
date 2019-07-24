package com.cg.tms.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.cg.tms.entity.Course;
import com.cg.tms.exception.ErrorMessages;
import com.cg.tms.exception.ProgramException;

@Repository
@Transactional
public class CourseDaoImpl implements CrudService<Course> {

	@PersistenceContext
	private EntityManager entityManager;

//This method will add the course
	@Override
	public boolean create(Course course) {

		entityManager.persist(course);

		return true;
	}

	// this will get the course details by giving id
	@Override
	public Course retrieve(int courseId) throws ProgramException {

		Course course = entityManager.find(Course.class, courseId);

		if (course == null) {

			throw new ProgramException(ErrorMessages.MESSAGE7, HttpStatus.NOT_FOUND);
		}

		return course;
	}

	// this will delete the course from database by giving id
	@Override
	public boolean delete(Course course) throws ProgramException {

		Course courses = entityManager.find(Course.class, course.getCourseId());
		if (courses == null) {
			throw new ProgramException(ErrorMessages.MESSAGE1);
		}
		entityManager.remove(courses);
		return true;

	}

	// this method will retrieve all the data present in the database
	@Override
	public Set<Course> retrieveAll() {

		Query query = entityManager.createQuery("select c from Course c");
		Set<Course> courses = new HashSet<Course>();
		@SuppressWarnings("unchecked")
		List<Course> courseList = query.getResultList();
		for (Course course : courseList) {
			courses.add(course);
		}
		return courses;
	}

	@Override
	public boolean update(Course course) throws ProgramException {

		
		Set<Course> courses=new HashSet<Course>();
		for(Course courseTemp : courses)
			if(courseTemp.getCourseId() == course.getCourseId()) {
		courseTemp.setCourseCharges(course.getCourseCharges());

		} else {
			throw new ProgramException(ErrorMessages.MESSAGE7);
		}

		return true;
	}

	@Override
	public List<Course> expensiveCourse(Course course) throws ProgramException {
		
		Query query = entityManager.createQuery("select c from Course c  where c.courseCharges>=:course");

		query.setParameter("course", course.getCourseCharges());
		

		@SuppressWarnings("unchecked")
		List<Course> courseList = query.getResultList();

		return  courseList;
	}

}