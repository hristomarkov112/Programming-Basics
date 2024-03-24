import java.util.Scanner;

public class _8_PointOnRectangleBorder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());
        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());

        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());

        //Inside x
        if(x > x1 && x < x2) {
            //Inside y
            if(y > y1 && y < y2) {
                System.out.println("Inside / Outside");
            //Border y
            } else if (y == y1 || y == y2) {
                System.out.println("Border");
            //Outside y
            } else {
                System.out.println("Inside / Outside");
            }

        //Border x
        } else if ((x == x1 && x < x2) || (x > x1 && x == x2)) {
                //Inside y
                if (y > y1 && y < y2) {
                    System.out.println("Border");
                //Border y
                } else if (y == y1 || y == y2) {
                    System.out.println("Border");
                //Outside y
                } else {
                    System.out.println("Inside / Outside");
                }
        //Outside x
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
