import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double tripPrice = Double.parseDouble(sc.nextLine());
        int countPuzzles = Integer.parseInt(sc.nextLine());
        int countDolls = Integer.parseInt(sc.nextLine());
        int countBears = Integer.parseInt(sc.nextLine());
        int countMinions = Integer.parseInt(sc.nextLine());
        int countTrucks = Integer.parseInt(sc.nextLine());

        int totalCountToys = countPuzzles + countDolls + countBears + countMinions + countTrucks;
        double total = countPuzzles * 2.6 + countDolls * 3.0 + countBears * 4.10 + countMinions * 8.2 + countTrucks * 2.0;

        if(totalCountToys >= 50) {
            total = total - total * 0.25;

        } else {

        }
        double loan = total * 0.10;
        double income = total - loan;

        double diff = Math.abs(income - tripPrice);

        if(income >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
