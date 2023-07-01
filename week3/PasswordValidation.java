package week3;

public class PasswordValidation {
    public static boolean passwordValidation(String password) {

        if (password.length() < 6 || password.contains(" ")) {  // Check length and space
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char eachChar : password.toCharArray()) {
            if (Character.isUpperCase(eachChar)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(eachChar)) {
                hasLowercase = true;
            } else if (Character.isDigit(eachChar)) {
                hasDigit = true;
            } else {

                hasSpecialChar = true; //  If the char  does not meet any of these conditions, it means it is specialChar
            }
        }


        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("Ed$012"));
    }

}
