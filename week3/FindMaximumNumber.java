package week3;

import java.util.Arrays;
import java.util.Collections;

public class FindMaximumNumber {
    public static int findMaximum(Integer[] list){
        int maximumNumber = Collections.max(Arrays.asList(list));


        return maximumNumber;
    }

    public static void main(String[] args) {
        Integer[] list = {1,3,78,48,98,-10};
        System.out.println(findMaximum(list));
    }

}
