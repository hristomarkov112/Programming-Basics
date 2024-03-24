import javax.swing.*;
import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countOfGroups = Integer.parseInt(sc.nextLine());

        double totalPeopleCount = 0;
        double countMusala = 0;
        double countMontBlanc = 0;
        double countKilimangaro = 0;
        double countK2 = 0;
        double countEverest = 0;

        //start: 1
        //end: N
        //step: +1;
        for (int i = 1; i <= countOfGroups; i++) {
            int countPeople = Integer.parseInt(sc.nextLine());

            if(countPeople <= 5) {
                countMusala = countMusala + countPeople;
                totalPeopleCount = totalPeopleCount + countPeople;

            } else if (countPeople > 5 && countPeople <= 12) {
                countMontBlanc = countMontBlanc + countPeople;
                totalPeopleCount = totalPeopleCount + countPeople;

            } else if (countPeople > 12 && countPeople <= 25) {
                countKilimangaro = countKilimangaro + countPeople;
                totalPeopleCount = totalPeopleCount + countPeople;

            } else if (countPeople > 25 && countPeople <= 40) {
                countK2 = countK2 + countPeople;
                totalPeopleCount = totalPeopleCount + countPeople;

            } else if (countPeople > 40) {
                countEverest = countEverest + countPeople;
                totalPeopleCount = totalPeopleCount + countPeople;
            }

        }
        double percMusala = countMusala / totalPeopleCount * 100.0;
        double percMontBlanc = countMontBlanc / totalPeopleCount * 100.0;
        double percKilimangaro = countKilimangaro / totalPeopleCount * 100.0;
        double percK2 = countK2 / totalPeopleCount * 100.0;
        double percEverest = countEverest / totalPeopleCount * 100.0;

        System.out.printf("%.2f%%%n", percMusala);
        System.out.printf("%.2f%%%n", percMontBlanc);
        System.out.printf("%.2f%%%n", percKilimangaro);
        System.out.printf("%.2f%%%n", percK2);
        System.out.printf("%.2f%%%n", percEverest);

    }
}
