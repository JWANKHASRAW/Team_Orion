package Anas.week1;

public class DivideWithoutOperator {
    public static void divider(int dividend,int divisor){
        int result=0;
        if(dividend-divisor>0){
            while (dividend>=divisor){
                dividend=dividend-divisor;
                result++;
            }
            System.out.println(result);
        }else {
            System.err.println("Number cannot be negative");
        }

    }

    public static void main(String[] args) {
        divider(20,3);
    }
    //NOT solved yet
}
