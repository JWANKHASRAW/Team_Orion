package week1;

public class FINRA {


    public static void FINRA() {

        for (int i = 0; i < 30; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;

            if (by3 && by5) {
                System.out.println(i+" FINRA");
            } else if (by3) {
                System.out.println(i+" FIN");
            } else if (by5) {
                System.out.println(i+" RA");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {


        FINRA();

    }
}







