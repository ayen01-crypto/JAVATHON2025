import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Array to store frequency of each character
        int[] frequency = new int[256]; // ASCII characters
        
        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }
        
        // Find first non-repeating character
        char firstNonRepeating = '\0'; // Null character as default
        for (int i = 0; i < input.length(); i++) {
            if (frequency[input.charAt(i)] == 1) {
                firstNonRepeating = input.charAt(i);
                break;
            }
        }
        
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        scanner.close();
    }
}