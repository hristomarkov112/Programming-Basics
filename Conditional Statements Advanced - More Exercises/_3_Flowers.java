import java.util.Scanner;

public class _3_Flowers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int chrysCount = Integer.parseInt(sc.nextLine());
        int rosesCount = Integer.parseInt(sc.nextLine());
        int tulipsCount = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        String holiday = sc.nextLine();

        double total = 0;

        if(season.equals("Spring")) {
            if(tulipsCount > 7) {
                total = (chrysCount * 2.00 + rosesCount * 4.10 + tulipsCount * 2.50) * 0.95;
            } else {
                total = chrysCount * 2.00 + rosesCount * 4.10 + tulipsCount * 2.50;
            }
        } else if (season.equals("Summer")) {
            total = chrysCount * 2.00 + rosesCount * 4.10 + tulipsCount * 2.50;

        } else if (season.equals("Autumn")) {
            total = chrysCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15;

        } else if (season.equals("Winter")) {
            if (rosesCount >= 10) {
                total = (chrysCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15) * 0.90;
            } else {
                total = chrysCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15;
            }
        }

        if(holiday.equals("Y")) {
            total = total * 1.15;
        } else if (holiday.equals("N")) {
            total = total;
        }

        if(chrysCount + rosesCount + tulipsCount > 20) {
            total = total * 0.80 + 2;
        } else {
            total = total + 2;
        }

        System.out.printf("%.2f", total);















    }
}
