import java.util.Scanner;

public class ArrayMergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read first array
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // Read second array
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // Merge arrays
        int[] mergedArray = new int[size1 + size2];
        int index = 0;
        
        // Copy elements from first array
        for (int i = 0; i < size1; i++) {
            mergedArray[index++] = array1[i];
        }
        
        // Copy elements from second array
        for (int i = 0; i < size2; i++) {
            mergedArray[index++] = array2[i];
        }
        
        // Sort merged array using bubble sort
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - 1 - i; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    // Swap elements
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }
        
        // Print sorted merged array
        System.out.print("Sorted merged array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println(); // New line at the end
        
        scanner.close();
    }
}