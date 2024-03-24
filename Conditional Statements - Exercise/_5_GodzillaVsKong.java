import java.util.Scanner;

public class _5_GodzillaVsKong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budgetMovie = Double.parseDouble(sc.nextLine());
        int countStatists = Integer.parseInt(sc.nextLine());
        double priceClothing = Double.parseDouble(sc.nextLine());

        double decorPrice = budgetMovie * 0.10;
        double totalExpense = countStatists * priceClothing + decorPrice;

        if(countStatists > 150) {
            totalExpense = countStatists * priceClothing - countStatists * priceClothing * 0.10 + decorPrice;
        } else {

        }

        double difference = Math.abs(budgetMovie - totalExpense);

        if(budgetMovie >= totalExpense) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }



    }
}
