import java.sql.SQLOutput;
import java.util.Scanner;

public class _8_LunchBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int episodeTime = Integer.parseInt(sc.nextLine());
        int restTime = Integer.parseInt(sc.nextLine());

        double lunchTime = restTime / 8.0;
        double pauseTime = restTime / 4.0;

        double timeForWatching = restTime - lunchTime - pauseTime;
        double diff = Math.abs(timeForWatching - episodeTime);

        if(timeForWatching >= episodeTime) {
            System.out.printf("You have enough time to watch %s " + "and left with %.0f minutes free time.", name, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, " + "you need %.0f more minutes.", name, Math.ceil(diff));
        }
    }
}
