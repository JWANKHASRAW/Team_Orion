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

        /*
        char ch ='A';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ch){
                count++;
            }
        }
        System.out.println("count = " + ch + count);
        */



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



