package SORINA;
public class RemoveDuplicates {

        public static void main(String[] args) {

            String str = "AAABBBCCC";

            String result = "";

            for (int i = 0; i < str.length(); i++) {

                char each =  str.charAt(i);

                if (!result.contains(""+each)){
                    result += each;
                }
            }
            System.out.println("result = " + result);
        }
    }
    /*
    3. Write a return method that can remove the duplicated values from a string.

				Ex: removeDup("AAABBBCCC") ==> ABC
     */

