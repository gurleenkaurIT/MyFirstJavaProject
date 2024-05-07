package classPracticeInheritance;

public class CustomerReviews {

	double rating;

	public double getRating() {

		return rating;
	}

	public void setRating(double d) {
		System.out.println("Rating is: " + d);
		this.rating = d;
	}

	// Declare any way
	// String[] reviews = new String[5];
	String[] reviews;

	public String[] getReviews() {
		return reviews;
	}

	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}

}
