package week2;

public class ConsecutiveNums {
    public static void main(String[] args) {


        int num = 24;
        String by2 = "Codility", by3 = "Test", by5 = "Coders";

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(by2 + by3 + by5);
            } else if(i % 2 == 0 && i % 3 == 0 ){
                System.out.println(by2 + by3);
            } else if (i % 5 == 0) {
                System.out.println(by5);
            } else if (i % 3 == 0 ) {
                System.out.println(by3);
            }else if (i % 2 == 0 ){
                System.out.println(by2);
            }else {
                System.out.println(i);
            }
        }


    }
}
