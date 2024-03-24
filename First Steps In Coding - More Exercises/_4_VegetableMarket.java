import java.util.Scanner;

public class _4_VegetableMarket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double vegePrice = Double.parseDouble(sc.nextLine());
        double fruitsPrice = Double.parseDouble(sc.nextLine());
        int vegeWeight = Integer.parseInt(sc.nextLine());
        int fruitsWeight = Integer.parseInt(sc.nextLine());

        double totalIncome = (vegePrice * vegeWeight + fruitsPrice * fruitsWeight) / 1.94;

        System.out.printf("%.2f", totalIncome);

    }

}
