package Week4;

import java.util.Arrays;

public class SameLetters {
    public static boolean SameLetters(String word1, String word2) {

        /*
        Write a return method that check if a string is build out of the same letters as another string:
        Ex: same("abc, cab"); -> true
        same("abc", "abb"); -> false
         */


        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);

    }


    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "cab";


        System.out.println(SameLetters(word1, word2));
    }
}