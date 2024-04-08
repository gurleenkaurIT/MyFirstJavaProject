package ifElseAssignmentQuestion2;

public class productDiscountMain {

	public static void main(String[] args) {

		ProductDiscount productDiscount = new ProductDiscount();
		productDiscount.productPrice = 25;
		productDiscount.isPromoFiveApplied = false;
		productDiscount.isPromoTenApplied = false;
		productDiscount.isPromoTwentyApplied = true;
		productDiscount.productDiscount();

	}
}
