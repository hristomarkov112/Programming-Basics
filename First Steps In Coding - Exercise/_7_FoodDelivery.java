package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _7_FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int vegCount = Integer.parseInt(scanner.nextLine());

        double chickenTotal = chickenCount * 10.35;
        double fishTotal = fishCount * 12.40;
        double vegTotal = vegCount * 8.15;
        double deliveryPrice = 2.50;

        double desertPrice = (chickenTotal + fishTotal + vegTotal) * 0.20;

        double totalPrice = chickenTotal + fishTotal + vegTotal + desertPrice+deliveryPrice;

        System.out.println(totalPrice);


    }

}
