package Jwan;

public class Finra {
    public static void main(String[] args) {

        fin(5);
    }



    public static int fin(int num1){

        for (int i = 1; i <=30; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FINRA");
            }else if(i%3==0){
                System.out.println("FIN");
            }else if(i%5==0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }

        }




        return num1;
    }




}
