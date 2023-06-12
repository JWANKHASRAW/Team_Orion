package Jwan.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        frequencyOfCharacter("AAABBCDD");

    }



    public static String frequencyOfCharacter(String str){




        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) { //converting Strig to an array
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each); //converting arrays to collections
            map.put(each.charAt(0), frequency);

        }

        System.out.println(map);


        return str;
    }

}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */



