package Arraysum;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in); // Fixed Scanner creation

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();

        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            num[i] = input.nextInt();
            i++;
        }

        return num; // Added return statement
    }
}
