import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    // Getters
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    // Setters
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.2);
        
        // Display details of first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        System.out.println();
        
        // Display details of second rectangle
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        
        scanner.close();
    }
}