import java.util.Scanner;

public class _2_SleepyTomCat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countDaysOff = Integer.parseInt(sc.nextLine());

        int countDaysWorkMins = (365 - countDaysOff) * 63;
        int countDaysOffMins = countDaysOff * 127;

        int totalMinsperYear = countDaysWorkMins + countDaysOffMins;

        int difference = Math.abs(30000 - totalMinsperYear);

        int convertingTohours = difference / 60;
        int minsLeft = difference % 60;

        if(totalMinsperYear >= 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", convertingTohours, minsLeft);
            System.out.println();
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", convertingTohours, minsLeft);
        }







    }
}
