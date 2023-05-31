package Mai;

public class SwapNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("First number: "+ num1);
        System.out.println("Second number: "+ num2);



    }
}
