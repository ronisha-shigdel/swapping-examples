package Fundamentals;

public class SwapFourWithTemp {
	public static void main(String[] args) {
		SwapWithTemp(70,80,90,100);
	}
	
	private static void SwapWithTemp(int num1, int num2, int num3, int num4) {
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = num4;
		num4 = temp;
		System.out.println("-------------------------------------------");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
