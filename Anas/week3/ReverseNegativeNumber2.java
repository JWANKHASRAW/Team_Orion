package Anas.week3;

public class ReverseNegativeNumber2 {
    public static int Reverser3(int num){

        if(num<0){
            num=-num;
        }else {
            num=num;
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        Reverser3(-80000000);
    }
}
