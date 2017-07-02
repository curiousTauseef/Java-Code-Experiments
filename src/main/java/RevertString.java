/**
 * Created by ilariacorda on 02/07/2017.
 * Java Program to revert strings
 */

public class RevertString {

    public static void main(String args[]) {
        String givenString = "hello";
        String revertedString = revertString(givenString);
        System.out.println(revertedString);
    }

    public static String revertString(String given) {
        return new StringBuilder(given).reverse().toString();

    }
}
