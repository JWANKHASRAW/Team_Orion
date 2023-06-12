package Jwan.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");




    }

    public static String removeDuplicates(String str){


        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str=str.replace("," , "").replace(" ", "").replace("[" , "").replace("]", "");
        System.out.println(str);

        return str;
    }




}

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */



