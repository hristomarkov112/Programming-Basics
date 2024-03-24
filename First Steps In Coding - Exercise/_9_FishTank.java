package FirstStepsInCodingExercise;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cmLength = Integer.parseInt(sc.nextLine());
        int cmWidth = Integer.parseInt(sc.nextLine());
        int cmHeight = Integer.parseInt(sc.nextLine());
        double Percentage = Double.parseDouble(sc.nextLine());
        double occupiedSpace = Percentage / 100;

        double aquariumVolume = cmLength * cmWidth * cmHeight;
        double volumeinlitres = aquariumVolume / 1000;
        double litresNeeded = volumeinlitres * (1 - occupiedSpace);

        System.out.println(litresNeeded);


    }
}
