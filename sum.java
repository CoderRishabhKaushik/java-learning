import java.util.Scanner;

public class sum {
    public static void main(String[] args) {


     Scanner input =  new Scanner(System.in);

     System.out.println("welcome to add two number ");

     System.out.print("Enter your first number: ");
     int firstNum = input.nextInt(); //4


     System.out.print("Enter your second number: ");
     int secondNum = input.nextInt(); // 6

     int sumNum= firstNum + secondNum; // 4 + 6 = 10 

     System.out.print("The sum of two number is :" +sumNum );




    }
}