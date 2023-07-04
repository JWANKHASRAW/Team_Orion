package Jwan.week7;

public class MinimumArray {

    public static void main(String[] args) {

        int[] array = {19, 10, 2, 22, 17, 15};

        int min = array[0];

        for (int each : array) {
            if(each < min){
                min = each;

            }

        }
        System.out.println(min);




    }


}
/*
Write a method that can find the minimum number from an int Array
 */