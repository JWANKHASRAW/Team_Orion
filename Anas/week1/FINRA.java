package Anas.week1;

public class FINRA {
    public static void Finra(){
        for (int i = 1; i <=30 ; i++) {
                System.out.println(
                        (i%3==0)? "FIN" :(i%5==0)?"RA":(i%3==0&&i%5==0)?"FINRA" : i
                );
        }
    }

    public static void main(String[] args) {
        Finra();
    }
}
