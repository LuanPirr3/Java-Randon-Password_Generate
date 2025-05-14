import java.util.Random;

public class SchemeToGeneratePassword {
    private String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String small_chars = "abcdefghijklmnopqrstuvwxyz";
    private String numbers = "0123456789";
    private String symbols = "!@#$%^&*_=+-/.?<>)";
    private String temp_passowrd = capital_chars + small_chars + numbers + symbols;
    Random rand = new Random();

    public char[] geek_password(int len){
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {
            password[i] = temp_passowrd.charAt(rand.nextInt(temp_passowrd.length()));
        }
        System.out.println("Generating password using random()");
        System.out.print("Your new password is: ");
        return password;
    }
}
