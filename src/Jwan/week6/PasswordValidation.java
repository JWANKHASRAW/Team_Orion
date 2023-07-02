package Jwan.week6;

import java.util.InputMismatchException;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println(passwordIsValid("Hi125!"));


    }



    public static boolean passwordIsValid(String password){

        if(!(password.length()==6) || (password.contains(" "))){
            throw new InputMismatchException("Password must be at least six characters");

        }

        boolean hasUpperCase =false, hasLowerCase =false, hasDigit=false, hasSpecialCharacter=false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if(Character.isUpperCase(c)){
                hasUpperCase = true;
            }else if (Character.isLowerCase(c)){
                hasLowerCase = true;

            }else if(Character.isDigit(c)){
                hasDigit = true;
                {
                    hasSpecialCharacter = true;
                }
            }


        }

        return hasUpperCase && hasDigit && hasLowerCase && hasSpecialCharacter;




    }





}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */