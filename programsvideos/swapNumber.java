
import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swap two numbers");
        System.out.print("Enter the Value of A: ");
        int a = input.nextInt();
        System.err.print("Enter the Value of B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;

        System.err.println("The value of A: " + a);
        System.err.println("The value of B: " + b);

    }
}