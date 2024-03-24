import java.util.Scanner;

public class _2_ReportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expectedAmount = Integer.parseInt(sc.nextLine());

        int collectedAmount = 0;
        int byCard = 0;
        int byCash = 0;
        int counterTransactions = 0;
        int counterCardTransactions = 0;
        int counterCashTransactions = 0;

        String command = sc.nextLine();
        while (!(expectedAmount < collectedAmount)) {
            if (command.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
                break;
            }

            int itemAmount = Integer.parseInt(command);
            counterTransactions++;

            //By card
            if(counterTransactions % 2 == 0) {
                if (itemAmount > 100) {
                    byCard += itemAmount;
                    counterCardTransactions++;

                    System.out.println("Product sold!");
                } else if (itemAmount < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    byCard += itemAmount;
                    counterCardTransactions++;

                    System.out.println("Product sold!");
                }

            //By cash
            } else {
                if (itemAmount > 100) {
                    System.out.println("Error in transaction!");
                } else if (itemAmount < 10) {
                    byCash += itemAmount;
                    counterCashTransactions++;

                    System.out.println("Product sold!");
                } else {
                    byCash += itemAmount;
                    counterCashTransactions++;

                    System.out.println("Product sold!");
                }
            }

            collectedAmount = byCard + byCash;

            if (expectedAmount <= collectedAmount) {
                break;
            }
            command = sc.nextLine();
        }

        double averageCash = 1.0 * byCash / counterCashTransactions;
        double averageCard = 1.0 * byCard / counterCardTransactions;

        if (expectedAmount <= collectedAmount) {
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        }


    }
}
