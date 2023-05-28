package Jwan;

public class Divisible {
    public static void main(String[] args) {

        System.out.println("Divisible by 15 ");
        for (int i = 1; i <=100 ; i++) {
            if(i%3 ==0 && i%5==0 && i%15==0){
                System.out.print(i + ", ");
            }

        }
        System.out.println();
        System.out.println("\nDivisible by 5 ");
        for (int i = 1; i <=100 ; i++) {
            if(i%5==0 && i%15!=0){
                System.out.print(i + ", ");
            }

        }
        System.out.println();
        System.out.println("\nDivisible by 3 ");
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0 && i%15!=0){
                System.out.print(i + ", ");
            }

        }





    }
}
