import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int apartmentVolume = width * length * height;
        boolean isFull = false;

        String command = sc.nextLine();
        while (!(command).equals("Done")) {
            int countBoxes = Integer.parseInt(command);
            apartmentVolume -= countBoxes;

            if (apartmentVolume <= 0) {
                isFull = true;
                break;
            }
            command = sc.nextLine();
        }

        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(apartmentVolume));
        } else {
            System.out.printf("%d Cubic meters left.", apartmentVolume);
        }
    }
}
