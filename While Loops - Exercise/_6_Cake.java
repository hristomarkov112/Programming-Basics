import java.util.Scanner;

public class _6_Cake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        int cake = length * width;
        boolean isCakeFinished = false;

        String command = sc.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);

            cake = cake - pieces;

            if (cake <= 0) {
                isCakeFinished = true;
                break;
            }
            command = sc.nextLine();
        }
        if (isCakeFinished) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
        } else {
            System.out.printf("%d pieces are left.", cake);
        }
    }
}
