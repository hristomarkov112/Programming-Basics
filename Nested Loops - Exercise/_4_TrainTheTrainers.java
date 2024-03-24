import java.util.Scanner;

public class _4_TrainTheTrainers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());


        double totalSumGrades = 0;
        int countPresentations = 0;


        String presentation = sc.nextLine();
        while (!presentation.equals("Finish")) {

            double sumGrades = 0;
            for (int i = 1; i <= n; i++) {
                countPresentations++;
                double currentGrade = Double.parseDouble(sc.nextLine());
                sumGrades += currentGrade;
            }
            totalSumGrades += sumGrades;

            System.out.printf("%s - %.2f.%n", presentation, sumGrades / n);

            presentation = sc.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalSumGrades / countPresentations);

    }
}
