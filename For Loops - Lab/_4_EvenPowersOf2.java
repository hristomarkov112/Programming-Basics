import java.util.Scanner;

public class _4_EvenPowersOf2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());


        for (int step = 0; step <= number; step++) {
            if(step % 2 == 0) {
                System.out.println(Math.pow(2, step));
            }
        }

    }

}
