package ThreeMethods;

public class SwapValues {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        a = a + b; //30
        b = a - b; //30-10 =20
        a = a - b; //30-20=10
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
