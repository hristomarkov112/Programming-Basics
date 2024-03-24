import java.util.Scanner;

public class _3_SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;


        String command = sc.nextLine();
        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);
            int dividersCount = 0;

            if (num < 0) {
                System.out.println("Number is negative.");
                command = sc.nextLine();
                continue;
            }

            for (int i = 1; i < num; i++) {
                if(num % i == 0) {
                    dividersCount++;
                }
            }

            if (dividersCount > 2) {
                sumNonPrimeNumbers += num;
            } else {
                sumPrimeNumbers += num;
            }

            command = sc.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);

    }


}
