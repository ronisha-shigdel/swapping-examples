package Fundamentals;

public class SavingsCalculation {
    public static void main(String[] args) {
        CalculateSavings();
    }

    private static void CalculateSavings() {
        int deposit = 500000;
        int time = 5;
        double interestRate = 6.8;

        double interestAmount = (deposit * time * interestRate) / 100;
        double finalAmount = deposit + interestAmount;

        System.out.printf("Interest Amount: %.2f%n ", interestAmount);
        System.out.printf("Final Amount: %.2f%n ", finalAmount);
    }
}
