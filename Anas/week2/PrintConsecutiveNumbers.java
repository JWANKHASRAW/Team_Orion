package Anas.week2;

import java.util.Scanner;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = input.nextInt();

        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }

        }
    }


