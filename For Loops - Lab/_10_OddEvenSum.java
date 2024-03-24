import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sumEvens = 0;
        int sumOdds = 0;

        for (int i = 1; i <= n; i++) {
                int currentNumber = Integer.parseInt(sc.nextLine());
                if(i % 2 == 0) {
                    sumEvens += currentNumber;
                } else {
                    sumOdds += currentNumber;
            }

        }

        int diff = Math.abs(sumOdds - sumEvens);

        if(sumOdds == sumEvens) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumOdds);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}
