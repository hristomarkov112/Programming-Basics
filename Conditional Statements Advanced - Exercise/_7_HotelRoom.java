import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int countNights = Integer.parseInt(sc.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = countNights * 50.00;
            apartmentPrice = countNights * 65.00;
            if (countNights > 7 && countNights <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (countNights > 14) {
                studioPrice = studioPrice * 0.70;
                apartmentPrice = apartmentPrice * 0.90;
            }

        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = countNights * 75.20;
            apartmentPrice = countNights * 68.70;
            if (countNights > 14) {
                studioPrice = studioPrice * 0.80;
                apartmentPrice = apartmentPrice * 0.90;
            }

        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = countNights * 76.00;
            apartmentPrice = countNights * 77.00;
            if (countNights > 14) {
                apartmentPrice = apartmentPrice * 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentPrice, studioPrice);





    }
}
