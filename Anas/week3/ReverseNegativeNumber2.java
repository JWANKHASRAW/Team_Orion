package Anas.week3;

public class ReverseNegativeNumber2 {
    public static int Reverser2(int num){
        int numRev = Math.abs(num);
        System.out.println(numRev);
        return numRev;
    }

    public static void main(String[] args) {
        Reverser2(-80000000);
    }
}
