import java.util.Scanner;

public class _2_SummerOutfit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int graduses = Integer.parseInt(sc.nextLine());
        String time = sc.nextLine();


        if (graduses >= 10 && graduses <= 18) {
            if (time.equals("Morning")) {
                System.out.println("It's " + graduses + " degrees, get your Sweatshirt and Sneakers.");
            } else if (time.equals("Afternoon")) {
                System.out.println("It's " + graduses + " degrees, get your Shirt and Moccasins.");
            } else if (time.equals("Evening")) {
                System.out.println("It's " + graduses + " degrees, get your Shirt and Moccasins.");
            }
        } else if (graduses > 18 && graduses <= 24) {
            if (time.equals("Morning")) {
                System.out.println("It's " + graduses + " degrees, get your Shirt and Moccasins.");
            } else if (time.equals("Afternoon")) {
                System.out.println("It's " + graduses + " degrees, get your T-Shirt and Sandals.");
            } else if (time.equals("Evening")) {
                System.out.println("It's " + graduses + " degrees, get your Shirt and Moccasins.");
            }

        } else if (graduses >= 25) {
            if (time.equals("Morning")) {
                System.out.println("It's " + graduses + " degrees, get your T-Shirt and Sandals.");
            } else if (time.equals("Afternoon")) {
                System.out.println("It's " + graduses + " degrees, get your Swim Suit and Barefoot.");
            } else if (time.equals("Evening")) {
                System.out.println("It's " + graduses + " degrees, get your Shirt and Moccasins.");
            }
        }
    }
}
