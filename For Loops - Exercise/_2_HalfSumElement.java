import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        //start: 1
        //end: N
        //step: 1

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        int sumWithoutMaxNumber = 0;

        for (int index = 1; index <= n; index++) {
            int number = Integer.parseInt(sc.nextLine());
            sum = sum + number;

            if (number > maxNumber) {
                maxNumber = number;
            }
            sumWithoutMaxNumber = sum - maxNumber;


            }

            int diff = Math.abs(sumWithoutMaxNumber - maxNumber);
        if (sumWithoutMaxNumber == maxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + (sum - maxNumber));
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }


    }
}
