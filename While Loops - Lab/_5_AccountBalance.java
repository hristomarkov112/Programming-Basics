import java.util.Scanner;

public class _5_AccountBalance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String payment = sc.nextLine();


        //repeat:
        //stop:
        //continue:
        double sum = 0;

        while (!payment.equals("NoMoreMoney")) {
            double money = Double.parseDouble(payment);

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", money);
            sum += money;

            payment = sc.nextLine();

        }
        System.out.printf("Total: %.2f", sum);

    }
}
