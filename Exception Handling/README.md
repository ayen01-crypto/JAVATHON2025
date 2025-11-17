# Exception Handling

This section contains Java programs that demonstrate various exception handling techniques and best practices.

## Programs

### 1. DivisionHandler.java
A Java program that handles division by zero using a try-catch block.

**Features:**
- Catches ArithmeticException for division by zero
- Handles general exceptions for other errors
- Uses finally block for cleanup

### 2. AgeException.java
A program that throws a custom exception when the entered age is less than 18.

**Features:**
- Creates custom exception class extending Exception
- Implements validation logic with exception throwing
- Demonstrates checked exception handling

### 3. FileReader.java
A program to read a file and gracefully handle the case where the file is missing.

**Features:**
- Handles FileNotFoundException
- Uses proper resource management
- Provides meaningful error messages

### 4. MultipleExceptions.java
A program that catches multiple exceptions, including NumberFormatException and ArrayIndexOutOfBoundsException.

**Features:**
- Handles multiple exception types in single try block
- Uses specific catch blocks for different exceptions
- Demonstrates exception hierarchy handling

### 5. FinallyBlock.java
A banking application must always close the database connection.

**Features:**
- Demonstrates finally block execution
- Ensures resource cleanup regardless of exceptions
- Shows proper resource management pattern

## How to Run
To compile and run any of these programs, use the following commands in the terminal:

```bash
javac ProgramName.java
java ProgramName
```

Replace `ProgramName` with the actual name of the Java file (without the .java extension).

**Note:** For FileReader.java, you may want to create a test file or use an existing file to test the file reading functionality.