import java.util.Scanner;

public class _4_Sequence2kplus1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        //repeat: 2k + 1
        //stop: n
        //continue: print
        int n = 1;

        while (!(n > number)) {
            System.out.println(n);
            n = n * 2 + 1;

        }


    }
}
