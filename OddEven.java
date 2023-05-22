public class OddEven {

    public static void Identify(int num){

        if (num % 2 == 0){
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");
        }
    }

    public static void main(String[] args) {


        Identify(5);

    }


}
