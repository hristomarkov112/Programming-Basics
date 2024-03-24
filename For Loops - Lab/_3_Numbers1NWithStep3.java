import java.util.Scanner;

public class _3_Numbers1NWithStep3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number; i +=3){
            System.out.println(i);
        }

    }
}
