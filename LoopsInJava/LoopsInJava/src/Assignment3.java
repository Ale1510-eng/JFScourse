import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        /*
         Assignment Tasks:

        Menu-Driven Calculator:

        Write a menu-driven program using a do-while loop that repeatedly displays a menu with options to add,
        subtract, multiply, and divide two numbers. The user should be able to choose an option, perform the
        operation, and see the result. The program should exit only when the user chooses an exit option.
        */

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        char operator = '+';

        System.out.println("Welcome to the Calculator!");
        do{
            System.out.println("""
                    Please select an operation:
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Exit
                    """);
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice != 5){
                if(choice >0 && choice <=4){
                    System.out.println("Enter the first number: ");
                    firstNumber = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the second number:");
                    secondNumber = sc.nextDouble();
                    switch (choice) {
                        case 1:
                            result = firstNumber + secondNumber;
                            operator = '+';
                            break;
                        case 2:
                            result = firstNumber - secondNumber;
                            operator = '-';
                            break;
                        case 3:
                            result = firstNumber * secondNumber;
                            operator = '*';
                            break;
                        case 4:
                            result = firstNumber / secondNumber;
                            operator = '/';
                            break;
                    }
                    System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
                } else {
                    System.out.println("Invalid option");
                }
            } else {
                System.out.println("Exiting the calculator. Thank you!");
                break;
            }



        } while(true);
    }
}
