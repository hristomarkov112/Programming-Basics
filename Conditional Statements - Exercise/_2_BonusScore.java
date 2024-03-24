import java.util.Scanner;

public class _2_BonusScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int points = Integer.parseInt(sc.nextLine());
        double bonusPoints = 0;

        if(points <= 100) {
            bonusPoints = 5;
            if (points % 2 == 0) {
                bonusPoints = bonusPoints + 1;
            } else if (points % 10 == 5) {
                bonusPoints = bonusPoints + 2;
            }
        } else if(points < 1000) {
            bonusPoints = points * 0.20;
            if (points % 2 == 0) {
                bonusPoints = bonusPoints + 1;
            } else if (points % 10 == 5) {
                bonusPoints = bonusPoints + 2;
            }
        } else if(points > 1000) {
            bonusPoints = points * 0.10;
            if (points % 2 == 0) {
                bonusPoints = bonusPoints + 1;
            } else if (points % 10 == 5) {
                bonusPoints = bonusPoints + 2;
            }
        }

        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}
