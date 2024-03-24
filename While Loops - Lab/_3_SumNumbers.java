import java.util.Scanner;

public class _3_SumNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = Integer.parseInt(sc.nextLine());

        // repeat: input
        // stop: 100
        // continue: print

        int sum = 0;

        while (sum < limit) {
            int currentSum = Integer.parseInt(sc.nextLine());
            sum = sum + currentSum;
        }
        System.out.println(sum);

    }
}
