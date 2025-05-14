
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication program");

        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        printMultiplicatonTable(num);
    }

    public static void printMultiplicatonTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }

}
