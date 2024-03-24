import java.util.Scanner;

public class _7_WorkingHours {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dayTime = Integer.parseInt(sc.nextLine());
        String dayOfWeek = sc.nextLine();

        switch (dayOfWeek) {
            case "Monday":
                if(dayTime >= 10 && dayTime < 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
        break;
            case "Tuesday":
                if(dayTime >= 10 && dayTime < 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
        break;
            case "Wednesday":
                if(dayTime > 10 && dayTime < 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
        break;
            case "Thursday":
                if(dayTime >= 10 && dayTime < 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
        break;
            case "Friday":
                if(dayTime >= 10 && dayTime < 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
        break;
            case "Saturday":
                if(dayTime >= 10 && dayTime < 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
        break;
            case "Sunday":
                System.out.println("closed");

        break;
        }

    }
}
