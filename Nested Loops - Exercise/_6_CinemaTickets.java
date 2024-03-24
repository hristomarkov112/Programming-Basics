import java.util.Scanner;

public class _6_CinemaTickets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int allTickets = 0;
        int totalStudent = 0;
        int totalStandard = 0;
        int totalKid = 0;

        String command = sc.nextLine();
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(sc.nextLine());

            int ticketsCounter = 0;

            String ticketType = sc.nextLine();
            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student":
                        totalStudent++;
                        break;
                    case "standard":
                        totalStandard++;
                        break;
                    case "kid":
                        totalKid++;
                        break;
                }
                ticketsCounter++;
                allTickets++;

                if (ticketsCounter >= freeSeats) {
                    break;
                }

                ticketType = sc.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n", movieName, 100.0 * ticketsCounter / freeSeats);
            command = sc.nextLine();
        }

            System.out.printf("Total tickets: %d%n", allTickets);
            System.out.printf("%.2f%% student tickets.%n", (1.0 * totalStudent / allTickets) * 100);
            System.out.printf("%.2f%% standard tickets.%n", (1.0 * totalStandard / allTickets) * 100);
            System.out.printf("%.2f%% kids tickets.%n", (1.0 * totalKid / allTickets) * 100);


    }
}
