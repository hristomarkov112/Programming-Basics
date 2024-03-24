import java.util.Scanner;

public class _8_OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int startHour = Integer.parseInt(sc.nextLine());
        int startMin = Integer.parseInt(sc.nextLine());
        int arriveHour = Integer.parseInt(sc.nextLine());
        int arriveMin = Integer.parseInt(sc.nextLine());

        int arrivalTime = arriveHour * 60 + arriveMin;
        int startTime = startHour * 60 + startMin;

        int diff = Math.abs(arrivalTime - startTime);

        if(arrivalTime > startTime) {
            System.out.println("Late");
            if(diff >= 60) {
                int hour = diff / 60;
                int mins = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, mins);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (arrivalTime == startTime || diff <= 30){
            System.out.println("On Time");
            if(diff >= 1 && diff <= 30) {
                 System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if(diff >= 60) {
                int hour = diff / 60;
                int mins = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, mins);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }

        }





    }
}
