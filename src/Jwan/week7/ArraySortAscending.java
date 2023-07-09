package Jwan.week7;

import java.util.Arrays;
import java.util.TreeSet;

public class ArraySortAscending {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        int i=0;
        Integer[]arr2= new Integer[arr.length];
        for (int each: arr){
            arr2[i++]= Integer.valueOf(each);

        }
        TreeSet<Integer> ascendingSet = new TreeSet<>(Arrays.asList(arr2));
        System.out.println(ascendingSet);




    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};


  Integer[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        List a1 = Arrays.asList(arr1);

        TreeSet<Integer> set = new TreeSet<>(a1);
        for (Integer each : set) {
            System.out.println(each + " ");
        }


 */