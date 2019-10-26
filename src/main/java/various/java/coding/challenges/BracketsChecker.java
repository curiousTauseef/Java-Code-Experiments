package various.java.coding.challenges;

import java.util.Stack;

/**
 * @author ilariacorda on 25/10/2019.
 * @project Java-Code-Experiments
 * Implement a Brackets Checker application by using Stacks
 */


public class BracketsChecker {


    public static void main(String args[]) {
        Boolean validBrackets = validateBrackets("{[]}");
        System.out.println("The provided brackets returned the following validation result " + validBrackets);
        Boolean invalidBrackets = validateBrackets("[}]");
        System.out.println("The provided brackets returned the following validation result " + invalidBrackets);

    }

    public static boolean validateBrackets(String brackets) {

        boolean isValidPair;

        Stack<Character> myStack = new Stack<>();

        int openBracketCount = 0;
        int closeBracketCount = 0;

        //Check for open brackets and push them to the stack
        for (int i = 0; i < brackets.length(); i++) {


            if (brackets.charAt(i) == '{' || brackets.charAt(i) == '[' || brackets.charAt(i) == '(') {
                myStack.push(brackets.charAt(i));
                openBracketCount++;


            }
            //Check for closing brackets
            else if (brackets.charAt(i) == '}' || brackets.charAt(i) == ']' || brackets.charAt(i) == ')') {

                closeBracketCount++;
                //If the bracket pairs are validated then return true, otherwise return false
                if (!ValidateBracketPairs(myStack.pop(), brackets.charAt(i))) {
                    isValidPair = false; //return false when the brackets do not match
                    return isValidPair;

                }
            }


            if (i > brackets.length()) {

                if (openBracketCount != closeBracketCount) {
                    isValidPair = false;
                    return isValidPair;
                }
            }

        }


        isValidPair = true; // true if they all match
        return isValidPair;

    }


    public static boolean ValidateBracketPairs(char opening, char closing) {

        return (opening == '(' && closing == ')')
                || (opening == '[' && closing == ']')
                || (opening == '{' && closing == '}');

    }
}