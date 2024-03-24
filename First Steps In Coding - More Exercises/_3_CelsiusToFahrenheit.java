import java.text.ParseException;
import java.util.Scanner;

public class _3_CelsiusToFahrenheit {

    public static void main(String[] args) {

        //(0°C × 9/5) + 32 = 32°F

        Scanner sc = new Scanner(System.in);
        double celsius = Double.parseDouble(sc.nextLine());

        double farenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f", farenheit);

    }
}
