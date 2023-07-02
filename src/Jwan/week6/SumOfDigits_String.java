package Jwan.week6;

public class SumOfDigits_String {

    public static void main(String[] args) {


        System.out.println(sumOfDigits("hello2023Bye2022"));

    }

    public static int sumOfDigits(String str){

        int sum =0;
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if(Character.isDigit(c)){
                sum+= c-'0'; // value of 0 in the ASCII table is '48'.


            }


        }


        return sum;


    }





}
