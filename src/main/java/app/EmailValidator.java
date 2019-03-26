package app;

import java.util.regex.Pattern;


public class EmailValidator {
    private static final String EMAIL_FORMAT = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]+";

    /**
     * @param email
     * @return true/false if email is correct
     */
    public static boolean isValid(String email) {
        return Pattern.matches(EMAIL_FORMAT, email);
    }
}
