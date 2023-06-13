package SORINA;

import java.util.Arrays;
public class SameLetters {
        public static boolean same(String str1, String str2) {
            // Convert the strings to character arrays and sort them
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare the sorted character arrays
            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {
            String str1 = "abc";
            String str2 = "cab";
            System.out.println(same(str1, str2));  // Output: true

            str1 = "abc";
            str2 = "abb";
            System.out.println(same(str1, str2));  // Output: false
        }
    }

/*
    Write a return method that can check if a string is build out of the same letters as another string.

    Ex: same("abc, cab"); -> True
        same("abc, abb"); -> False

 */
