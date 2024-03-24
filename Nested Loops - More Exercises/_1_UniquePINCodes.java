import java.util.Scanner;

public class _1_UniquePINCodes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2 ; j++) {
                for (int k = 1; k <= n3; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
