import java.util.Scanner;

public class _7_FootballLeague {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int capacity = Integer.parseInt(sc.nextLine());
        int countFans = Integer.parseInt(sc.nextLine());

        int totalCountA = 0;
        int totalCountB = 0;
        int totalCountV = 0;
        int totalCountG = 0;


        //start: 1
        //end: countFans
        //step: 1
        for (int i = 1; i <= countFans; i++) {
            String sector = sc.nextLine();

            switch (sector) {
                case "A":
                    totalCountA += 1;
                    break;
                case "B":
                    totalCountB += 1;
                    break;
                case "V":
                    totalCountV += 1;
                    break;
                case "G":
                    totalCountG += 1;
                    break;
            }

        }

        int total = totalCountA + totalCountB + totalCountV + totalCountG;
        double percentageA = (double) totalCountA / total * 100.0;
        double percentageB = (double) totalCountB / total * 100.0;
        double percentageV = (double) totalCountV / total * 100.0;
        double percentageG = (double) totalCountG / total * 100.0;
        double percentageFans = (double) total / capacity * 100.0;

        System.out.printf("%.2f%%%n", percentageA);
        System.out.printf("%.2f%%%n", percentageB);
        System.out.printf("%.2f%%%n", percentageV);
        System.out.printf("%.2f%%%n", percentageG);
        System.out.printf("%.2f%%%n", percentageFans);


    }
}
