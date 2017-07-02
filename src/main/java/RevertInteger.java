/**
 * Created by ilariacorda on 02/07/2017.
 * Java Software to revert an integer
 */
public class RevertInteger {

    public static void main(String args[]) {
        int givenInt = -234580934;
        int output = RevertInteger.revertInteger(givenInt);
        System.out.println("Given " + givenInt + " This is the reverted version " + output);

    }

    public static int revertInteger(int number) {
        boolean isNegative = number < 0;
        //If negative we first multiply by -1 to make it positive
        if (isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10; //with this you can obtain the last digit of the number
            reverse = reverse * 10 + lastDigit;
            number = number / 10; //Now we can get rid of the last digit
        }

        if (number == Integer.MAX_VALUE) {
            return 0;
        } else {

            return isNegative == true ? reverse * -1 : reverse;
        }

    }

}