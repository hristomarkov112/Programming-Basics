import java.util.Scanner;

public class _5_Pets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countDays = Integer.parseInt(sc.nextLine());
        int kgGivenFood = Integer.parseInt(sc.nextLine());
        double dogfFodPerDayKG = Double.parseDouble(sc.nextLine());
        double catFoodPerdayKG = Double.parseDouble(sc.nextLine());
        double turtleFoodPerDayGR = Double.parseDouble(sc.nextLine());

        double totalDogFood = countDays * dogfFodPerDayKG;
        double totalCatfood = countDays * catFoodPerdayKG;
        double totalTurtleFood = countDays * turtleFoodPerDayGR * 0.001;

        double totalFood = totalDogFood + totalCatfood + totalTurtleFood;

        double difference = Math.abs(kgGivenFood - totalFood);

        if(kgGivenFood <= totalFood) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(difference));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(difference));
        }



    }
}
