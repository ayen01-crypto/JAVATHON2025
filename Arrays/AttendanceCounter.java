import java.util.Scanner;

public class AttendanceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read attendance data
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Number of days must be positive.");
            return;
        }
        
        int[] attendance = new int[n];
        
        System.out.println("Enter attendance figures for each day:");
        for (int i = 0; i < n; i++) {
            attendance[i] = scanner.nextInt();
        }
        
        // Read the attendance figure to search for
        System.out.print("Enter the attendance figure to count: ");
        int target = scanner.nextInt();
        
        // Count occurrences
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (attendance[i] == target) {
                count++;
            }
        }
        
        System.out.println("The attendance figure " + target + " appears " + count + " time(s) in the data.");
        
        scanner.close();
    }
}