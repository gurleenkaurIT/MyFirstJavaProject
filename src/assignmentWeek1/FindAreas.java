package assignmentWeek1;

public class FindAreas {

	double height = 7;
	double base = 4;
	double area;

	void areaOfRectangle() {
		area = height * base;
		System.out.println(area);
	}

	void areaOfSquare() {
		area = 4 * (base);
		System.out.println(area);
	}

	void areaOfTriangle() {
		area = (height * base) / 2;
		System.out.println(area);
	}

}
