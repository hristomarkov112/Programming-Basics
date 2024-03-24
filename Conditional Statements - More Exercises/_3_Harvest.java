import java.util.Scanner;

public class _3_Harvest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int squareMetres = Integer.parseInt(sc.nextLine());
        double grapePerMetre = Double.parseDouble(sc.nextLine());
        double necessaryLiters = Double.parseDouble(sc.nextLine());
        int countWorkers = Integer.parseInt(sc.nextLine());

        double totalGrape = squareMetres * grapePerMetre;
        double rekolta = totalGrape * 0.40 / 2.50;

        double difference = Math.abs(rekolta - necessaryLiters);
        double literPerWorker = difference / countWorkers;

        if (rekolta < necessaryLiters) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(difference));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(rekolta));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(difference), Math.ceil(literPerWorker));
        }

    }
}
