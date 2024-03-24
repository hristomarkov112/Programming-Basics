import java.util.Scanner;

public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double recordTime = Double.parseDouble(sc.nextLine());
        double distanceMetres = Double.parseDouble(sc.nextLine());
        double speedPerSecond = Double.parseDouble(sc.nextLine());

        double ivanTime = distanceMetres * speedPerSecond;
        double delayTime = Math.floor(distanceMetres/ 15) * 12.5;
        double totalTime = ivanTime + delayTime;
        double difference = Math.abs(recordTime - totalTime);

        if(totalTime < recordTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }


    }
}
