package SORINA;
public class FrequencyOfCharacters {

        public static void main(String[] args) {

            String str = "AAABBCDD";
            char ch = 'C';

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch){

                    count++;
                }
            }
            System.out.println(count);
        }
    }

    /*
    write a return method that can find the frequency of a character:
        	Ex: FrequencyofChars = ("AAABBCDD") ==> A3B2C1D2
     */
