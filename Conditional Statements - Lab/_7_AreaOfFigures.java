import java.util.Scanner;

public class _7_AreaOfFigures {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String figureType = sc.nextLine();

        if(figureType.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            System.out.println(a * a);
        } else if (figureType.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            System.out.println(a * b);
        } else if (figureType.equals("circle")) {
            double r = Double.parseDouble(sc.nextLine());
            System.out.println(r * r * Math.PI);
        } else if (figureType.equals("triangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            System.out.println(a * h / 2);
        }

    }
}
