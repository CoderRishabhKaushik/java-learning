import java.util.Scanner;

public class sumofNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt(); // Read input from user

        int result = Sum(n); // Call the Sum function
        System.out.println("Sum of natural numbers up to " + n + " is: " + result);
    }

    public static int Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // Use <= to include 'n' in the sum
            sum = sum + i;
        }
        return sum; // Return the calculated sum
    }
}
