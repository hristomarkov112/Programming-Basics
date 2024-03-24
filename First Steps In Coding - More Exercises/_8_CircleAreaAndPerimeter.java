import java.util.Scanner;

public class _8_CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f%n", perimeter);

    }
}
