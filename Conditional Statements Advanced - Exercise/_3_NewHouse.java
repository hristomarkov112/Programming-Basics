import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String typeFlowers = sc.nextLine();
        int countFlowers = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double totalCost = 0.0;

        switch (typeFlowers) {
            case "Roses":
                totalCost = countFlowers * 5.00;
                if(countFlowers > 80) {
                    totalCost = totalCost * 0.90;
                }
                break;
            case "Dahlias":
                totalCost = countFlowers * 3.80;
                if(countFlowers > 90) {
                    totalCost = totalCost * 0.85;
                }
                break;
            case "Tulips":
                totalCost = countFlowers * 2.80;
                if(countFlowers > 80) {
                    totalCost = totalCost * 0.85;
                }
                break;
            case "Narcissus":
                totalCost = countFlowers * 3.00;
                if(countFlowers < 120) {
                    totalCost = totalCost * 1.15;
                }
                break;
            case "Gladiolus":
                totalCost = countFlowers * 2.50;
                if(countFlowers < 80) {
                    totalCost = totalCost * 1.20;
                }
                break;
        }

        double diff = Math.abs(totalCost - budget);

        if (totalCost <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlowers, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }

    }
}
