package schoolManagementSystem;

/*
 * Objective: Extend the school management system to include interactive components for determining a student's educational stream based on their academic performance and allowing students to rate their teachers.
Requirements:
1.	Person Class (Abstract Class)
•	Attributes: name, age, gender
•	Constructor to initialize all attributes.
•	Abstract method describeRole() that subclasses will implement to describe whether the person is a teacher or student.
2.	Student Class (Inherits Person)
•	Additional attributes: studentID, percentage (academic performance).
•	Constructor to initialize all attributes including percentage.
•	Methods:
•	determineStream(): Determines and returns the educational stream based on the percentage:
•	85% or more: Non-medical (e.g., Physics, Mathematics)
•	75% to 84.99%: Medical (e.g., Biology, Chemistry)
•	65% to 74.99%: Commerce (e.g., Economics, Business Studies)
•	Below 65%: Arts (e.g., History, Literature)
•	rateTeacher(Teacher teacher, int rating): Allows a student to rate a teacher on a scale of 1 to 5.
3.	Teacher Class (Inherits Person)
•	Additional attributes: employeeID, salary, coursesTaught (List of courses taught), ratings (List to store ratings).
•	Constructor to initialize all attributes, including an empty list for ratings.
•	Methods:
•	addRating(int rating): Adds a new rating to the list of ratings.
•	calculateAverageRating(): Returns the average of all ratings received by the teacher.
4.	School Class
•	Attributes: name, list of teachers, list of students.
•	Methods:
•	All previous methods plus methods to retrieve teacher information for rating purposes.
5.	Main Class
•	An interactive system that prompts for student details and educational stream determination.
•	Allows students to rate teachers and displays updated average ratings for teachers.


Expected Output
Welcome to Springfield High School Stream Allocation and Teacher Rating System!

Please enter the student's name: [Charlie Brown]
Please enter the student's age: [15]
Please enter the student's gender: [Male]
Please enter the student's academic percentage: [87.5]

-- Stream Allocation Result --
Name: Charlie Brown, Age: 15, Gender: Male, Academic Percentage: 87.5%
Allocated Stream: Non-medical
Charlie can enroll in courses like Physics and Mathematics.

Please enter the teacher's name you wish to rate: [Alice Johnson]
Please enter your rating for Alice Johnson (1-5): [5]

-- Updated Teacher Rating --
Teacher: Alice Johnson
New Average Rating: 4.5

 */
public abstract class Person {

	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public abstract void describeRole();
}
