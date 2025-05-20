
import java.util.Scanner;

public class IncomeTaxCal {
    public static void main(String[] args) {
        System.out.print("Enter your annual income: ");
        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
        }

        System.out.println("Your tax is: " + tax);
        input.close();
    }
}
