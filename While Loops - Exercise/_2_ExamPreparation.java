

import java.util.Scanner;

public class _2_ExamPreparation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int badScoreThreshold = Integer.parseInt(sc.nextLine());

        int counterBadScore = 0;
        int counterExercisesDone = 0;
        double totalScore = 0;
        String lastProblem = "0";
        boolean isFailed = true;

        //Repeat
        //Stop
        //Continue
        while (counterBadScore < badScoreThreshold) {
            String problemName = sc.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int score = Integer.parseInt(sc.nextLine());
            if (score <= 4) {
                counterBadScore++;
            }
            totalScore += score;
            counterExercisesDone++;
            lastProblem = problemName;
        }

        if(isFailed) {
            System.out.printf("You need a break, %d poor grades.", counterBadScore);
        } else {
            System.out.printf("Average score: %.2f%n", (totalScore / counterExercisesDone));
            System.out.printf("Number of problems: %d%n", counterExercisesDone);
            System.out.printf("Last problem: %s", lastProblem);
        }




    }
}
