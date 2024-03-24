import java.util.Scanner;

public class _5_Travelling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("End")) {
            double neededMoney = Double.parseDouble(sc.nextLine());

            double savedMoney = Double.parseDouble(sc.nextLine());
            while (savedMoney < neededMoney) {
                double addMoney = Double.parseDouble(sc.nextLine());
                savedMoney += addMoney;
            }
            System.out.println("Going to " + input + "!");

            input = sc.nextLine();
        }


    }
}
