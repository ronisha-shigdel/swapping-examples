package Fundamentals;

public class SalaryCalculation {
    public static void main(String[] args) {
        CalculateSalary();
    }

    private static void CalculateSalary() {
        double basicSalary = 85000.0;
        
        double ta = 0.15 * basicSalary;
        double da = 0.20 * basicSalary;
        double hra = 0.18 * basicSalary;
        
        double grossAmount = basicSalary + ta + da + hra;

        double pf = 0.20 * basicSalary;
        double tax = 0.25 * basicSalary;

        double netAmount = grossAmount - (pf + tax);

        System.out.printf("Gross Amount: %.2f%n  ", grossAmount);
        System.out.printf("Net Amount: %.2f%n ", netAmount);
    }
}
