package ThreeMethods;

public class Codility_Test_Coders {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Codility");
            }
            if (i % 3 == 0) {
                System.out.println("Test");
            }
            if (i % 5 == 0) {
                System.out.println("Coders");
            }

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            }
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else {
                System.out.println(i);
            }

        }

        System.out.println("------------------");

        for (int i = 0; i < 50; i++) {
            boolean by2 = i % 2 == 0;
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;

            if(by2){
                System.out.println("Codility");
            }else if(by3){
                System.out.println("Test");
            }else if(by5){
                System.out.println("Coders");
            }else if(by2&&by3){
                System.out.println("Codility"+"Test");
            }else if(by3&&by5){
                System.out.println("Test"+"Coders");
            }else if(by2&&by5) {
                System.out.println("Codility" + "Coders");
            }else{
                System.out.println(i);
            }
        }
    }
}
