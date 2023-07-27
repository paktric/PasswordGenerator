import java.security.SecureRandom;

public class PasswordGenerator {
    // Define alphabet that password will be composed of
    private static final String U_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String L_CASE_LETTERS = U_CASE_LETTERS.toLowerCase();
    private static final String NUMBERS        = "0123456789";
    private static final String SPECIAL_CHARS  = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
    private static final String ALPHABET = U_CASE_LETTERS + L_CASE_LETTERS + NUMBERS + SPECIAL_CHARS;

    private static final int DEFAULT_LENGTH  = 16;
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * Private method to generate a random password of given length
     * @param length Length of password
     * @return Password as a String
     */
    private static String generate(int length){
        StringBuilder password = new StringBuilder(length);
        for(int i=0; i<length; i++){
            password.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return password.toString();
    }

    /////////////////////////////////////////////////////////////////////////////

    /**
     * Public method to generate a random password with a default 16-digit length
     * @return Password as a String
     */
    public static String newPassword(){
        return generate(DEFAULT_LENGTH);
    }

    /**
     * Public method to generate a random password with a user-specified length
     * @param length Length of password
     * @return Password as a String
     */
    public static String newPassword(int length){
        return generate(length);
    }

}
