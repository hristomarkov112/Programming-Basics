import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budgetPetar = Double.parseDouble(sc.nextLine());
        int countVideoCards = Integer.parseInt(sc.nextLine());
        int countProcessors = Integer.parseInt(sc.nextLine());
        int countMemory = Integer.parseInt(sc.nextLine());

        double priceVideoCards = countVideoCards * 250;
        double priceProcessors = countProcessors * priceVideoCards * 0.35;
        double priceMemory = countMemory * priceVideoCards * 0.10;

        double totalCost = priceVideoCards + priceProcessors + priceMemory;

        if (countVideoCards > countProcessors) {
            totalCost = totalCost - totalCost * 0.15;
        } else {

        }

        double difference = Math.abs(budgetPetar - totalCost);

        if(budgetPetar >= totalCost) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
