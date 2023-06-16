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
        String dupLess ="";
        for (int i = 0; i < str.length(); i++) {
            if(!dupLess.contains(str.charAt(i)+"")){
                dupLess+=str.charAt(i);
            }
        }
        System.out.println(dupLess);


        /**Using Collections:*/

        Set<String> dupsRemover = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            dupsRemover.add(""+str.charAt(i));
        }
        String dupsRemoved = dupsRemover.toString().
                replace("[","").
                replace(",","").
                replace("]","").
                replace(" ","");

        System.out.println(dupsRemoved);

        input.close();
    }
}
