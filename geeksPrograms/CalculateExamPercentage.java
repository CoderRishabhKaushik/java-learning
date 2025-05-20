
import java.util.Scanner;

public class CalculateExamPercentage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate the Percentage.");
        System.out.print("Enter the Economic marks :");
        int Economic = input.nextInt();
        System.out.print("Enter the Math Marks: ");
        int Math = input.nextInt();
        System.out.print("Enter the English Marks: ");
        int English = input.nextInt();
        System.out.print("Enter the Account Marks: ");
        int Account = input.nextInt();
        System.err.print("Enter the Business Marks: ");
        int Business = input.nextInt();

        Sum(Economic, Math, English, Account, Business);
    }

    public static void Sum(int Economic, int Math, int English, int Account, int Business) {
        int totalMarks = 500;
        int obtainedMarks = Economic + Math + English + Account + Business;

        // Use double to avoid integer division
        double percentage = ((double) obtainedMarks / totalMarks) * 100;

        System.out.println("The Total Percentage is: " + percentage + "%");
    }
}
