import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random()*50+1);
        int number = 0;
        int attempts = 0;
        boolean playAgain = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the guess the number game!");

        while(attempts < 5){
            while(true){
                System.out.println("Please insert an integer number between 1 an 50 ");
                if(sc.hasNextInt()) {
                    number = sc.nextInt();
                    if (number >=1 && number <= 50){
                        attempts ++;
                        break;
                    } else {
                        System.out.println("The number is out of the range");
                        continue;
                    }
                }  else{
                    System.out.println("The number should be an integer");
                    sc.next();
                    continue;
                }
            }

            if(attempts == 5){
                System.out.println("Sorry, you have no attempts left. The secret number was: " + secretNumber);
            } else{
                if(number > secretNumber){
                    System.out.println("Too high, You have " + (5- attempts) + " attempts left.");

                } else if (number < secretNumber) {
                    System.out.println("Too low, You have " + (5 - attempts) + " attempts left.");
                } else {
                    System.out.println("Congratulations! you guess the number in " + attempts + " attempts");
                    break;
                }
            }

        }


    }
}
