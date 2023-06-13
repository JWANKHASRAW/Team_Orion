package Anas.week4;

import java.util.Scanner;

public class SameLetters {
    public static void main(String[] args) {
//        String -- Same letters
//        Write a return method that check if a string is build out of the
//        same letters as another string.
//                Ex: same("abc", "cab"); -> true
//        same("abc", "abb"); -> false:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = input.next();
        System.out.println("Enter second word: ");
        String secondWord = input.next();


        String holder="";
        for (int i = 0; i <firstWord.length(); i++) {
            for (int j = 0; j <secondWord.length() ; j++) {
                if(firstWord.charAt(i)==secondWord.charAt(j)){
                    holder+=secondWord.charAt(j);
                }
            }
        }

        if (firstWord.equals(holder)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        input.close();
    }
}
