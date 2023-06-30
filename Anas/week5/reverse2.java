package Anas.week5;

import java.util.Stack;

public class reverse2 {
    public static void main(String[] args) {
        String str = "ABCD";

        reverser2(str);
    }
    public static String reverser2(String str){
        String unique ="";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            Character ch =stack.pop();
            unique+=ch;
        }
        System.out.println(unique);
        return unique;
    }
}
