import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int goal = 10000;

        String command = sc.nextLine();
        while (!(command).equals("Going home")) {
            int currentSteps = Integer.parseInt(command);

            goal -= currentSteps;

            if (goal <= 0) {
                break;
            }

            command = sc.nextLine();
        }

        if ((command).equals("Going home")) {
            int stepsToHome = Integer.parseInt(sc.nextLine());
            goal -= stepsToHome;
        }

        if (goal >= 0) {
            System.out.printf("%d more steps to reach goal.", Math.abs(goal));
        } else {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", Math.abs(goal));
        }
    }
}
