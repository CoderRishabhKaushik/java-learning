
import java.util.Scanner;

public class BionominalCofficent {
    public static int FactorialMethod(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    public static int BionominalCoefficient(int n, int r) {
        return FactorialMethod(n) / (FactorialMethod(r) * FactorialMethod(n - r));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of r: ");
        int r = input.nextInt();

        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
        } else {
            int result = BionominalCoefficient(n, r);
            System.out.println("The Bionominal Coefficient C(" + n + ", " + r + ") is: " + result);
        }

    }
}
