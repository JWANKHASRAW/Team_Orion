package Mai;

public class FINRA {
    public static void main(String[] args) {
        for(int i =1; i <= 30; i++){

            if (i%3 == 0){
                System.out.println("Fin");
            } else if (i%5 == 0) {
                System.out.println("Ra");
            } else if (i%3 == 0 || i%5 ==0) {
                System.out.println("Finra");
            }else {
                System.out.println(i);
            }
        }
    }


}
