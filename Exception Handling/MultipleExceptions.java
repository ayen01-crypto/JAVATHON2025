import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Array index out of bounds example
            int[] numbers = {10, 20, 30};
            System.out.print("Enter an index (0-2) to access array element: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Array element at index " + index + ": " + numbers[index]);
            
            // Number format exception example
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds! Please enter an index between 0 and 2.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred - " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}