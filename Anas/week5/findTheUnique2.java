package Anas.week5;

public class findTheUnique2 {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(
                UniqueFinder(str)
        );
    }

    public static String UniqueFinder(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            /**resets right after each iteration of big spoon loop */
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    /**19 counts the reoccurrence of character in given string*/
                    counter++;
                }
            }
            if (counter == 1) {
                /**if this condition is met the character is unique*/
                unique += str.charAt(i);
            }
        }
        return unique;
    }
}
