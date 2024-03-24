import java.util.Scanner;

public class _1_ReadText {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //repeat: !Stop
        //stop: "Stop"
        //continue:
        while (!input.equals("Stop")) {
            System.out.println(input);
            input = sc.nextLine();
        }
    }






}
