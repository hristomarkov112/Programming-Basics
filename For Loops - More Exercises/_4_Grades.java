import java.util.Scanner;

public class _4_Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countStudents = Integer.parseInt(sc.nextLine());

        //start: 1
        //end: countStudents
        //step: +1

        int totalFails = 0;
        int totalThree = 0;
        int totalFour = 0;
        int totalFive = 0;

        double totalScore = 0;

        for (int i = 1; i <= countStudents; i++) {
            double score = Double.parseDouble(sc.nextLine());

            if(score >= 2.00 && score <= 2.99) {
                totalFails += 1;
            } else if (score >= 3.00 && score <= 3.99) {
                totalThree += 1;
            } else if (score >= 4.00 && score <= 4.99) {
                totalFour += 1;
            } else if (score >= 5.00 && score <= 6.00) {
                totalFive += 1;
            }
            totalScore += score;
        }

        double averageScore = totalScore / countStudents;
        double percTotalFails = (double) totalFails / countStudents * 100.0;
        double percTotalThree = (double) totalThree / countStudents * 100.0;
        double percTotalFour = (double) totalFour / countStudents * 100.0;
        double percTotalFive = (double) totalFive / countStudents * 100.0;

        System.out.printf("Top students: %.2f%%%n", percTotalFive);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percTotalFour);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percTotalThree);
        System.out.printf("Fail: %.2f%%%n", percTotalFails);
        System.out.printf("Average: %.2f%n", averageScore);

    }
}
