package Jwan.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true;
        int i =2;
        while(i <= number/i){  //
            if(number % i ==0){
                isPrime = false;
                break;
            }
            i++;
        }

        System.out.println(isPrime);

        input.close();


    }
}

/*
Write a method that can check if a number is prime or not
// Prime number: Is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself.
 */