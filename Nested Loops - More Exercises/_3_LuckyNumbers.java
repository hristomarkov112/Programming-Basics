import java.util.Scanner;

public class _3_LuckyNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                for (int k = 1; k < number; k++) {
                    for (int l = 1; l < number; l++) {
                        if (number % (i + j) == 0 && number % (k + l) == 0) {
                            System.out.print("" + i + j + k + l + " ");
                        }
                    }
                }
            }
        }


    }
}
