# Strings

This section contains Java programs that demonstrate string manipulation and processing techniques.

## Programs

### 1. PalindromeChecker.java
A Java program to check if a given string is a palindrome.

**Features:**
- Removes spaces and converts to lowercase for accurate comparison
- Uses StringBuilder.reverse() for string reversal
- Handles phrases and sentences with punctuation

### 2. CharacterCounter.java
A program to count vowels, consonants, digits, and spaces in a string.

**Features:**
- Classifies each character in the string
- Uses character-by-character processing
- Provides detailed count of each character type

### 3. RemoveDuplicates.java
A program to remove all duplicate characters from a string.

**Features:**
- Preserves first occurrence of each character
- Uses boolean array to track seen characters
- Maintains original order of characters

### 4. FirstNonRepeating.java
A program to find the first non-repeating character in a string.

**Features:**
- Uses two-pass algorithm for efficiency
- Counts character frequencies first
- Finds first character with frequency of 1

### 5. StringCompressor.java
A text-compression service needs a simple algorithm.

**Features:**
- Compresses consecutive repeated characters
- Formats output as character followed by count
- Handles strings of any length

## How to Run
To compile and run any of these programs, use the following commands in the terminal:

```bash
javac ProgramName.java
java ProgramName
```

Replace `ProgramName` with the actual name of the Java file (without the .java extension).