package Jwan.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Please enter a number"); //prime number is a whole number that their multiples are only the number itself and one.
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true;
        int i =2;
        while(i <= number/i){  //13/2 =6.5 --> i will stop at 7 as 7>6.5.
            if(number % i ==0){ //to check if it is a multiple we can use the mod (mod it just gives us the remainder
                isPrime = false;
                break;
            }
            i++;
        }

        System.out.println(isPrime);

        input.close();


    }
}

