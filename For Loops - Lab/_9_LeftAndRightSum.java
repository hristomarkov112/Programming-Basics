import java.util.Scanner;

public class _9_LeftAndRightSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int leftSide = 0;
        int rightSide = 0;

        for(int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            leftSide += number;
        }

        for(int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            rightSide += number;
        }

        int diff = Math.abs(leftSide-rightSide);

        if(leftSide == rightSide) {
            System.out.println("Yes, sum = " + rightSide);
        } else {
            System.out.println("No, diff = " + diff);
        }
    }
}
