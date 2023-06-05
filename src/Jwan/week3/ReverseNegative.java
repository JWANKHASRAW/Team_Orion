package Jwan.week3;

public class ReverseNegative {


    public static void main(String[] args) {


        System.out.println(reverseNegative(-523));
    }



    public static int reverseNegative(int positive ){

        if(positive <0){
            positive= positive * -1;
        }

        int reverse = 0;
        while (positive != 0) { //523
            reverse = reverse * 10 + positive % 10; // A:(0*10 + 523%10 = 3--> 0+3 reverse=3) B:(3*10 + 52%10-->2 30+2=32) C:(32*10 + 5-->325
            positive = positive / 10; // A:(523/10 --> 52), B:(52%10 -->2), C:( 5/10 -->0)
        }

        return reverse;
    }
}

/*


   List<Integer> num1 = new ArrayList<>();
        num1.add(-523);
        for (int i = 0; i < num1.size(); i++) {
            int positive = num1.get(i) * -1;
            System.out.println(positive);

            int reverse = 0;
            while (positive != 0) { //523
                reverse = reverse * 10 + positive % 10; // A:(0*10 + 523%10 = 3--> 0+3 reverse=3) B:(3*10 + 52%10-->2 30+2=32) C:(32*10 + 5-->325
                positive = positive / 10; // A:(523/10 --> 52), B:(52%10 -->2), C:( 5/10 -->0)
            }
            System.out.println(reverse);


        }



 */