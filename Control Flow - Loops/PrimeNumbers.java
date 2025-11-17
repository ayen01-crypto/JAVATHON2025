public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            
            // Check if number is prime
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        
        System.out.println(); // New line at the end
    }
}