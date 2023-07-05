package Anas.week6;

import java.util.concurrent.locks.Condition;

public class PasswordValidationTask {
    public static void main(String[] args) {
        String password = "Aa1!/9zZ";
        System.out.println(
                validPwd(password)
        );
    }

    public static boolean validPwd(String password) {
        /*containers*/
        int length = 0;
        int space = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        int digit = 0;

        boolean isValid = false;
        for (int i = 0; i < password.length(); i++) {
            int selectedCharacter = password.charAt(i);

            //*Condition 1:
            //6 characters no space
            if (password.length() >= 6) {
                length++;
            }
            //no space*/
            if (selectedCharacter == 32) {
                space++;
            }
            /*Condition 2: upper case*/
            if (selectedCharacter <= 90 && selectedCharacter >= 65) {
                upperCase++;
            }
            /*Condition 3: lower case*/
            if (selectedCharacter <= 122 && selectedCharacter >= 97) {
                lowerCase++;
            }
            /*Condition 4: special character*/
            if (selectedCharacter <= 47 && selectedCharacter >= 33) {
                specialChar++;
            }
            /*Condition 5: contain digit*/
            if (selectedCharacter <= 57 && selectedCharacter >= 48) {
                digit++;
            }
        }

        if (length >= 1 && digit >= 1 && specialChar >= 1 && upperCase >= 1 && lowerCase >= 1 && space == 0) {
            isValid = true;
        }

        if (length < 1) {
            System.err.println("Password MUST be at least have 6 characters.");
        }
        if (space >= 1) {
            System.err.println("Password MUST not contain space.");
        }
        if (digit < 1) {
            System.err.println("Password should at least contain a digit.");
        }
        if (specialChar < 1) {
            System.err.println("Password should at least contain one special characters.");
        }
        if (upperCase < 1) {
            System.err.println("Password should at least contain one upper case letter.");
        }
        if (lowerCase < 1) {
            System.err.println("Password should at least contain one lowercase letter.");
        }
        return isValid;
    }
}
