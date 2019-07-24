package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import com.cg.tms.exception.ErrorMessages;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Course() {
	};

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COURSE")
	@SequenceGenerator(sequenceName = "seq_course", allocationSize = 1, name = "SEQ_COURSE")
	@Column(name = "courseid")
	private int courseId;
	@Column(name = "coursename")
	@Pattern(regexp = "[A-Za-z\\\\s]{4,}", message = ErrorMessages.MESSAGE15)
	private String courseName;
	@Column(name = "coursedesc")
	private String courseDesc;
	@Column(name = "course_charges")
	private int courseCharges;

	public Course(String courseName, String courseDesc, int courseCharges) {

		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.courseCharges = courseCharges;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public int getCourseCharges() {
		return courseCharges;
	}

	public void setCourseCharges(int courseCharges) {
		this.courseCharges = courseCharges;
	}

	@Override
	public boolean equals(Object obj) {
		return this.getCourseId() == getCourseId();
	}

	@Override
	public String toString() {
		return "Course ID: " + courseId + " Course Name: " + courseName + " Courses Charges " + courseCharges
				+ " Course desc: " + courseDesc;
	}

}