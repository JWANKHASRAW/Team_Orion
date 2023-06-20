package Jwan.week5;

public class Unique_Character {

    public static void main(String[] args) {


        unique("AABBCKKYLLDMMEZZO");


    }

    public static String unique(String str) {

        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    frequency++;
                }

            }
            if (frequency == 1) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
        return str;

    }



    }
