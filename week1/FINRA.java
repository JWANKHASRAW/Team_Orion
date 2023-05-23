package week1;

public class FINRA {


    public static void FINRA() {

        for (int i = 0; i < 30; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;
            if (by3 && by5) {
                System.out.println("FINRA");
            } else if (by3) {
                System.out.println("FIN");
            } else if (by5) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {


        FINRA();

    }
}







