import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();
        
        Scanner fileScanner = null;
        
        try {
            fileScanner = new Scanner(new File(fileName));
            
            System.out.println("File contents:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found!");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
            scanner.close();
        }
    }
}