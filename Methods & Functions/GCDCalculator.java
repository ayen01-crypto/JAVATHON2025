import java.util.Scanner;

public class GCDCalculator {
    
    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int result = gcd(Math.abs(num1), Math.abs(num2));
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        
        scanner.close();
    }
}