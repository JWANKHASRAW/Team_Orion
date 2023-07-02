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
