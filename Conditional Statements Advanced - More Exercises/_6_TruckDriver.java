import java.util.Scanner;

public class _6_TruckDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String season = sc.nextLine();
        double kmPerMonth = Double.parseDouble(sc.nextLine());

        double total = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if(kmPerMonth <= 5000) {
                    total = 0.75 * kmPerMonth * 4;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    total = 0.95  * kmPerMonth  * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                    total = 1.45  * kmPerMonth  * 4;
                }
                break;
            case "Summer":
                if(kmPerMonth <= 5000) {
                    total = 0.90  * kmPerMonth  * 4;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    total = 1.10  * kmPerMonth  * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                    total = 1.45  * kmPerMonth  * 4;
                }
                break;

            case "Winter":
                if(kmPerMonth <= 5000) {
                    total = 1.05  * kmPerMonth  * 4;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    total = 1.25  * kmPerMonth  * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                    total = 1.45  * kmPerMonth  * 4;
                }
                break;
        }
        total = total - total * 0.10;

        System.out.printf("%.2f", total);

    }
}
