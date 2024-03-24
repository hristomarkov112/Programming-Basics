import java.util.Scanner;

public class _6_Fishland {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(sc.nextLine());
        double tzatzaPrice = Double.parseDouble(sc.nextLine());
        double palamudKG = Double.parseDouble(sc.nextLine());
        double safridKG = Double.parseDouble(sc.nextLine());
        int shellsKG = Integer.parseInt(sc.nextLine());

        double palamudTotal = palamudKG * (mackerelPrice + mackerelPrice * 0.6);

        double safridTotal = safridKG * (tzatzaPrice + tzatzaPrice * 0.80);

        double shellsTotal = shellsKG * 7.50;

        double total = palamudTotal + safridTotal + shellsTotal;

        System.out.printf("%.2f", total);

    }
}
