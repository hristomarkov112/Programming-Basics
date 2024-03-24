import java.util.Scanner;

public class _4_TransportPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distance = Integer.parseInt(sc.nextLine());
        String dayOrNight = sc.nextLine();

        double costDayTaxi = distance * 0.79 + 0.70;
        double costNightTaxi = distance * 0.90 + 0.70;
        double costBus = distance * 0.09;
        double costTrain = distance * 0.06;


        if (distance < 20) {
            if(dayOrNight.equals("day")) {
                System.out.printf("%.2f", costDayTaxi);
            } else {
                System.out.printf("%.2f", costNightTaxi);
            }
        } else if (distance < 100) {
            System.out.printf("%.2f", costBus);
        } else {
            System.out.printf("%.2f", costTrain);
        }
    }
}