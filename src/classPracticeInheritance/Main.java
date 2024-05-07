package classPracticeInheritance;

public class Main {

	public static void main(String[] args) {

		Toronto toronto = new Toronto(5, "5000");

		toronto.population();
		toronto.currentTime(); // Go to Current Time of Toronto class, Ctrl + click
		toronto.rulesForOntario();
		toronto.numberOfTouristDestination();
		toronto.noOftouristDestination = 7;

		toronto.reviews = new CustomerReviews();

		toronto.reviews.setRating(4.5);
		String[] comments = { "Good", "Needs Improvement", "Excellent" };
		toronto.reviews.setReviews(comments);
		// OR
		CustomerReviews reviewsForToronto = new CustomerReviews();

		reviewsForToronto.setRating(4.5);
		reviewsForToronto.setReviews(comments);
		toronto.reviews = reviewsForToronto;

		Windsor windsor = new Windsor(4, "1000");
		windsor.hasBorder(true);
		windsor.currentTime();
		windsor.rulesForOntario();

		OntarioProvince ontarioProvince = new OntarioProvince();
		ontarioProvince.currentTime(); // Go to current time of Ontario class , Ctrl + click
		ontarioProvince.rulesForOntario();

		OntarioProvince province = new Toronto();
		province.currentTime(); 
		province.rulesForOntario();
		province.customerReviews();
		
//		province.population(); // Can't call sub class methods by super class ref variable if it is not a overridden method
//		province.noOftouristDestination();
		// Go to Ontario Class, Ctrl + click refernce varible at complie time
		// and run time go to Toronto class 
		
		
		
		
		
		

	}
}
