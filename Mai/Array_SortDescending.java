package Mai;

import java.util.Arrays;
import java.util.Collections;

public class Array_SortDescending {

    public static void main(String[] args) {

        Integer arr[] = {10,20,7, 8, 90};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));


    }


}
