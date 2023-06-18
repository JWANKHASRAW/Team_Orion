package week3;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("ERDeN");
    }

    public static void reverseString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }


        System.out.println(reverse);


    }
}