
package com.cg.tms.util;

import java.time.LocalDate;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import com.cg.tms.dao.FetchCentersImpl;
//import com.cg.tms.dao.IFetchAllDetails;
//import com.cg.tms.dao.StudentServiceDao;
////import com.cg.tms.dao.StudentServiceDaoImpl;
//import com.cg.tms.entity.Center;
//import com.cg.tms.entity.Course;
//import com.cg.tms.entity.Program;
//import com.cg.tms.entity.Student;
//import com.cg.tms.entity.TrainerSkill;
import com.cg.tms.exception.ProgramException;
import com.cg.tms.service.CourseService;
import com.cg.tms.service.CourseServiceImpl;
//import com.cg.tms.service.TrainerService;
//import com.cg.tms.service.TrainerServiceImpl;
//import com.cg.tms.service.TrainingProgramServiceImpl;

public class CoordinatorHelper {
	

	public static  boolean isDatenotExpired(String inputDate) throws ProgramException {
		LocalDate startDate = null;
		try {
			startDate = LocalDate.parse(inputDate);
			if (startDate.isBefore(LocalDate.now())) {
				throw new ProgramException("Date is already gone.Backdate not possible");
			}
		} catch (DateTimeParseException e) {
			throw new ProgramException("Invalid Date format!! Please Enter in specific format");
		}
		return true;
	}

	
//	public static String generateStudentId() {
//		StringBuilder studentId = new StringBuilder("ST_");
//		int number = LocalDate.now().getDayOfMonth();
//		if (number < 10) {
//			studentId.append('0');
//		}
//		studentId.append(number);
//		studentId.append(Student.studentSeq++);
//		return String.valueOf(studentId);
//	}
//
//	public static String generateTrainingId() {
//		StringBuilder trainingId = new StringBuilder("TP_");
//		int number = LocalDate.now().getDayOfMonth();
//		if (number < 10) {
//			trainingId.append('0');
//		}
//		trainingId.append(number);
//		trainingId.append(Program.tProgramSeq++);
//		return String.valueOf(trainingId);
//	}

}