package week3;

import java.util.LinkedHashSet;

public class RemoveDublicates {public static String removeDuplicates(String str) {
    LinkedHashSet<Character> uniqueCh = new LinkedHashSet<>();  // Created a LinkedHashSet to maintain the order of elements while removing duplicates


    for (char eachCh : str.toCharArray()) {   // Iterate through each character in the string
        uniqueCh.add(eachCh);   // Add the character to the LinkedHashSet
    }

    String result = "";                 // Build a string from the unique characters
    for (char eachCh : uniqueCh) {
        result += eachCh;
    }

    return result;
}

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }
}
