package Fundamentals;

public class DominosBill {
	public static void main(String[] args) {
		FinalBillCalculation();

	}
	
	private static void FinalBillCalculation() {
		double pizzaPrice = 399.0;
		int noOfPizza = 2;
		double discountPercentage = 20.0;
		
		double totalPrice = pizzaPrice * noOfPizza;
		double discountAmount = totalPrice * (discountPercentage / 100);
		double finalBill = totalPrice - discountAmount;
		
		System.out.printf("Final bill amount: %.2f%n ", finalBill);
	}

}
