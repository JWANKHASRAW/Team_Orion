package Jwan.week5;

public class ReverseString {
    public static void main(String[] args) {

        String str ="home";
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }




    }

/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */



