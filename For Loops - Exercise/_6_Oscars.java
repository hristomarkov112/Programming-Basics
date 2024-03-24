import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String actorName = sc.nextLine();
        double startingPoints = Double.parseDouble(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        //start: 0
        //end: N
        //step: text.length / 2



        double totalPoints = 0;
        totalPoints = totalPoints + startingPoints;


        for(int i = 1; i <= n ; i++) {
            String name = sc.nextLine();
            double points = Double.parseDouble(sc.nextLine());
            totalPoints = totalPoints + (points * name.length()) / 2;

            if(totalPoints > 1250.5) {
                break;
            }
        }



        double diff = Math.abs(totalPoints - 1250.5);

        if(totalPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        }



    }
}
