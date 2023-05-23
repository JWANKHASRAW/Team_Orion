package Jwan;

public class Division {

    public static void main(String[] args) {

        division(8,4);
    }

    public static void division(double dividend, double divisor){


        double result=0;
        if(divisor ==0){
            throw new ArithmeticException("Divisor can't be zero");
        }

        for (int i = 0; i <= dividend; i++) {
            if (dividend >= divisor){
                dividend= dividend - divisor;
                result++;
            }

        }
        System.out.println(result);


    }


}
