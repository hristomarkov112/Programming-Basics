import java.util.Scanner;

public class _2_NumbersN1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        //начало: N
        //край: 1
        //инкремент: -1

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

    }

}
