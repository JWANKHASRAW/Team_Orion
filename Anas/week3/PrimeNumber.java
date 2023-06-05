package Anas.week3;

public class PrimeNumber {
    //write a method that can check if a number is prime or not

    public static void Prim(int number) {
        int notPrime=0;
        for (int i = 1; i < number; i++) {//i=0 give exception
            if(number%i==0){
                notPrime++;//marker
            }
        }
        System.out.println(
                (notPrime>=2)? (number + " not prime"):(number+" is prime")
                //1: divisible by 1             2: divisible by itself
        );
    }

    public static void main(String[] args) {

            Prim(89);

    }
}

