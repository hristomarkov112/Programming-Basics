import java.util.Scanner;

public class _5_TrainingLab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double h = Double.parseDouble(sc.nextLine());
        double w = Double.parseDouble(sc.nextLine());

        double hallW = (w - 1) / 0.70;
        double hallH = h / 1.2;

        double total = Math.floor(hallW) * Math.floor(hallH) - 3;

        System.out.println(Math.round(total));


    }
}
