import java.util.Scanner;

public class _3_Logistics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countWeights = Integer.parseInt(sc.nextLine());

        double totalPrice = 0.0;
        int totalWeight = 0;
        int totalWeightBuses = 0;
        int totalWeightTrucks = 0;
        int totalWeightTrains = 0;

        //start: 1
        //end: N weight
        //step: +1
        for (int i = 1; i <= countWeights; i++) {
           int weight = Integer.parseInt(sc.nextLine());

           if(weight <= 3) {
               totalWeightBuses += weight;
           } else if (weight <= 11) {
               totalWeightTrucks += weight;
           } else {
               totalWeightTrains += weight;
           }

           totalPrice = totalWeightBuses * 200 + totalWeightTrucks * 175 + totalWeightTrains * 120;
           totalWeight = totalWeight + weight;

        }

        double averageWeightPrice = totalPrice / totalWeight;

        double percBuses = (double) totalWeightBuses / totalWeight * 100.0;
        double percTrucks = (double) totalWeightTrucks / totalWeight * 100.0;
        double percTrains = (double) totalWeightTrains / totalWeight * 100.0;

        System.out.printf("%.2f%n", averageWeightPrice);
        System.out.printf("%.2f%%%n", percBuses);
        System.out.printf("%.2f%%%n", percTrucks);
        System.out.printf("%.2f%%%n", percTrains);
    }
}
