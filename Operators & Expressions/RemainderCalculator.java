import java.util.Scanner;

public class RemainderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int dividend = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int divisor = scanner.nextInt();
        
        if (divisor != 0) {
            int remainder = dividend % divisor;
            System.out.println("Remainder when " + dividend + " is divided by " + divisor + ": " + remainder);
        } else {
            System.out.println("Error: Division by zero is not allowed!");
        }
        
        scanner.close();
    }
}