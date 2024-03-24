import java.util.Scanner;

public class _1_Dishwasher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countBottles = Integer.parseInt(sc.nextLine());

        int totalDetergent = countBottles * 750;
        int counter = 0;
        int totalWashedDishes = 0;
        int totalWashedPots = 0;
        boolean isDone = false;

        String command = sc.nextLine();
        while (!command.equals("End")) {
            int countDishesOrPots = Integer.parseInt(command);
            counter++;

            if (counter % 3 == 0) {
                totalDetergent -= countDishesOrPots * 15;
                totalWashedPots += countDishesOrPots;
            } else {
                totalDetergent -= countDishesOrPots * 5;
                totalWashedDishes += countDishesOrPots;
            }

            if (totalDetergent < 0) {
                isDone = true;
                break;
            }
            command = sc.nextLine();
        }

        if (isDone) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalDetergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", totalWashedDishes, totalWashedPots);
            System.out.printf("Leftover detergent %d ml.", totalDetergent);
        }
    }
}
