package week3;

public class FrequencyOfCharacters {
    public static String FrequencyOfChars(String str) {

        String result = "";
        int minLength = 0;
        while (minLength < str.length()) { // --> The given String must have at least 1 character
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(minLength)) { // --> if the given string has 1 character for to start iteration
                    count++;
                    result += str.charAt(minLength) + "" + count; //  A+2 --> result= A2+B2+C3+D3+F3
                    str = str.replace("" + str.charAt(minLength), ""); // The characters we add to the result are also removed from the given string.
                    // BBCCDDFF --> CCDDFF -->DDFF --> FF

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {


        System.out.println(FrequencyOfChars("AABBCCDDDFFF"));
    }

}
