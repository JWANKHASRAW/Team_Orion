package Week4;

public class String_frequency {
    public static void main(String[] args) {
        /*
        Write a return method that can find the frequency of characters
        Ex: FrequencyOfChars(AAABBCDD)==>A3B2C1D2
         */


        String frequencyOfChar = "AAAABBBBCCCDDD";
        String result = "";

        for (int i = 0; i < frequencyOfChar.length(); i++) {

            char ch = frequencyOfChar.charAt(i); //A
            int count = 0;
            for (int j = 0; j < frequencyOfChar.length(); j++) {
                if (frequencyOfChar.charAt(j) == ch) {
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            result += ch + "" + count;
        }
        System.out.println(result);
    }
    }

