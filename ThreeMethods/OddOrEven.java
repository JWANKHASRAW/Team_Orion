package ThreeMethods;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 6;
        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;

        System.out.println(number + " is even number: " + isEven);
        System.out.println(number + " is odd number: " + isOdd);
    }
}

