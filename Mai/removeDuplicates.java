package Mai;

public class removeDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String duplicate = "";

        for (int i = 0; i < str.length(); i++) {
            if (!duplicate.contains("" + str.charAt(i))){
                duplicate += str.charAt(i);
            }
        }
        System.out.println(duplicate);
    }
}
