package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());

        double increase = Double.parseDouble(scanner.nextLine());
        double totalIncrease = increase / 100;

        double totalAmount = depositAmount + period * ((depositAmount * totalIncrease) / 12);

        System.out.println(totalAmount);
    }
}
