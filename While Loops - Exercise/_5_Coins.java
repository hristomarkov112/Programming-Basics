import java.util.Scanner;

public class _5_Coins {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double amount = Double.parseDouble(scan.nextLine());

        double amountInCoins = amount * 100;
        int counterCoins = 0;

        while (!(amountInCoins == 0)) {
            if (amountInCoins >= 200) {
                amountInCoins -= 200;
                counterCoins++;
            } else if (amountInCoins >= 100) {
                amountInCoins -= 100;
                counterCoins++;
            } else if (amountInCoins >= 50) {
                amountInCoins -= 50;
                counterCoins++;
            } else if (amountInCoins >= 20) {
                amountInCoins -= 20;
                counterCoins++;
            } else if (amountInCoins >= 10) {
                amountInCoins -= 10;
                counterCoins++;
            } else if (amountInCoins >= 5) {
                amountInCoins -= 5;
                counterCoins++;
            } else if (amountInCoins >= 2) {
                amountInCoins -= 2;
                counterCoins++;
            } else if (amountInCoins >= 1) {
                amountInCoins -= 1;
                counterCoins++;
            } else {
                amountInCoins = 0;
            }
        }
        System.out.println(counterCoins);
    }
}
