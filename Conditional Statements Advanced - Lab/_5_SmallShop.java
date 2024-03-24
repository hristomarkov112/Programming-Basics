import java.util.Scanner;

public class _5_SmallShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String town = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double price = 0;

        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = 0.50;
                    System.out.println(price * quantity);
                    break;
                case "water":
                    price = 0.80;
                    System.out.println(price * quantity);
                    break;
                case "beer":
                    price = 1.20;
                    System.out.println(price * quantity);
                    break;
                case "sweets":
                    price = 1.45;
                    System.out.println(price * quantity);
                    break;
                case "peanuts":
                    price = 1.60;
                    System.out.println(price * quantity);
                    break;
            }
        } else if (town.equals("Plovdiv")) {
                        switch (product) {
                            case "coffee":
                                price = 0.40;
                                System.out.println(price * quantity);
                                break;
                            case "water":
                                price = 0.70;
                                System.out.println(price * quantity);
                                break;
                            case "beer":
                                price = 1.15;
                                System.out.println(price * quantity);
                                break;
                            case "sweets":
                                price = 1.30;
                                System.out.println(price * quantity);
                                break;
                            case "peanuts":
                                price = 1.50;
                                System.out.println(price * quantity);
                                break;
                        }
        } else if (town.equals("Varna")) {
                                switch (product) {
                                    case "coffee":
                                        price = 0.45;
                                        System.out.println(price * quantity);
                                        break;
                                    case "water":
                                        price = 0.70;
                                        System.out.println(price * quantity);
                                        break;
                                    case "beer":
                                        price = 1.10;
                                        System.out.println(price * quantity);
                                        break;
                                    case "sweets":
                                        price = 1.35;
                                        System.out.println(price * quantity);
                                        break;
                                    case "peanuts":
                                        price = 1.55;
                                        System.out.println(price * quantity);
                                        break;
                                }

        }

    }
}
