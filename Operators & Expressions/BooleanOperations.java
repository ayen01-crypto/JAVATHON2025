import java.util.Scanner;

public class BooleanOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
        
        // Perform boolean operations
        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean xorResult = a ^ b;
        
        System.out.println("AND operation (" + a + " && " + b + "): " + andResult);
        System.out.println("OR operation (" + a + " || " + b + "): " + orResult);
        System.out.println("XOR operation (" + a + " ^ " + b + "): " + xorResult);
        
        scanner.close();
    }
}