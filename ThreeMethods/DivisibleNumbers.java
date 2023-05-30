package ThreeMethods;

import java.util.zip.ZipFile;

public class DivisibleNumbers {

    public static void main(String[] args) {

        System.out.print("Divisible by 15: ");
        for (int i = 0; i < 100; i++) {
            if (i % 3 ==0&& i % 5 ==0&& i % 15==0) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
        System.out.print("\nDivisible by 5: ");
        for (int i = 0; i < 100; i++) {
           if(i%5==0 &&i%15!=0){
               System.out.print(i+", ");
           }
        }
        System.out.println();
        System.out.print("\nDivisible by 3: ");
        for (int i = 0; i < 100; i++) {
            if(i%3==0 &&i%15!=0){
                System.out.print(i+", ");
            }
        }
    }
}