import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number == 0) {
                // This will cause an exception
                int result = 10 / number;
                System.out.println("Result: " + result);
            } else {
                System.out.println("You entered: " + number);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred - " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block executed - cleaning up resources...");
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed successfully.");
            }
        }
        
        System.out.println("Program completed.");
    }
}