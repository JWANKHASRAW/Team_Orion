package Jwan.week4;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    public static void main(String[] args) {



        System.out.println(isSame("abc", "cab"));


    }

    public static boolean isSame(String str, String str1) {

        str = new TreeSet<String>(Arrays.asList(str.split(""))).toString();

        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();

        return str.equals(str1);


    }

}



/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false


 */

