import java.util.Scanner;

public class _7_FuelTank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fuelType = sc.nextLine();
        int litersInTank = Integer.parseInt(sc.nextLine());

        if (fuelType.equals("Diesel")) {
            if(litersInTank < 25) {
                System.out.println("Fill your tank with diesel!");
            } else {
                System.out.println("You have enough diesel.");
            }

        } else if (fuelType.equals("Gasoline")) {
            if(litersInTank < 25) {
                System.out.println("Fill your tank with gasoline!");
            } else {
                System.out.println("You have enough gasoline.");
            }

        } else if (fuelType.equals("Gas")) {
            if(litersInTank < 25) {
                System.out.println("Fill your tank with gas!");
            } else {
                System.out.println("You have enough gas.");
            }

        } else {
            System.out.println("Invalid fuel!");
        }


    }
}
