import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount (P): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (r): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter number of times interest is compounded per year (n): ");
        int compoundFrequency = scanner.nextInt();
        
        System.out.print("Enter time in years (t): ");
        int time = scanner.nextInt();
        
        // Calculate compound interest using formula A = P(1 + r/n)^(n*t)
        double amount = principal * Math.pow((1 + rate/compoundFrequency), (compoundFrequency * time));
        double interest = amount - principal;
        
        System.out.println("Final amount: " + amount);
        System.out.println("Compound interest earned: " + interest);
        
        scanner.close();
    }
}