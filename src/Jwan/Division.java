package Jwan;

public class Division {

    public static void main(String[] args) {

        division(10,5);
    }

    public static void division(int dividend, int divisor){

        int result=0;
        if(divisor ==0){
            throw new ArithmeticException("Divisor can't be zero");
        }
        for (int i = 0; i <= dividend; i++) {
            if (divisor*i == dividend){
                result+=i;
            }
        }
        System.out.println(result);


    }


}
