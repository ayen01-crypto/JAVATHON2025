import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (n == 1) {
            System.out.println("Fibonacci sequence: 0");
        } else if (n == 2) {
            System.out.println("Fibonacci sequence: 0 1");
        } else {
            System.out.print("Fibonacci sequence: 0 1 ");
            
            int first = 0, second = 1;
            
            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
            
            System.out.println(); // New line at the end
        }
        
        scanner.close();
    }
}