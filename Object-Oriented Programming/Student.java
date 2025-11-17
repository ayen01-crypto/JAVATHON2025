import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String grade;
    
    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.grade = "";
    }
    
    // Parameterized constructor
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getGrade() {
        return grade;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array of students
        Student[] students = new Student[3];
        
        // Initialize students
        students[0] = new Student(1, "Alice", 20, "A");
        students[1] = new Student(2, "Bob", 19, "B");
        students[2] = new Student(3, "Charlie", 21, "A");
        
        // Display all students
        System.out.println("Student Details:");
        System.out.println("----------------");
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
        
        scanner.close();
    }
}