import java.util.Scanner;

public class _7_HousePainting {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double x = Double.parseDouble(sc.nextLine());
    double y = Double.parseDouble(sc.nextLine());
    double h = Double.parseDouble(sc.nextLine());

    double wallArea = x * y;
    double windowArea = 1.5 * 1.5;
    double stranici = 2 * wallArea - 2* windowArea;
    double zadnaPrednaStena = x * x * 2 - 1.2 * 2;

    //Walls
    double steni = (stranici + zadnaPrednaStena) / 3.4;

    //Roof
    double rectangleRoof = 2 * x * y;
    double triangleRoof = 2 * (x * h) / 2;
    double pokriv = (rectangleRoof + triangleRoof) / 4.30;


    System.out.printf("%.2f%n", steni);
    System.out.printf("%.2f%n", pokriv);




    }
}
