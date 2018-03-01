package various.java.coding.examples;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Example taken from https://www.hackerearth.com/practice-onboarding/sum-of-four-2
 * Small variations are applied and in particular IntStream is used as opposed to the traditional for loop
 */

public class SumOfFour {

    public static void main (String[] args){
        int array[] = new int[4]; //define and initialise an array of 4 int elements
        Scanner scan = new Scanner(System.in); //create a Scanner object

        int i;

        for(i=0; i<4; i++){
            array[i] = scan.nextInt(); //Here we are reading the input from the user
        }

        IntStream.rangeClosed(0,4); //Here we are replacing a traditional loop with IntStream
            int sum = 0; //the sum is first initialised to 0;
            sum += array[i];
            System.out.println("The sum of all integers in the array is " + sum);

        scan.close();
    }
}
