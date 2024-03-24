import java.util.Scanner;

public class _4_CarToGo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String carClass = "0";
        String carType = "0";
        double carPrice = 0;

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    carClass = "Economy class";
                    carType = "Cabrio";
                    carPrice = budget * 0.35;
                } else if (budget > 100 && budget <= 500) {
                    carClass = "Compact class";
                    carType = "Cabrio";
                    carPrice = budget * 0.45;
                } else if (budget > 500) {
                    carClass = "Luxury class";
                    carType = "Jeep";
                    carPrice = budget * 0.90;
                }
                break;

            case "Winter":
                if (budget <= 100) {
                    carClass = "Economy class";
                    carType = "Jeep";
                    carPrice = budget * 0.65;
                } else if (budget > 100 && budget <= 500) {
                    carClass = "Compact class";
                    carType = "Jeep";
                    carPrice = budget * 0.80;
                } else if (budget > 500) {
                    carClass = "Luxury class";
                    carType = "Jeep";
                    carPrice = budget * 0.90;
                }
                break;

        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
