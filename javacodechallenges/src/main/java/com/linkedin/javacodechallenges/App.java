package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpper = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                hasLower = true;
            }
            if (hasDigit && hasUpper && hasLower) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
