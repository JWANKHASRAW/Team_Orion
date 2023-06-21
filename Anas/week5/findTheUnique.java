package Anas.week5;

import java.util.Arrays;

public class findTheUnique {
//    String -- Find the unique
//    Write a return method that can find the unique characters from the String
//    Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        char[] chars = str.toCharArray();

        findTheUniqueMethod(chars);
    }

    public static void findTheUniqueMethod(char[] chars) {
        for (char each : chars) {
            int count = 0;
            for (char other : chars) {
                if (each == other) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each);
            }
        }


    }
}
