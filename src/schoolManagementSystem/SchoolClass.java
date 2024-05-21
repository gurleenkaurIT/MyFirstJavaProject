package schoolManagementSystem;

import java.util.ArrayList;

public class SchoolClass {

	public static final String name = "Springfield High School";

	private ArrayList<String> teachers = new ArrayList<String>();
	private ArrayList<String> students = new ArrayList<String>();

	Teacher teacher;
	Student student;

	public SchoolClass(ArrayList<String> teachers, ArrayList<String> students, Teacher teacher, Student student) {
		super();
		this.teachers = teachers;
		this.students = students;
		this.teacher = teacher;
		this.student = student;
	}

	public SchoolClass(ArrayList<String> teachers, ArrayList<String> students) {
		super();
		this.teachers = teachers;
		this.students = students;
	}
	
	public SchoolClass() {
	}
	
	public void addTeachers(String teacher) {
		teachers.add(teacher);
	}
	
	public void addStudents(String student) {
		students.add(student);
	}
	
}
