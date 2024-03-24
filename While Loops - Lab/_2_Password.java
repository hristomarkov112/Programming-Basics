import java.util.Scanner;

public class _2_Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String pass = sc.nextLine();

        String input = sc.nextLine();

        while (!input.equals(pass)) {
            input = sc.nextLine();

        }
        System.out.println("Welcome " + username + "!");

    }
}
