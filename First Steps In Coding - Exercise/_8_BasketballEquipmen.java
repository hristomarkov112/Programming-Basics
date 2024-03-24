package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _8_BasketballEquipmen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int annualFee = Integer.parseInt(sc.nextLine());

        double shoes = annualFee - annualFee * 0.40;
        double clothes = shoes - shoes * 0.20;
        double ball = clothes * 0.25;
        double accessories = ball * 0.20;

        double totalExpense = annualFee + shoes + clothes + ball + accessories;

        System.out.println(totalExpense);

    }

}
