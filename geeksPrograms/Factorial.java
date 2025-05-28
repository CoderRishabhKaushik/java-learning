import java.util.Scanner;

public class Factorial {

    public static int FactorialMethod(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = input.nextInt();
        int result = FactorialMethod(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }
}