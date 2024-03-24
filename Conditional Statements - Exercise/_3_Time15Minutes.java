import java.util.Scanner;

public class _3_Time15Minutes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        minutes = minutes + 15;

        if(minutes >= 60) {
            hours = hours + 1;
            minutes = minutes - 60;
        }

        if (hours >=24) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
