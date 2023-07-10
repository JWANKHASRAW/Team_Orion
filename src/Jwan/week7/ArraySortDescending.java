package Jwan.week7;

import java.util.Arrays;
import java.util.TreeSet;

public class ArraySortDescending {
    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90, 0, -4};
        int n=0;
        Integer[] arr2 = new Integer[arr.length];
        for (int each : arr) {
            arr2[n++]= Integer.valueOf(each);

        }
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr2));

        System.out.println(set.descendingSet());


    }
}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};

 */