package Anas.week3;

public class ReverseNegativeNumber3 {

    //Write a return method that can reveres negative number and return it as int

    public static int Reverser(int num){
        String result ="";
        if(num%10==0){
            num=num-1;
            System.out.println("first digit looks like one but it's a zero, trust me");

        }
        String number = Integer.toString(num);
        number=number.replace("-","");

        for (int i = number.length()-1; i >= 0; i--) {
            result+= number.charAt(i);
        }

        num= Integer.parseInt(result);
        System.out.println(num);
        return (num);
    }

    public static void main(String[] args) {
        Reverser(-9990); //0008
    }
}
