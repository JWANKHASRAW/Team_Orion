package week3;

import java.util.Arrays;

public class SameLetters
{ public static boolean ifSameLetter(String a, String b) {
    if (a == null) {
        return b == null;
    } else if (b == null) {
        System.err.println("Given strings can not be null!");
        System.exit(1);
    }
    char[] left = a.toLowerCase().toCharArray(); // [a, b, c ]
    char[] right = b.toLowerCase().toCharArray(); // [b, c, a ]
    Arrays.sort(left); // -- > [a, b, c]
    Arrays.sort(right); // -- > [a, b ,c ]
    return Arrays.equals(left, right); //==> if they are same returns true otherwise false
}


    public static void main(String[] args) {
        System.out.println(ifSameLetter("LARDS","ARDLT"));
    }
}
