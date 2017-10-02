package main.concepts;
/**
 * Created by ilariacorda on 02/07/2017.
 * Java Software to revert an integer that also deals with overflown integers
 */
public class RevertIntegerOverflow {

    public static void main(String args[]) {

        //Negative integer
        int negativeInt = -23458;
        int output = RevertIntegerOverflow.reverse(negativeInt);
        System.out.println("Given negative integer " + negativeInt + " This is the reverted version " + output);

        //Positive integer
        int positiveInt = 3458;
        int outputPositive = RevertIntegerOverflow.reverse(positiveInt);
        System.out.println("Given positive integer " + positiveInt + " This is the reverted version " + outputPositive);

        //Overflown integer
        int overflownInt = Integer.MAX_VALUE;
        int outputOverflown = RevertIntegerOverflow.reverse(overflownInt);
        System.out.println("Given overflown integer " + overflownInt + " This is the reverted version " + outputOverflown);
    }

    public static int reverse(int number) {
        // use
        long result = 0L;

        boolean isNegative = number < 0;
        //If negative we first multiply by -1 to make it positive
        if (isNegative) {
            number = number * -1;
        }
        while (number >= 1) {
            result = result * 10 + (number % 10);
            number = number / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}

