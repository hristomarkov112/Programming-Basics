import java.util.Scanner;

public class _3_Combinations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int countValidCombinations = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i + j + k == n) {
                        countValidCombinations++;
                    }
                }
            }

        }
        System.out.println(countValidCombinations);
    }
}
