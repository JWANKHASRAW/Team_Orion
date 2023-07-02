package Jwan.week6;

public class findMaxArray {


    public static void main(String[] args) {

        int[] numbers = {-5, -3, -20, -7, -2};

        int maxNum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>maxNum){
                maxNum =numbers[i];

            }
        }
        System.out.println(maxNum);





    }




}
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array

 */