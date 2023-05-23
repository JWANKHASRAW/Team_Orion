package Anas;

public class FINRA {
    public static void finra(){
        for (int i = 1; i <=30 ; i++) {
            if(i%3==0){
                System.out.println("FIN");
            }
            if(i%5==0){
                System.out.println("RA");
            }
            if(i%3==0&&i%5==0){
                System.out.println("FINRA");
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        finra();
    }
}
