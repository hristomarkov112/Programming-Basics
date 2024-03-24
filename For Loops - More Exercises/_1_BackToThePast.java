import java.util.Scanner;

public class _1_BackToThePast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(sc.nextLine());
        int year = Integer.parseInt(sc.nextLine());

        int ageIvancho = 18;
        int currentYear = 1800;
        double totalCost = 0;
        double yearCost = 0;

        //start: 1800
        //end: year
        //step: +1
        for(int i = 1800; i <= year; i++) {
            if(currentYear % 2 == 0) {
                yearCost = 12000;
            } else {
                yearCost = 12000 + 50 * ageIvancho;
            }
            totalCost = totalCost + yearCost;
            currentYear = currentYear + 1;
            ageIvancho = ageIvancho + 1;
        }
        double diff = Math.abs(totalCost-inheritedMoney);

        if (totalCost <= inheritedMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }

    }
}
