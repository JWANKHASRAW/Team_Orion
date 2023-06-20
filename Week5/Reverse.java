package Week5;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    /*
    String -- Reverse
    Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String[] letters = {"A","B","C","D"};
                         //  0   1   2   3

        System.out.println("letters = " + Arrays.toString(letters) ); // D C B A as 0 1 2 3

       String[] reverse = new String[letters.length];  // j is index second number for string reverse

        for (int i = letters.length - 1, j =0; i >= 0; i--, j++) {  //starts from last index of array
            reverse [j] = letters[i];  // everytime i is decreased j is increased
        }


        System.out.println(Arrays.toString(reverse));







    }
}
