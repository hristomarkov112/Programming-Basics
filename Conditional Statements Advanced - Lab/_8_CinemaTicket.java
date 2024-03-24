import java.util.Scanner;

public class _8_CinemaTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dayofWeek = sc.nextLine();

        switch (dayofWeek) {
            case "Monday":
            case "Tuesday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Friday":
                System.out.println("12");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
        }

    }
}
