//package com.cg.tms.dao;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import com.cg.tms.entity.Center;
//import com.cg.tms.entity.Course;
//import com.cg.tms.entity.Employee;
//import com.cg.tms.entity.Program;
//import com.cg.tms.entity.Student;
//import com.cg.tms.entity.TrainerSkill;
//import com.cg.tms.enums.Skills;
//
//public class DatabaseCollection {
//
//	public static Set<Course> course = new HashSet<>();
//	public static List<Center> center = new ArrayList<>();
//	public static List<TrainerSkill> trainer = new ArrayList<>();
//	public static Set<Skills> tr_1001Skills = new HashSet<>();
//	public static Set<Skills> tr_1002Skills = new HashSet<>();
//	public static Map<String, Program> program = new HashMap<>();
//	public static List<Student> student = new ArrayList<>();
//	public static List<Employee> trPrograms = new ArrayList<>();
//
//	public static void initiateDB() {
////		course.add(new Course("CO_1001", "JAVA", "JAVA Fundamentals", 2500));
////		course.add(new Course("CO_1002", "C", "C basics", 1500));
////
////		center.add(new Center("CN_1001", "Capgemini SEZ", "Aeroli Navi Mumbai -700080"));
////		center.add(new Center("CN_1002", "Knowledge Park", "Thane Mumbai"));
////
////		tr_1001Skills.add(Skills.ANGULAR);
////		tr_1001Skills.add(Skills.JAVA);
////		trainer.add(new TrainerSkill("TR_1001", "Mr Vivek Acharya", "Bhubaneswar,IND", tr_1001Skills));
//
////		tr_1002Skills.add(Skills.PYTHON);
////		tr_1002Skills.add(Skills.JAVA);
////		trainer.add(new TrainerSkill("TR_1002", "Manoj Vajpeyi", "Mumbai, IND", tr_1002Skills));
////
////		program.put("TP_1001",
////				new Program("TP_1001", LocalDate.parse("2019-09-08"),
////						new Course("CD_1001", "JAVA", "JAVA Fundamentals", 2500),
////						new TrainerSkill("TR_1001", "Mr Vivek Acharya", "Bhubaneswar,IND", tr_1001Skills),
////						new Center("CN_1002", "Knowledge Park", "Thane Mumbai")));
////
////		student.add(new Student("ST_1001", "Amit Kumar"));
////
////		trPrograms.add(new TrainingProgram(new Student("ST_1001", "Amit Kumar"), program.get("TP_1001")));
//
//	}
//
////	
//
//}
