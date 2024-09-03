package Fundamentals;

public class swapping {

	public static void main(String[] args) {
		swapWithTemp(2,3);
	}



private static void swapWithTemp(int num1, int num2) {
	int temp = 0;
	temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println("Swapping 2 numbers with temp variable:");
	System.out.println("num1 ="+ num1);
	System.out.println("num2 ="+ num2);
}




}