package Fundamentals;

public class SwapThreeWithoutTemp {
	public static void main(String[] args) {
		SwapWithoutTemp(40,50,60);
	}


private static void SwapWithoutTemp(int num1, int num2, int num3) {
	num1 = num1 + num2 + num3;
	num2 = num1 - num2 - num3;
	num3 = num1 - num2 - num3;
	num1 = num1 - num2 - num3;
	System.out.println("-------------------------------------------");
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
}
}
