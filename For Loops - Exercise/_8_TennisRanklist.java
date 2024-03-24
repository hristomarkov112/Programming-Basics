import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countTournaments = Integer.parseInt(sc.nextLine());
        int startingPoints = Integer.parseInt(sc.nextLine());

        //start: 1
        //end: N
        //step: +1

        int finalPoints = 0;
        int currentPoints = 0;
        int countWins = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String stage = sc.nextLine();

            switch(stage) {
                case "W":
                    currentPoints = 2000;
                    countWins = countWins + 1;
                    break;
                case "F":
                    currentPoints = 1200;
                    break;
                case "SF":
                    currentPoints = 720;
                    break;
            }
            finalPoints = finalPoints + currentPoints;
        }
        double averagePoints = finalPoints / countTournaments;
        finalPoints = finalPoints + startingPoints;
        double percWins = (double) countWins / countTournaments * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", (int)averagePoints);
        System.out.printf("%.2f%%%n", percWins);

    }
}
