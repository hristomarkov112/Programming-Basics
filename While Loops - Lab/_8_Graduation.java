import java.util.Scanner;

public class _8_Graduation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //repeat
        //stop
        //continue

        int counter = 1;
        int excluded = 0;
        double sum = 0;
        boolean isGraduated = true;


        while (counter <= 12) {
            double grade = Double.parseDouble(sc.nextLine());

            if (grade < 4) {
                excluded++;
                if (excluded == 2) {
                    isGraduated = false;
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }
                continue;
            }
            sum += grade;
            counter++;

        }

        if (isGraduated == true) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }
    }
}
