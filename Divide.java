public class Divide {

public static int divide(int num1,int num2){

    int count=0;
    if (num1 > 0 && num2>0){
        while (num1>=num2){
            num1=num1-num2;
            count++;
        }
    }else {
        System.out.println("Numbers cannot be zero or negative");
    }

    System.out.println(count);
    return count;
}

    public static void main(String[] args) {

    divide(50,12);


    }


}
