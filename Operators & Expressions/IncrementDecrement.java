import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Original number: " + number);
        
        // Pre-increment
        System.out.println("Pre-increment (++number): " + (++number));
        System.out.println("After pre-increment: " + number);
        
        // Post-increment
        System.out.println("Post-increment (number++): " + (number++));
        System.out.println("After post-increment: " + number);
        
        // Pre-decrement
        System.out.println("Pre-decrement (--number): " + (--number));
        System.out.println("After pre-decrement: " + number);
        
        // Post-decrement
        System.out.println("Post-decrement (number--): " + (number--));
        System.out.println("After post-decrement: " + number);
        
        scanner.close();
    }
}