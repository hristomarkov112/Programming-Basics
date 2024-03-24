import java.util.Scanner;

public class _5_Vacation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String location = "0";
        String accomodationType = "0";
        double price = 0.0;


        switch (season) {
            case "Summer":
                if(budget <= 1000) {
                    location = "Alaska";
                    accomodationType = "Camp";
                    price = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000) {
                    location = "Alaska";
                    accomodationType = "Hut";
                    price = budget * 0.80;
                } else {
                    location = "Alaska";
                    accomodationType = "Hotel";
                    price = budget * 0.90;
                }
                break;
            case "Winter":
                if(budget <= 1000) {
                    location = "Morocco";
                    accomodationType = "Camp";
                    price = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000) {
                    location = "Morocco";
                    accomodationType = "Hut";
                    price = budget * 0.60;
                } else {
                    location = "Morocco";
                    accomodationType = "Hotel";
                    price = budget * 0.90;
                }
                break;

        }
        System.out.printf("%s - %s - %.2f",location, accomodationType, price);
    }
}
