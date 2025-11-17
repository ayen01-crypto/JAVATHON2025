import java.util.Scanner;

public class DivisionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator;
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            scanner.close();
        }
    }
}