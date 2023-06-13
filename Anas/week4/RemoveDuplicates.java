package Anas.week4;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        String -- Remove Duplicates
//        Write a return method that can remove the duplicated values from
//                String
//        Ex: removeDup("AAABBBCCC") ==> ABC

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();

        /**Using String:*/
//        String dubLess ="";
//        for (int i = 0; i < str.length(); i++) {
//            if(!dubLess.contains(str.charAt(i)+"")){
//                dubLess+=str.charAt(i);
//            }
//        }
//        System.out.println(dubLess);


        /**Using Collections:*/

        Set<String> dubsRemover = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            dubsRemover.add(""+str.charAt(i));
        }
        String dubsRemoved = dubsRemover.toString().
                replace("[","").
                replace(",","").
                replace("]","").replace(" ","");

        System.out.println(dubsRemoved);

        input.close();
    }
}
