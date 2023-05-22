public class erden_AllthreeMethods {
    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is a even number");

        } else {
            System.out.println(number + " is a Odd number");
        }

    }


    public static int divideTwoNumbers(int dividend, int divisor){

        if (divisor==0){
            throw new ArithmeticException(dividend + " cannot divide by zero");
        }
        int sign = ((dividend < 0) || (divisor < 0)) ? -1 : 1;
        int quotient = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            quotient++;

        }
        if (divisor > dividend){
            System.err.println("Divisor cannot be more than the dividend.");
        }

        return sign*quotient;
    }


    public static void printNumbersFINRa(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }

    }



}