import java.util.Scanner;

public class _5_AverageNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(sc.nextLine());
            totalSum += numbers;
        }

        double average = 1.0 * totalSum / n;
        System.out.printf("%.2f", average);
    }

}
