import java.util.Scanner;

public class _4_PasswordGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        String correctPass = "s3cr3t!P@ssw0rd";

        if(pass.equals(correctPass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
