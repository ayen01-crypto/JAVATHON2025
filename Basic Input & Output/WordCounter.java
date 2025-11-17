import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Trim leading/trailing spaces and split by spaces
        String[] words = sentence.trim().split("\\s+");
        
        // Handle empty input
        int wordCount = 0;
        if (!sentence.trim().isEmpty()) {
            wordCount = words.length;
        }
        
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
}