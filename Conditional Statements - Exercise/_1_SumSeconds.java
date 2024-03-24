import java.util.Scanner;

public class _1_SumSeconds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int timeFirst = Integer.parseInt(sc.nextLine());
        int timeSecond = Integer.parseInt(sc.nextLine());
        int timeThird = Integer.parseInt(sc.nextLine());

        int totalTimeMins = (timeFirst + timeSecond + timeThird) / 60;
        int totalTimeSeconds = (timeFirst + timeSecond + timeThird) % 60;

        if(totalTimeSeconds < 10) {
            System.out.printf("%d:0%d", totalTimeMins, totalTimeSeconds);
        } else {
            System.out.printf("%d:%d", totalTimeMins, totalTimeSeconds);
        }
    }
}
