import java.util.Objects;
import java.util.Scanner;

public class _10_WeatherForecastPart2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double gradus = Double.parseDouble(sc.nextLine());

        if (gradus <= 11.9 && gradus >= 5) {
            System.out.println("Cold");
        } else if (gradus >= 12 && gradus <= 14.9) {
            System.out.println("Cool");
        } else if (gradus >= 15 && gradus <= 20) {
            System.out.println("Mild");
        } else if (gradus >= 20.1 && gradus <= 25.9) {
            System.out.println("Warm");
        } else if (gradus >= 26 && gradus <= 35) {
            System.out.println("Hotd");
        } else {
            System.out.println("unknown");
        }
    }
}
