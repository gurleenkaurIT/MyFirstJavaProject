package schoolManagementSystem;

public class Student extends Person {

	private String studentID;
	private double percentage;
	private static final String nonMedicalStream = "Non-Medical";
	private static final String medicalStream = "Medical";
	private static final String commerceStream = "Commerce";
	private static final String artsStream = "Arts";

	public Student(String name, int age, String gender, String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
	}

	public String getStudentID() {
		return studentID;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a Student");
	}

	public String determineStream(double percentage) {
		if (percentage >= 85) {
			System.out.println("Allocated Stream is: " + nonMedicalStream);
			System.out.println(getName() + " can enroll is courses like Physics and Mathematics");
			return nonMedicalStream;
		} else if (percentage >= 75 && percentage < 85) {
			System.out.println("Allocated Stream is: " + medicalStream);
			System.out.println(getName() + " can enroll is courses like Biology and Chemistry");
			return medicalStream;

		} else if (percentage >= 65 && percentage < 75) {
			System.out.println("Allocated Stream is: " + commerceStream);
			System.out.println(getName() + " can enroll is courses like Economics and Business Studies");
			return commerceStream;
		} else {
			System.out.println("Allocated Stream is: " + artsStream);
			System.out.println(getName() + " can enroll is courses like History and Literature");
			return artsStream;
		}
	}

	public void rateTeacher(Teacher teacher, int rating) {
		teacher.addRating(rating);
	}

//	public boolean isStudentPresent(String studentIdEntered) {
//		if (studentIdEntered.equals(studentID)) {
//			return true;
//		}
//		return false;
//	}

}
