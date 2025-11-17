import java.util.Scanner;

public class PowerCalculator {
    
    // Recursive method to calculate power
    public static double power(double base, int exponent) {
        // Base case
        if (exponent == 0) {
            return 1;
        }
        
        // Handle negative exponents
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        
        // Recursive case
        return base * power(base, exponent - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        
        double result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
        
        scanner.close();
    }
}