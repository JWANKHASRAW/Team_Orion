package Anas.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapNumber {
    //Numbers -- Swap Numbers
    //Swap two variables values without using a third variable

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,6));

        int a = number.get(0);
        int b = number.get(1);
        System.out.println("a: "+ a+" b: "+b);

        Collections.swap(number,0,1);

        a = number.get(0);
        b = number.get(1);
        System.out.println("a: "+ a+" b: "+b);
    }
}
