public class Exercise3 {
    public static void main(String[] args) {
        /*Create an array of 10 integers
        Fill the array with multiples of 3.
        Print the length of the array and all its elements.
         */

        int[] numbers = new int[10];
        int value = 1;

        for (int i = 0; i < 10; i++){
            value *=3;
            numbers[i] = value;
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        System.out.println("The length of the array is: " + numbers.length);


    }
}
