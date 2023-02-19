/**
 * Example driver program for PasswordGenerator.java
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("\nRandom password 1:  " + PasswordGenerator.newPassword());
        System.out.println("Random password 2:  " + PasswordGenerator.newPassword());
        System.out.println("Random password 3:  " + PasswordGenerator.newPassword());

        System.out.println("\nPassword of length 8:   " + PasswordGenerator.newPassword(10));
        System.out.println("Password of length 12:  " + PasswordGenerator.newPassword(20));
        System.out.println("Password of length 32:  " + PasswordGenerator.newPassword(30));

    }
}
