import java.util.Scanner;


public class _4_CleverLily {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countYearsLilly = Integer.parseInt(sc.nextLine());
        double priceWashMachine = Double.parseDouble(sc.nextLine());
        int pricePerToy = Integer.parseInt(sc.nextLine());

        //start: 1
        //end: N
        //step: +10

        int toysCount = 0;
        int savedMoney = 0;
        int birthdayMoney = 10;

        for (int age = 1; age <= countYearsLilly; age++) {
            if(age % 2 == 0) {
                savedMoney = savedMoney + birthdayMoney;
                birthdayMoney = birthdayMoney + 10;

                savedMoney = savedMoney - 1;
            } else {
                toysCount = toysCount + 1;
            }
        }

        int soldToysMoney = pricePerToy * toysCount;
        savedMoney = savedMoney + soldToysMoney;

        double diff = Math.abs(savedMoney - priceWashMachine);

        if(savedMoney >= priceWashMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
