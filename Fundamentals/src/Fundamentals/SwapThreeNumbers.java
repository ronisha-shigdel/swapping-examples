package Fundamentals;

public class SwapThreeNumbers {
	public static void main (String[] args) {
		SwapThreeWithTemp(10,20,30);	
	}
	
	private static void SwapThreeWithTemp(int num1, int num2, int num3) {
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = temp;
		System.out.println("-------------------------------------------");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
