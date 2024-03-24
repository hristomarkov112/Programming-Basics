import java.util.Objects;
import java.util.Scanner;

public class _9_WeatherForecast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String weather = sc.nextLine();

        if (Objects.equals(weather, "sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }

    }

}
