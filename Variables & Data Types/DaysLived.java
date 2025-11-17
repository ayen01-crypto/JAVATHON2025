import java.util.Scanner;

public class DaysLived {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age in years: ");
        int age = scanner.nextInt();
        
        // Calculate days lived (assuming 365 days per year)
        int daysLived = age * 365;
        
        System.out.println("You have lived approximately " + daysLived + " days.");
        
        scanner.close();
    }
}