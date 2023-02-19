import java.security.SecureRandom;

public class PasswordGenerator {
    // Define alphabet that password will be composed of
    private static final String uCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lCaseLetters = uCaseLetters.toLowerCase();
    private static final String numbers      = "0123456789";
    private static final String specialChars = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
    private static final String alphabet = uCaseLetters + lCaseLetters + numbers + specialChars;

    // Mutable variables
    private static int passwordLength  = 16;
    private static String password = "";
    private static SecureRandom random = new SecureRandom();

    /**
     * Method to generate a random password with a default 16-digit length
     * @return Password as a String
     */
    static String newPassword(){
        password = "";
        for(int i=0; i<passwordLength; i++){
            password += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return password;
    }

    /**
     * Method to generate a random password with a user-specified length
     * @param n Length of password
     * @return Password as a String
     */
    static String newPassword(int n){
        passwordLength = n;
        password = "";
        for(int i=0; i<passwordLength; i++){
            password += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return password;
    }
    
}
