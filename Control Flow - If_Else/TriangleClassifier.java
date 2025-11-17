import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of first side: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of second side: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of third side: ");
        double side3 = scanner.nextDouble();
        
        // Check if it forms a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral (all sides are equal).");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is isosceles (two sides are equal).");
            } else {
                System.out.println("The triangle is scalene (all sides are different).");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
        
        scanner.close();
    }
}