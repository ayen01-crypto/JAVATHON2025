import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }
        
        // Create array
        int[] array = new int[n];
        
        // Read elements into array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        
        // Calculate average
        double average = (double) sum / n;
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        
        scanner.close();
    }
}