import java.util.Scanner;

public class StringCompressor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            System.out.println("Compressed string: ");
            return;
        }
        
        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;
        
        // Process each character
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                // Append character and its count to result
                compressed.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        
        // Append the last character and its count
        compressed.append(currentChar).append(count);
        
        System.out.println("Original string: " + input);
        System.out.println("Compressed string: " + compressed.toString());
        
        scanner.close();
    }
}