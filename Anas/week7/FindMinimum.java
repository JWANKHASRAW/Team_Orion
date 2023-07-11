package Anas.week7;

public class FindMinimum {

    public static void main(String[] args) {
        int [] numbers = {-100,1,89,54,78,9,55,1,2};
        System.out.println(
                min(numbers)
        );
    }

    public static int min (int [] numbers){
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if(number<min){
                min=number;
            }
        }
        return min;
    }
}
