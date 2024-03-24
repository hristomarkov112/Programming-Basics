import java.util.Scanner;

public class _4_SumOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());

        int count = 0;
        boolean isThereMagicNumber = false;
        int fNumber = 0;
        int sNumber = 0;


        for (int firstNumber = start; firstNumber <= end; firstNumber++) {
            for (int secondNumber = start; secondNumber <= end; secondNumber++) {

                count++;

                if(firstNumber + secondNumber == magicNumber) {
                    isThereMagicNumber = true;
                    fNumber = firstNumber;
                    sNumber = secondNumber;
                    break;
                }
            }
            if (isThereMagicNumber) {
                break;
            }
        }
        if (isThereMagicNumber) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, fNumber, sNumber, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }



    }
}
