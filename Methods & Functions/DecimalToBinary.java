import java.util.Scanner;

public class DecimalToBinary {
    
    // Method to convert decimal to binary
    public static String toBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        
        return binary.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        if (decimal < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            String binary = toBinary(decimal);
            System.out.println("Binary representation of " + decimal + " is: " + binary);
        }
        
        scanner.close();
    }
}