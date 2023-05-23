package Anas;

public class NumberOddAndEven {

    public static void identify (int number){
        System.out.println(number%2==0 ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        identify(6);
    }

}
