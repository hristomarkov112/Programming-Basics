import java.util.Scanner;

public class _6_Building {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countFloors = Integer.parseInt(sc.nextLine());
        int countRooms = Integer.parseInt(sc.nextLine());

        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room < countRooms; room++) {
                if (floor == countFloors) {
                    System.out.print("L"+ floor + room + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O"+ floor + room + " ");
                } else {
                    System.out.print("A"+ floor + room + " ");
                }

            }
            System.out.println();
        }


    }
}
