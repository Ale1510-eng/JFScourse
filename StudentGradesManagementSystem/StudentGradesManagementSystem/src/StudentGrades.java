import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        /*
        Instructions:

        Step 1: Setup the Project

        Create a new Java project in your IDE.
        Create a class named StudentGrades.
        Step 2: Declare and Initialize Arrays

        Declare an array to store the grades of 10 students.
        Use a Scanner object to allow the user to input grades.
        Step 3: Implement Array Operations

        Write code to input grades from the user using a Scanner and store them in the array.
        Write code to calculate and print the average grade.
        Write code to find and print the highest and lowest grades.
        Write code to display all the grades.
        Step 5: Main Method

        In the main method, write the sequence of operations to:

        Input grades
        Calculate the average grade
        Find the highest and lowest grades
        Display the grades
        */

        double[] grades = new double[10];
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.println("Please enter the grades of 10 students: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Grade " + (i + 1) + " ");
            grades[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (double grade : grades) {
            sum += grade;
        }
        System.out.println("The average grade is: " + sum / 10);

        int counter = 0;
        boolean swapped;

        do{
            swapped = false;
            for (int i = 0; i < 9 ; i++){
                if (grades[i] > grades[i + 1]){
                    double aux = grades[i];
                    grades[i] = grades[i + 1];
                    grades[i + 1] = aux;
                    swapped = true;
                }
            }
        } while(swapped);

        System.out.println("The highest grade is: " + grades[9]);
        System.out.println("The lowest grade is: " + grades[0]);

        System.out.println("List of the grades: ");
        for(double grade: grades){
            System.out.println(grade);
        }
        sc.close();
        
    }
}
