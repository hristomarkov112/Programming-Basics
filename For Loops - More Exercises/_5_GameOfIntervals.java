import java.util.Scanner;

public class _5_GameOfIntervals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfTurns = Integer.parseInt(sc.nextLine());

        //Start: 1
        //End: numberOfSteps
        //Steps: +1

        double totalScore = 0;
        int totalInvalid = 0;
        int total0to9 = 0;
        int total10to19 = 0;
        int total20to29 = 0;
        int total30to39 = 0;
        int total40to50 = 0;

        for (int i = 1; i <= numberOfTurns; i++) {
            int number = Integer.parseInt(sc.nextLine());

            if (number < 0) {
                totalScore = totalScore / 2;
                totalInvalid += 1;
            } else if (number > 50) {
                totalScore = totalScore / 2;
                totalInvalid += 1;
            } else if (number >= 0 && number <= 9) {
                totalScore = totalScore + number * 0.20;
                total0to9 += 1;
            }else if (number >= 10 && number <= 19) {
                totalScore = totalScore +  number * 0.30;
                total10to19 += 1;
            }else if (number >= 20 && number <= 29) {
                totalScore = totalScore +  number * 0.40;
                total20to29 += 1;
            }else if (number >= 30 && number <= 39) {
                totalScore = totalScore + 50;
                total30to39 += 1;
            }else if (number >= 40 && number <= 50) {
                totalScore = totalScore + 100;
                total40to50 += 1;
            }

        }

        int totalcount = totalInvalid + total0to9 + total10to19 + total20to29 + total30to39 + total40to50;
        double from0to9 = (double) total0to9 / totalcount * 100.0;
        double from10to19 = (double) total10to19 / totalcount * 100.0;
        double from20to29 = (double) total20to29 / totalcount * 100.0;
        double from30to39 = (double) total30to39 / totalcount * 100.0;
        double from40to50 = (double) total40to50 / totalcount * 100.0;
        double invalidNumber = (double) totalInvalid / totalcount * 100.0;

        System.out.printf("%.2f%n", totalScore);
        System.out.printf("From 0 to 9: %.2f%%%n", from0to9);
        System.out.printf("From 10 to 19: %.2f%%%n", from10to19);
        System.out.printf("From 20 to 29: %.2f%%%n", from20to29);
        System.out.printf("From 30 to 39: %.2f%%%n", from30to39);
        System.out.printf("From 40 to 50: %.2f%%%n", from40to50);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumber);
    }
}
