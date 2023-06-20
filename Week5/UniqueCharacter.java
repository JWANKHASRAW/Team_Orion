package Week5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UniqueCharacter {
    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
        String str = "AAABBBBCCCCDEF";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j); // A
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // checks how many times the ch appears in str
                if (str.charAt(i) == ch) { //if the ch appeared in the string
                    frequency++;  //increase the frequency by 1
                }
            }
            if (frequency == 1) { // if the frequency is one then is unique
                unique += ch;
            }
        }
        System.out.println(unique);



}
}
