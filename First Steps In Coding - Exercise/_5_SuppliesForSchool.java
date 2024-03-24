package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _5_SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int prepPack = Integer.parseInt(scanner.nextLine());
        int promoPercentage = Integer.parseInt(scanner.nextLine());

        double pencilsPrice = pensCount * 5.80;
        double markersPrice = markersCount * 7.20;
        double prepPrice = prepPack * 1.20;
        double totalPrice = pencilsPrice + markersPrice + prepPrice;

        double totalDiscountedPrice = totalPrice - (totalPrice * promoPercentage) / 100;

        System.out.println(totalDiscountedPrice);
    }
}
