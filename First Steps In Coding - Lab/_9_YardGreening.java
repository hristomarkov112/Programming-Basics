package FirstStepsInCodingLab;

import java.util.Scanner;

public class _9_YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double squareMetres = Double.parseDouble(scanner.nextLine());

        double price = squareMetres * 7.61 - squareMetres * 7.61 * 0.18;
        double discount = squareMetres * 7.61 * 0.18;

        System.out.println("The final price is: " + price + " lv.");
        System.out.println("The discount is: " + discount + " lv.");




    }
}
