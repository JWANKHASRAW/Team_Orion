package Anas.week5;

import java.util.Scanner;

public class reverse {
//    String -- Reverse
//    Write a return method that can reverse String
//    Ex: Reverse("ABCD"); ==> DCBA
    public static String reverser (String str){

        String rev ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(
                reverser("DCBA")
        );
    }
}
