package Mai;

public class PrimeNumber {

    public static void Prime(int number){

        int notPrime = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                notPrime++;
            }
        }
        System.out.println(( notPrime >= 2) ?(number+ " not prime"): (number + " is prime"));
    }

    public static void main(String[] args) {

        Prime(6);
    }
}
