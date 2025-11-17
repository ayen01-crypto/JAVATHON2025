import java.util.Scanner;

public class SalesComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first sales figure: ");
        int sales1 = scanner.nextInt();
        
        System.out.print("Enter the second sales figure: ");
        int sales2 = scanner.nextInt();
        
        System.out.print("Enter the third sales figure: ");
        int sales3 = scanner.nextInt();
        
        int highest = sales1;
        
        if (sales2 > highest) {
            highest = sales2;
        }
        
        if (sales3 > highest) {
            highest = sales3;
        }
        
        System.out.println("The highest sales figure is: " + highest);
        
        scanner.close();
    }
}