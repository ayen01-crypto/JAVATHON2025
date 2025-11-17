// Shape interface
interface Shape {
    double area();
    double perimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getRadius() {
        return radius;
    }
}

// Square class implementing Shape interface
class Square implements Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
    
    @Override
    public double perimeter() {
        return 4 * side;
    }
    
    public double getSide() {
        return side;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Create shape objects
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        
        // Display circle details
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println();
        
        // Display square details
        System.out.println("Square:");
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}