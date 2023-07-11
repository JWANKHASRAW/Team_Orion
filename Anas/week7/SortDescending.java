package Anas.week7;

import java.util.*;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};

        System.out.println(
                Arrays.toString(sort(arr))
        );
    }

    public static int[] sort(int[] arr) {
        TreeSet<Integer> descender = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            descender.add(arr[i]);
        }
        //for (int number : arr) {
        //    descender.add(number);
        //}

        Stack<Integer> cookieJar = new Stack<>();
        for (int i = 0; i < descender.size(); i++) {
            cookieJar.add(new ArrayList<>(descender).get(i));
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = cookieJar.pop();
        }
        return arr;

    }
}




