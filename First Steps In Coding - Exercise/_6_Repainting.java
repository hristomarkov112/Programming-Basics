package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _6_Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonCost = (nylon + 2) * 1.50;
        double paintCost = (paint * 14.50) + (paint * 14.50) * 0.10;
        double thinnerCost = thinner * 5.00;
        double bags = 0.40;

        double totalMaterialCost = nylonCost + paintCost + thinnerCost + bags;
        double laborCost = hours * totalMaterialCost * 0.30;

        double grandTotal = totalMaterialCost + laborCost;

        System.out.println(grandTotal);

    }
}
