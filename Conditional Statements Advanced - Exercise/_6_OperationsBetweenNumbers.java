import java.util.Scanner;

public class _6_OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        char symbol = sc.nextLine().charAt(0);

        double result = 0.00;
        String oddEven = "0";

        switch (symbol) {
            case '+':
                result = n1 + n2;
                if(result % 2 == 0) {
                    oddEven = "even";


                } else {
                    oddEven = "odd";
                }
                System.out.printf("%d %c %d = %.0f - %s", n1,symbol, n2, result, oddEven);
                break;
            case '-':
                result = n1 - n2;
                if(result % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%d %c %d = %.0f - %s", n1,symbol, n2, result, oddEven);
                break;
            case '*':
                result = n1 * n2;
                if(result % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%d %c %d = %.0f - %s", n1,symbol, n2, result, oddEven);
                break;

            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = (1.0 * n1) / n2;
                    System.out.printf("%d %c %d = %.2f", n1, symbol, n2, result);
                }
                break;
            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %c %d = %.0f", n1, symbol, n2, result);
                }
                break;
        }









    }
}
