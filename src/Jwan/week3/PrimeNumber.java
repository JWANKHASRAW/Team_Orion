package Jwan.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <=number ; i++) {
            if(number% i ==0){
                isPrime = false;
                System.out.println(number + " is not a prime number");
                break;
            }
            if(isPrime){
                System.out.println(number + " is a prime number");
                break;
            }


        }




    }
}

/*
Write a method that can check if a number is prime or not
 */