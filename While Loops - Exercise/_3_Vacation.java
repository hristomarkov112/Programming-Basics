import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double neededMoney = Double.parseDouble(sc.nextLine());
        double ownedMoney = Double.parseDouble(sc.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        //repeat
        //stop
        //continue

        while (ownedMoney < neededMoney && spendingCounter < 5) {
            String command = sc.nextLine();
            double money = Double.parseDouble(sc.nextLine());

                daysCounter++;

            if ("save".equals(command)) {
                ownedMoney += money;
                spendingCounter = 0;
            }

            if ("spend".equals(command)) {
                ownedMoney -= money;
                spendingCounter++;
                if(ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }

        if (spendingCounter >= 5) {
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d", daysCounter);
        }

        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

    }
}
