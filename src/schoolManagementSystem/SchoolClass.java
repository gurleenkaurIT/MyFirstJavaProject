package schoolManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClass {

	public static final String name = "Springfield High School";

	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<String[]> courses = new ArrayList<String[]>();

	Teacher teacher;
	Student student;

	public void addTeachers(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}

	public void addCourses(String[] courseTaught) {
		courses.add(courseTaught);
	}

	public boolean isStudentPresent(String studentIdEntered) {
		for (Student list : students) {
			if (studentIdEntered.equalsIgnoreCase(list.getStudentID())) {
				return true;
			}
		}
		return false;
	}

}
