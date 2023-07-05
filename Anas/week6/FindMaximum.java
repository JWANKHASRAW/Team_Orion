package Anas.week6;

public class FindMaximum {
    public static void main(String[] args) {
        int [] numbers = {-55,1,89,54,78,9,55,1,2};
        System.out.println(
                max(numbers)
        );
    }

    public static int max(int [] numbers){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
}
