import java.util.Scanner;

public class _2_BikeRace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countJrBikers = Integer.parseInt(sc.nextLine());
        int countSrBikers = Integer.parseInt(sc.nextLine());
        String traceType = sc.nextLine();

        double totalJrs = 0.00;
        double totalSrs = 0.00;

        switch (traceType) {
            case "trail":
                totalJrs = countJrBikers * 5.50;
                totalSrs = countSrBikers * 7.00;
                break;
            case "cross-country":
                if(countSrBikers + countJrBikers >= 50) {
                    totalJrs = countJrBikers * 8.00 * 0.75;
                    totalSrs = countSrBikers * 9.50 * 0.75;
                } else {
                    totalJrs = countJrBikers * 8.00;
                    totalSrs = countSrBikers * 9.50;
                }
                break;
            case "downhill":
                totalJrs = countJrBikers * 12.25;
                totalSrs = countSrBikers * 13.75;
                break;
            case "road":
                totalJrs = countJrBikers * 20.00;
                totalSrs = countSrBikers * 21.50;
                break;
        }

        double totalFee = (totalJrs + totalSrs) * 0.95;

        System.out.printf("%.2f", totalFee);
    }
}
