import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String town = sc.nextLine();
        double volume = Double.parseDouble(sc.nextLine());
        double commission = 0;

        switch (town) {
            case "Sofia":
                if (volume >= 0 && volume <= 500) {
                    commission = 0.05;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 500 && volume <= 1000) {
                    commission = 0.07;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 1000 && volume <= 10000) {
                    commission = 0.08;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 10000) {
                    commission = 0.12;
                    System.out.printf("%.2f", commission * volume);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (volume >= 0 && volume <= 500) {
                    commission = 0.045;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 500 && volume <= 1000) {
                    commission = 0.075;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 1000 && volume <= 10000) {
                    commission = 0.10;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 10000) {
                    commission = 0.13;
                    System.out.printf("%.2f", commission * volume);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (volume >= 0 && volume <= 500) {
                    commission = 0.055;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 500 && volume <= 1000) {
                    commission = 0.08;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 1000 && volume <= 10000) {
                    commission = 0.12;
                    System.out.printf("%.2f", commission * volume);
                } else if (volume > 10000) {
                    commission = 0.145;
                    System.out.printf("%.2f", commission * volume);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
