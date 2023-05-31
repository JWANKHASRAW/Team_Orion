package Anas.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapNumber {
    //Numbers -- Swap Numbers
    //Swap two variables values without using a third variable

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,6));
        System.out.println("ArrayList<Integer> number print: " + number);//[1, 6]

        Collections.swap(number,0,1);
        System.out.println("Collections.swap(number,0,1): =  " +number);//[6, 1]
    }
}
