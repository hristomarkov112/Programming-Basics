import java.util.Scanner;

public class _2_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysPeriod = Integer.parseInt(scanner.nextLine());

        int doctor = 7;

        int treated = 0;
        int untreated = 7;

        int pacient = 0;


        for (int day = 1; day <= daysPeriod; day++) {
            pacient = Integer.parseInt(scanner.nextLine());

            if (day % 3 == 0 && untreated > treated) {
                doctor = doctor + 1;
            }

            if (untreated > treated) {
                treated = treated + pacient;
            } else {
                treated = treated + doctor;
                untreated = untreated + pacient - doctor;
            }
        }

        System.out.println("Treated patients: " + treated);
        System.out.println("Untreated patients: " + untreated);


    }
}
