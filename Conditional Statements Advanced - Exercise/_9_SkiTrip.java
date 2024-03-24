import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class _9_SkiTrip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countDays = Integer.parseInt(sc.nextLine());
        String roomType = sc.nextLine();
        String posOrNeg = sc.nextLine();

        double onePersonRoomPrice = (countDays - 1) * 18.00;
        double apartmentPrice = (countDays - 1) * 25.00;
        double presidenApartPrice = (countDays - 1) * 35.00;

        switch (roomType) {
            case "room for one person":
                if (posOrNeg.equals("positive")) {
                    onePersonRoomPrice = onePersonRoomPrice * 1.25;
                } else if (posOrNeg.equals("negative")) {
                    onePersonRoomPrice = onePersonRoomPrice * 0.90;
                }
                System.out.printf("%.2f", onePersonRoomPrice);
                break;
            case "apartment":
                if (countDays < 10) {
                    if (posOrNeg.equals("positive")) {
                        apartmentPrice = apartmentPrice * 0.70 * 1.25;
                    } else if (posOrNeg.equals("negative")) {
                        apartmentPrice = apartmentPrice * 0.70 * 0.90;
                    }
                } else if (countDays >= 10 && countDays <= 15) {
                    if (posOrNeg.equals("positive")) {
                        apartmentPrice = apartmentPrice * 0.65 * 1.25;
                    } else if (posOrNeg.equals("negative")) {
                        apartmentPrice = apartmentPrice * 0.65 * 0.90;
                    }
                } else if (countDays > 15) {
                    if (posOrNeg.equals("positive")) {
                        apartmentPrice = apartmentPrice * 0.50 * 1.25;
                    } else if (posOrNeg.equals("negative")) {
                        apartmentPrice = apartmentPrice * 0.50 * 0.90;
                    }
                }
                System.out.printf("%.2f", apartmentPrice);
                break;
            case "president apartment":
                if (countDays < 10) {
                    if (posOrNeg.equals("positive")) {
                        presidenApartPrice = (presidenApartPrice * 0.90) * 1.25;
                    } else if (posOrNeg.equals("negative")) {
                        presidenApartPrice = (presidenApartPrice * 0.90) * 0.90;
                    }
                } else if (countDays >= 10 && countDays <= 15) {
                    if (posOrNeg.equals("positive")) {
                        presidenApartPrice = (presidenApartPrice * 0.85) * 1.25;
                    } else if (posOrNeg.equals("negative")) {
                        presidenApartPrice = (presidenApartPrice * 0.85) * 0.90;
                    }
                } else if (countDays > 15) {
                    if (posOrNeg.equals("positive")) {
                        presidenApartPrice = (presidenApartPrice * 0.80) * 1.25;
                    } else if (posOrNeg.equals("negative")) {
                        presidenApartPrice = (presidenApartPrice * 0.80) * 0.90;
                    }
                }
                System.out.printf("%.2f", presidenApartPrice);
                break;
        }


    }
}
