package ThreeMethods;


public class MethodWithoutOperator {

    public static int divide(int x, int y)
    {
        if (y == 0)
        {
            System.out.println("Error!! Divisible by 0");
            System.exit(-1);
        }

        int result = 1;
        if (x * y < 0) {
            result = -1;
        }
        int quotient = 0;

        while (x >= y) {
            x = x - y;
            quotient++;
        }

        System.out.println("The remainder is " + x);
        return result * quotient;
    }

    public static void main(String[] args)
    {
        int dividend = 20;
        int divisor = 10;

        System.out.println("The quotient is " + divide(dividend, divisor));
    }
}



