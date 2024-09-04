package Fundamentals;

public class TaxAmount {

	public static void main(String[] args) {
		CalculateTax();
	}

	private static void CalculateTax() {
		int salary = 85000;
		double taxPercentage = 20.0;
		
		double taxAmount = salary * (taxPercentage/100);
		double takeHomePay = salary - taxAmount;
		
		System.out.printf("Final take home pay: %.2f%n ", takeHomePay);
	}
}
