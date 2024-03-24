import java.util.Scanner;

public class _6_FlowerShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countMagnolia = Integer.parseInt(sc.nextLine());
        int countZiumbiul = Integer.parseInt(sc.nextLine());
        int countRozi = Integer.parseInt(sc.nextLine());
        int countKaktus = Integer.parseInt(sc.nextLine());
        double price = Double.parseDouble(sc.nextLine());

        double total = countMagnolia * 3.25 + countZiumbiul * 4.00 + countRozi * 3.50 + countKaktus * 8.00;
        double tax = total * 0.05;
        double netProfit = total - tax;

        double difference = Math.abs(netProfit - price);



        if(netProfit >= price) {
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
        }


    }
}
