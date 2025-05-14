import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GeneratePassword {
    public static void main(String[] args) {
        int lenght = 0;
        Scanner sc = new Scanner(System.in);
        SchemeToGeneratePassword tempPassword = new SchemeToGeneratePassword();

        System.out.println("Enter Lenght of Password: ");
        lenght = sc.nextInt();
        System.out.println(tempPassword.geek_password(lenght));
    }
}