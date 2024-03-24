import java.util.Scanner;

public class _1_MatchTickets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String category = sc.nextLine();
        int countPeople = Integer.parseInt(sc.nextLine());


        double ticketPrice = 0;
        double transportPrice = 0;
        double diff = 0;

        if (countPeople >= 1 && countPeople <= 4) {
            transportPrice = budget * 0.75;
        } else if (countPeople >= 5 && countPeople <= 9) {
            transportPrice = budget * 0.60;
        } else if (countPeople >= 10 && countPeople <= 24) {
            transportPrice = budget * 0.50;
        } else if (countPeople >= 25 && countPeople <= 49) {
            transportPrice = budget * 0.40;
        } else {
            transportPrice = budget * 0.25;
        }

        if(category.equals("VIP")) {
            ticketPrice = 499.99 * countPeople;
        } else if (category.equals("Normal")) {
            ticketPrice = 249.99 * countPeople;
        }

        double leftBudget = budget - transportPrice;

        diff = Math.abs(leftBudget - ticketPrice);

        if(leftBudget >= ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
