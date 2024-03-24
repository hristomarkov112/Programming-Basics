import java.util.Scanner;

public class _3_StreamOfLetters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder c = new StringBuilder(sc.nextLine());
        StringBuilder o = new StringBuilder(sc.nextLine());
        StringBuilder n = new StringBuilder(sc.nextLine());
        String message = "";
        boolean isGuessed = false;

        String command = sc.nextLine();
        while (!command.equals("End")) {
            String letter = command;

            if (letter.equals("c")) {
                c.append(letter);
            } else if (letter.equals("o")) {
                o.append(letter);
            } else if (letter.equals("n")) {
                n.append(letter);
            } else {
                message = message.concat(letter);
            }

            if(c.toString().equals("cc") && o.toString().equals("oo") && n.toString().equals("nn")) {
                isGuessed = true;
                break;
            }

            command = sc.nextLine();
        }


            System.out.println(message);

    }
}
