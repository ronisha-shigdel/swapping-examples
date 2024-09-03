package Fundamentals;

public class SwapFourWithoutTemp {
	public static void main(String[] args) {
		SwapWithoutTemp(100,200,300,400);
	}
	
	private static void SwapWithoutTemp(int num1, int num2, int num3, int num4) {
		num1 = num1 + num2 + num3 + num4;
		num2 = num1 - num2 - num3 - num4;
		num3 = num1 - num2 - num3 - num4;
		num4 = num1 - num2 - num3 - num4;
		num1 = num1 - num2 - num3 - num4;
		System.out.println("-------------------------------------------");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
