package various.java.coding.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Using java.util.Scanner class to create a very basic login system in Java
 */

public class LoginScannerExample {

    public static void main(String[] args) {

        /**
         * It reads login's credentials from a properties file
         */

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream is = loader.getResourceAsStream("credentials.properties");
        Scanner scan = new Scanner(is);

        Scanner keyboardInput = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine(); //Check the current values in scan as from the file

        System.out.println("scanned username is " + username);
        System.out.println("scanned password is " + password);

        System.out.println("Enter your username: ");
        String inputUsername = keyboardInput.nextLine();

        System.out.println("Enter your password: ");
        String inputPassword = keyboardInput.nextLine(); //Check the values as passed into by the user from the console

        /**
         * Check that the provided username is the same as the one in the credentials' file
         */

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("You have inserted a correct username. Access is now granted");
        } else {
            System.out.println("You have provided a username and/or password combination that is incorrect");

        }
    }
}
