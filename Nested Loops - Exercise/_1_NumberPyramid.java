import java.util.Scanner;

public class _1_NumberPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int current = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n ; rows++) {

            for (int columns = 1; columns <= rows; columns++) {
                if (current > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;

            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
