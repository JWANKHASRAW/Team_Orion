package week3;

import java.rmi.ServerError;

public class ReverseNegative {
    public static int reverseInteger(int number) {
        boolean isNegative = (number < 0) ? true : false;
        if (isNegative) {
            number = number * -1;
        }else{
        System.err.println("Number can be negative");
        System.exit(1);}

        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives us last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // for to get rid of last digit

        }
        return reverse*-1;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(-123));
    }
}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */