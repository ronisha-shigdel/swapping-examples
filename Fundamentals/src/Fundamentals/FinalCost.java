package Fundamentals;

public class FinalCost {
	public static void main (String[] args) {
		FinalCostCalculation(699, 18);
	}
	
	private static void FinalCostCalculation(int price, double gst) {
		double gstAmount = gst/100;
		
		double finalcost = price + (price * gstAmount);
		
		System.out.printf("Final cost: %.2f%n ",finalcost);
	}
}
