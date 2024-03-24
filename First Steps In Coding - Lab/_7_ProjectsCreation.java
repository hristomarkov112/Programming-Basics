package FirstStepsInCodingLab;

import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int count = Integer.parseInt(scanner.nextLine());
        int hours = count * 3;

        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + count + " project/s.");
        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
    }
}
