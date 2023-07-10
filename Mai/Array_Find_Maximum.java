package Mai;

import java.util.Arrays;

public class Array_Find_Maximum {

    public static void main(String[] args) {


        int [] array = {1000, 20, 5, 60, 50, 100, 500};

        int max = Arrays.stream(array).max().getAsInt();

        System.out.println("Maximum number is: "+max);



    }

}
