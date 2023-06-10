package Mai;

public class frequencyOfCharacters {

    public static void letters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))) {

                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                result += "" + str.charAt(i) + count;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        letters("AAABBCDD");

    }
}
