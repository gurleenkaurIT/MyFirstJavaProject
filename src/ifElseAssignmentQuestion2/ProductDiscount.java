package ifElseAssignmentQuestion2;

public class ProductDiscount {

	double productPrice;
	double fiftyPercentDiscount = 0.50;
	double promoFive = 0.05;
	double promoTen = 0.10;
	double promoTwenty = 0.20;
	boolean isPromoFiveApplied;
	boolean isPromoTenApplied;
	boolean isPromoTwentyApplied;

	void productDiscount() {

		System.out.println("Your product price before any discount is: $" + productPrice);
		double fiftyPercentDiscountPrice = productPrice * (fiftyPercentDiscount);

		double productPriceAfter50PercentDiscount = productPrice - fiftyPercentDiscountPrice;
		System.out.println("After 50% discount, price is: $" + productPriceAfter50PercentDiscount);

		if (isPromoFiveApplied) {

			double promoFiveDiscountPrice = fiftyPercentDiscountPrice * (promoFive);
			System.out.println("You got aditional Promo5 discount, i.e. $" + promoFiveDiscountPrice + " off");

			double productPriceAfterPromo5 = fiftyPercentDiscountPrice - promoFiveDiscountPrice;
			System.out.println("Final Price of the product is: $" + productPriceAfterPromo5);

		} else if (isPromoTenApplied) {

			double promoTenDiscountPrice = fiftyPercentDiscountPrice * (promoTen);
			System.out.println("You got aditional Promo10 discount, i.e.  $" + promoTenDiscountPrice + " off");

			double productPriceAfterPromo10 = fiftyPercentDiscountPrice - promoTenDiscountPrice;
			System.out.println("Final Price of the product is: $" + productPriceAfterPromo10);

		} else if (isPromoTwentyApplied) {

			double promoTewentyDiscountPrice = fiftyPercentDiscountPrice * (promoTwenty);
			System.out.println("You got aditional Promo20 discount, i.e. $" + promoTewentyDiscountPrice + " off");

			double productPriceAfterPromo20 = fiftyPercentDiscountPrice - promoTewentyDiscountPrice;
			System.out.println("Final Price of the product is: $" + productPriceAfterPromo20);

		} else {
			System.out.println("Final Price of the product is: $" + fiftyPercentDiscountPrice);
		}
	}
}
