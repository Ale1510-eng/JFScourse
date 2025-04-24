import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
       /*
       Assignment Tasks:

        User Input:

        Write a Java program that prompts the user to enter a positive integer.
        Use a Scanner object to read user input.
        Sum the Digits:

        Use a while loop to calculate the sum of the digits of the entered number.
        Continuously extract the last digit of the number and add it to a running total.
        Remove the last digit from the number using integer division.
        Output the Result:

        Once the sum of the digits has been calculated, print the result to the user.
        Optional Enhancements:

        Add input validation to ensure the user enters a positive integer.
        Allow the user to enter multiple numbers and calculate the sum of the digits for each one until they choose to exit.
       */

        Scanner sc = new Scanner(System.in);
        int number = 0;
        //boolean continueExecution = false;

        System.out.println("Enter a positive integer number: ");
        while (true){
            if (sc.hasNextInt()){
                number = sc.nextInt();
                if (number >= 0){
                    break;
                } else{
                    System.out.println("Enter a positive number please");
                    continue;
                }
            } else {
                System.out.println("Enter an integer number please");
                sc.next();
                continue;
            }
        }

        int aux = number;
        int sum = 0;

        while(aux > 0){
           sum += aux % 10;
           aux = aux/ 10;
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);




    }
}
