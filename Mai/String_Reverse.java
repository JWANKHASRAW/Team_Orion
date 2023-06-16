package Mai;

import java.util.Scanner;

public class String_Reverse {



    public static String reverse(String str){
        String rev ="";

        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverse("ABCD"));

    }

}
