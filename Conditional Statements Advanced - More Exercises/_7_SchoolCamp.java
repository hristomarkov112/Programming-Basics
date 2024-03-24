import java.util.Scanner;

public class _7_SchoolCamp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        String groupGender = sc.nextLine();
        int countStudents = Integer.parseInt(sc.nextLine());
        int countNights = Integer.parseInt(sc.nextLine());

        String sportType = "0";
        double total = 0;

        switch (season) {
            case "Winter":
                if(groupGender.equals("boys")) {
                    sportType = "Judo";
                    total = countStudents * countNights * 9.60;
                } else if (groupGender.equals("girls")) {
                    sportType = "Gymnastics";
                    total = countStudents * countNights * 9.60;
                } else if (groupGender.equals("mixed")) {
                    sportType = "Ski";
                    total = countStudents * countNights * 10;
                }
                break;
            case "Spring":
                if(groupGender.equals("boys")) {
                    sportType = "Tennis";
                    total = countStudents * countNights * 7.20;
                } else if (groupGender.equals("girls")) {
                    sportType = "Athletics";
                    total = countStudents * countNights * 7.20;
                } else if (groupGender.equals("mixed")) {
                    sportType = "Cycling";
                    total = countStudents * countNights * 9.50;
                }
                break;
            case "Summer":
                if(groupGender.equals("boys")) {
                    sportType = "Football";
                    total = countStudents * countNights * 15.0;
                } else if (groupGender.equals("girls")) {
                    sportType = "Volleyball";
                    total = countStudents * countNights * 15.0;
                } else if (groupGender.equals("mixed")) {
                    sportType = "Swimming";
                    total = countStudents * countNights * 20.0;
                }
                break;



        }
        if (countStudents >= 50) {
            total = total * 0.50;
        } else if (countStudents >= 20 && countStudents < 50) {
            total = total - total * 0.15;
        } else if (countStudents >= 10 && countStudents < 20) {
            total = total - total * 0.05;
        }

        System.out.printf("%s %.2f lv.", sportType, total);

    }
}
