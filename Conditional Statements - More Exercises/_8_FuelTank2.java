import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _8_FuelTank2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fuelType = sc.nextLine();
        double fuelAmount = Double.parseDouble(sc.nextLine());
        String discountCard = sc.nextLine();

        double priceGasoline = 0;
        double priceDiesel = 0;
        double priceGas = 0;

        if (discountCard.equals("Yes")) {
            priceGasoline = 2.22 - 0.18;
            priceDiesel = 2.33 - 0.12;
            priceGas = 0.93 - 0.08;
        } else if (discountCard.equals("No")) {
            priceGasoline = 2.22;
            priceDiesel = 2.33;
            priceGas = 0.93;
        }

        double totalGasolineWithDiscount = priceGasoline * fuelAmount;
        double totalDieselWithDiscount = priceDiesel * fuelAmount;
        double totalGasWithDiscount = priceGas * fuelAmount;

        if (fuelType.equals("Gasoline")) {
            if (fuelAmount < 20) {
                System.out.printf("%.2f lv.", totalGasolineWithDiscount);
            } else if (fuelAmount <= 25) {
                System.out.printf("%.2f lv.", totalGasolineWithDiscount * 0.92);
            } else if (fuelAmount > 25) {
                System.out.printf("%.2f lv.", totalGasolineWithDiscount * 0.90);
            }

        } else if (fuelType.equals("Diesel")) {
            if (fuelAmount < 20) {
                System.out.printf("%.2f lv.", totalDieselWithDiscount);
            } else if (fuelAmount <= 25) {
                System.out.printf("%.2f lv.", totalDieselWithDiscount * 0.92);
            } else if (fuelAmount > 25) {
                System.out.printf("%.2f lv.", totalDieselWithDiscount * 0.90);
            }

        } else if (fuelType.equals("Gas")) {
            if (fuelAmount < 20) {
                System.out.printf("%.2f lv.", totalGasWithDiscount);
            } else if (fuelAmount <= 25) {
                System.out.printf("%.2f lv.", totalGasWithDiscount * 0.92);
            } else if (fuelAmount > 25) {
                System.out.printf("%.2f lv.", totalGasWithDiscount * 0.90);
            }

        }
    }
}
