import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert to lowercase and remove spaces for comparison
        String cleanedInput = input.toLowerCase().replaceAll("\\s+", "");
        
        // Reverse the string
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        
        // Check if palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}