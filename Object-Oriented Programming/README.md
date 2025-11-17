# Object-Oriented Programming

This section contains Java programs that demonstrate fundamental OOP concepts including classes, objects, inheritance, and interfaces.

## Programs

### 1. BankAccount.java
A Java class BankAccount with methods to deposit and withdraw money, and test it with sample transactions.

**Features:**
- Encapsulation with private fields and public methods
- Data validation in deposit and withdraw methods
- Balance tracking and account information display

### 2. Rectangle.java
A class Rectangle with methods to compute area and perimeter, then create objects to test these methods.

**Features:**
- Basic class with properties and methods
- Getter and setter methods for data access
- Mathematical calculations for area and perimeter

### 3. Student.java
A Student class with constructors, getters, and setters. Create an array of students and display their details.

**Features:**
- Multiple constructors (default and parameterized)
- Complete getter and setter methods
- Array of objects demonstration

### 4. Animal.java
An inheritance hierarchy where Animal is the parent and Dog and Cat are children, each implementing a sound() method.

**Features:**
- Inheritance with extends keyword
- Method overriding with @Override annotation
- Polymorphism demonstration

### 5. Shape.java
A design team wants a common interface for shapes.

**Features:**
- Interface definition with abstract methods
- Implementation in Circle and Square classes
- Polymorphism through interface reference

## How to Run
To compile and run any of these programs, use the following commands in the terminal:

```bash
javac ProgramName.java
java ProgramName
```

Replace `ProgramName` with the actual name of the Java file (without the .java extension).

**Note:** Some programs contain multiple classes in a single file. The public class name should be used as the ProgramName when compiling and running.