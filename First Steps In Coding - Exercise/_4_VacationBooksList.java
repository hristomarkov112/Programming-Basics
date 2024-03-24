package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _4_VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int hoursCount = pagesCount / pagesPerHour / daysCount;

        System.out.println(hoursCount);
    }
}
