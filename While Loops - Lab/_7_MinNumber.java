import java.util.Scanner;

public class _7_MinNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //repeat:
        //stop:
        //continue:

        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < minNumber) {
                minNumber = number;
            }

            input = sc.nextLine();
        }
        System.out.println(minNumber);

    }
}
