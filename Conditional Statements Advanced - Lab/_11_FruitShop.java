import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String weekDay = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double price = 0;

        switch (fruit) {
            case"banana":
                switch (weekDay) {
                    case "Monday":
                        price = 2.50;
                    case "Tuesday":
                        price = 2.50;
                    case "Wednesday":
                        price = 2.50;
                    case "Thursday":
                        price = 2.50;
                    case "Friday":
                        price = 2.50;
                        System.out.printf("%.2f",(price * quantity));
                        break;
                    case "Saturday":
                        price = 2.70;
                    case "Sunday":
                        price = 2.70;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "apple":
                switch (weekDay) {
                    case "Monday":
                        price = 1.20;
                    case "Tuesday":
                        price = 1.20;
                    case "Wednesday":
                        price = 1.20;
                    case "Thursday":
                        price = 1.20;
                    case "Friday":
                        price = 1.20;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    case "Saturday":
                        price = 1.25;
                    case "Sunday":
                        price = 1.25;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "orange":
                switch (weekDay) {
                    case "Monday":
                        price = 0.85;
                    case "Tuesday":
                        price = 0.85;
                    case "Wednesday":
                        price = 0.85;
                    case "Thursday":
                        price = 0.85;
                    case "Friday":
                        price = 0.85;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    case "Saturday":
                        price = 0.90;
                    case "Sunday":
                        price = 0.90;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapefruit":
                switch (weekDay) {
                    case "Monday":
                        price = 1.45;
                    case "Tuesday":
                        price = 1.45;
                    case "Wednesday":
                        price = 1.45;
                    case "Thursday":
                        price = 1.45;
                    case "Friday":
                        price = 1.45;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    case "Saturday":
                        price = 1.60;
                    case "Sunday":
                        price = 1.60;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "kiwi":
                switch (weekDay) {
                    case "Monday":
                        price = 2.70;
                    case "Tuesday":
                        price = 2.70;
                    case "Wednesday":
                        price = 2.70;
                    case "Thursday":
                        price = 2.70;
                    case "Friday":
                        price = 2.70;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    case "Saturday":
                        price = 3.00;
                    case "Sunday":
                        price = 3.00;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            case "pineapple":
                switch (weekDay) {
                    case "Monday":
                        price = 5.50;
                    case "Tuesday":
                        price = 5.50;
                    case "Wednesday":
                        price = 5.50;
                    case "Thursday":
                        price = 5.50;
                    case "Friday":
                        price = 5.50;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    case "Saturday":
                        price = 5.60;
                    case "Sunday":
                        price = 5.60;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            case "grapes":
                switch (weekDay) {
                    case "Monday":
                        price = 3.85;
                    case "Tuesday":
                        price = 3.85;
                    case "Wednesday":
                        price = 3.85;
                    case "Thursday":
                        price = 3.85;
                    case "Friday":
                        price = 3.85;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    case "Saturday":
                        price = 4.20;
                    case "Sunday":
                        price = 4.20;
                        System.out.printf("%.2f", (price * quantity));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
                break;


            default:
                System.out.println("error");
                break;
        }

    }
}
