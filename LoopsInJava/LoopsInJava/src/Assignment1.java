import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
       /*
       * Assignment Tasks:

        Print Numbers:

        Write a for loop that prints the numbers from 1 to 10.
        Calculate Sum:

        Write a for loop that calculates the sum of the first 10 positive integers and prints the result.
        Print Multiplication Table:

        Write a for loop that prints the multiplication table of a number provided by the user (from 1 to 10).
       */

        System.out.println("Numbers from 1 to 10");
       for (int i = 1; i <= 10; i ++){
           System.out.println(i);
       }

        System.out.println("Sum of the first 10 positive integers");
       int sum = 0;
       for (int i = 1; i <= 10; i ++){
           System.out.println("Sum: " + (sum+=i));
       }

       Scanner sc = new Scanner(System.in);
       System.out.println("Number of the multiplication table: ");
       int number = sc.nextInt();
       for (int i = 1; i <= 10 ; i++ ){
           System.out.println(number + " x " + i + " = " + number*i);
       }

    }
}
