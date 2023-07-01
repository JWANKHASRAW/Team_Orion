package week3;

public class SumOfDigits {
    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isDigit(eachChar)) {
                int digit = eachChar - '0'; // to convert to numeric(Like getting char from a given String variable)
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("erden-123"));
    }

}
