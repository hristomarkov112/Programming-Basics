import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countOpenTabs = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        //start: 0
        //end: N
        //step: 1

        for (int i = 1; i <= countOpenTabs; i++) {
            String tabType = sc.nextLine();

            switch (tabType) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0)
            System.out.println(salary);
    }




}
