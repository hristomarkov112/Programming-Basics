import java.util.Scanner;

public class _6_Bills {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int months = Integer.parseInt(sc.nextLine());

        //start: 1
        //end: month
        //step: 1

        double electricityPerMonth = 0.0;
        double waterPerMonth = 20.0;
        double internetPerMonth = 15.0;
        double othersPermMonth = 0.0;
        double average = 0.0;

        double electricity = 0.0;
        double water = 0.0;
        double internet = 0.0;
        double others = 0.0;


        for(int i = 1; i <= months; i++) {

            electricityPerMonth = Double.parseDouble(sc.nextLine());
            othersPermMonth = (electricityPerMonth + waterPerMonth + internetPerMonth) * 1.20;
            electricity += electricityPerMonth;
            water += waterPerMonth;
            internet += internetPerMonth;
            others += othersPermMonth;
        }

        average = (electricity + water + internet + others) / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv%n", average);

    }
    

}
