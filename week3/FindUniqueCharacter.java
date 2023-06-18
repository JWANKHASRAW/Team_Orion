package week3;

import java.util.Arrays;
import java.util.Collections;

public class FindUniqueCharacter {
    public static String findUnique(String str) {

        String[] arrStr = str.split(""); // converts String to Array

        String result = "";
        for (String each : arrStr) {

            if (Collections.frequency(Arrays.asList(arrStr), each) == 1) { // frequency method counts how many "each" there are in the array.
                result += each;                                            //frequency methods returns int.
            } else {
                continue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findUnique("ABCDDDEEFGGGH"));
    }


}
