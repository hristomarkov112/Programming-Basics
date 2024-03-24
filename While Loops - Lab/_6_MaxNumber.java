import java.util.Scanner;
import java.util.function.DoublePredicate;

public class _6_MaxNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //repeat
        //stop
        //continue

        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if(maxNumber < number) {
                maxNumber = number;
            }

            input = sc.nextLine();

        }

        System.out.println(maxNumber);

    }
}
