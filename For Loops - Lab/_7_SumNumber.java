import java.time.chrono.MinguoEra;
import java.util.Scanner;

public class _7_SumNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int countNumbers = Integer.parseInt(sc.nextLine());

        //начало: 1
        //край: n
        //инкремент: +1

        int sum = 0;

        for(int i = 1; i <= countNumbers; i++) {

            int number = Integer.parseInt(sc.nextLine());
            sum += number;
        }
        System.out.println(sum);


    }
}
