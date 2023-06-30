package Anas.week4;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
//        String -- Frequency of Characters
//        Write a return method that can find the frequency of
//        characters
//        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();

        String frequencyOfChars = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(frequencyOfChars.contains(""+str.charAt(i)))) {

            /**17: if statement marks letters delt with in order not to iterate them again in 16 */

                int container = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
            /**25: used to count the number of reoccurring letters in string */
                    container++;
                    }
                }
                frequencyOfChars+=""+str.charAt(i)+container;
            }
        }
        System.out.println(frequencyOfChars);
    }
}
