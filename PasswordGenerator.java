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
     * Method to generate a random password with a default 16-digit length
     * @return Password as a String
     */
    static String newPassword(){
        String password = "";
        for(int i=0; i<DEFAULT_LENGTH; i++){
            password += ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length()));
        }
        return password;
    }

    /**
     * Method to generate a random password with a user-specified length
     * @param length Length of password
     * @return Password as a String
     */
    static String newPassword(int length){
        String password = "";
        for(int i=0; i<length; i++){
            password += ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length()));
        }
        return password;
    }

}
