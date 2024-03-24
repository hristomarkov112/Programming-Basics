import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int rowsCount = Integer.parseInt(sc.nextLine());
        int columnsCount = Integer.parseInt(sc.nextLine());
        double price = 0;



        if(type.equals("Premiere")) {
            price = 12.00;
            double income = rowsCount * columnsCount * price;
            System.out.printf("%.2f", income);
        } else if (type.equals("Normal")) {
            price = 7.50;
            double income = rowsCount * columnsCount * price;
            System.out.printf("%.2f", income);
        } else if (type.equals("Discount")) {
            price = 5.00;
            double income = rowsCount * columnsCount * price;
            System.out.printf("%.2f", income);
        }
    }
}
