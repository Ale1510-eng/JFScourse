public class Exercise2 {
    public static void main(String[] args) {
        /*
        Create an array of 5 integers.
        Initialize the array with values.
        Update the third element to a new value.
        Print all elements of the array.
        */

        int[] integers = new int[5];

        System.out.println("Array initialized");
        for (int i = 0; i <= 4; i ++){
            integers[i] = (int) (Math.random()*100+1);
            System.out.println("index " + (i+1) + ": " + integers[i]);
        }


        integers[2] = 25;

        int counter = 0;
        System.out.println("Array modified");
        for(int integer: integers){
            System.out.println("index "+ counter + ": " + integer);
            counter++;
        }
    }
}
