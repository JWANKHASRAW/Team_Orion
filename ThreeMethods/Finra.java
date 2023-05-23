package ThreeMethods;

public class Finra {

    public static void main(String[] args) {
        int a = 6;
        int b = 15;

        for (int i = 0; i < 30; i = i + 3) {
            if (i % 3 == 0) {
                System.out.println("FIN");
            }
            for (i = 1; i < 30; i++) {
                if (i % 5 == 0) {
                    System.out.println("RA");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FINRA");
                }
            }
        }
    }
}
