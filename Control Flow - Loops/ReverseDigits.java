import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int reversed = 0;
        
        // Handle negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // Make it positive for processing
        }
        
        // Reverse the digits
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        // Apply negative sign if original number was negative
        if (isNegative) {
            reversed = -reversed;
        }
        
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }
}