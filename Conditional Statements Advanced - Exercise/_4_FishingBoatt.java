import java.util.Scanner;

public class _4_FishingBoatt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int countFishmen = Integer.parseInt(sc.nextLine());

        double cost = 0;

        if(season.equals("Spring")) {
            cost = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            cost = 4200;
        } else if (season.equals("Winter")) {
            cost = 2600;
        }

        if(countFishmen <= 6) {
            cost = cost * 0.90;
        } else if (countFishmen > 6 && countFishmen <= 11) {
            cost = cost * 0.85;
        } else if (countFishmen > 11) {
            cost = cost * 0.75;
        }

        if(countFishmen % 2 == 0 && !season.equals("Autumn")) {
            cost = cost * 0.95;
        }

        double diff = Math.abs(cost - budget);

        if(cost <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
