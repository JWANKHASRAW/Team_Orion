package week3;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}

