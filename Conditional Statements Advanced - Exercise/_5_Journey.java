import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String destination = "0";
        double totalCost = 0.00;
        String place = "0";

        if(budget <= 100) {
            destination = "Bulgaria";
            if(season.equals("summer")) {
                totalCost = budget * 0.30;
                place = "Camp";
            } else if (season.equals("winter")) {
                totalCost = budget * 0.70;
                place = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if(season.equals("summer")) {
                totalCost = budget * 0.40;
                place = "Camp";
            } else if (season.equals("winter")) {
                totalCost = budget * 0.80;
                place = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            totalCost = budget * 0.90;
            place = "Hotel";
        }

        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", place, totalCost);

    }
}
