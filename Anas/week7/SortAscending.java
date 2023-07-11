package Anas.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7};

        System.out.println(
                Arrays.toString(sort(arr))
        );
    }

    public static int[] sort(int[] arr) {
        TreeSet<Integer> ascender = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            ascender.add(arr[i]);
        }

        for (int i = 0; i < ascender.size(); i++) {
            arr [i] = new ArrayList<>(ascender).get(i);
        }
        return arr;
    }
}
