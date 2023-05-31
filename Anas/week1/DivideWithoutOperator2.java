package Anas.week1;

public class DivideWithoutOperator2 {
    public static void divider(int dividend,int divisor){
       int iterations=0;
       int division=dividend-divisor;
        for (int i = division; divisor>0; i++) {
            division = dividend-divisor;
            iterations++;
        }
        System.out.println(iterations);
    }

    public static void main(String[] args) {
        divider(10,5);
    }
    //NOT solved yet
}
