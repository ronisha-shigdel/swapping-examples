package Fundamentals;

public class swapTwoWithoutTemp {
	public static void main(String[] args) {
		swapWithoutTemp(5,6);
	}
	private static void swapWithoutTemp(int num1, int num2) {
		num1 = num1 + num2;
		num2= num1 - num2;
		num1 = num1 - num2;
		System.out.println("Swapping 2 numbers without temp variable:");
		System.out.println("num1 ="+ num1);
		System.out.println("num2 ="+ num2);
	}
}
