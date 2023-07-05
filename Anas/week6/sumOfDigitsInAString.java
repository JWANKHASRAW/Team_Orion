package Anas.week6;

public class sumOfDigitsInAString {
    public static void main(String[] args) {
        String nums = "1he1llo1";
        System.out.println(
                sums(nums)
        );
    }

    public static int sums(String nums){
        nums = nums.replace(" ","");
        int sum =0;
        for (int i = 0; i < nums.length(); i++) {
            if(nums.charAt(i) <48 || nums.charAt(i)>57){
                continue;
            }else {
                sum+= Integer.parseInt(nums.charAt(i)+"");
            }

        }
        return sum;
    }
}
