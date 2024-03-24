import java.util.Scanner;

public class _1_PipesInPool {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = Integer.parseInt(sc.nextLine());
        int pipe1 = Integer.parseInt(sc.nextLine());
        int pipe2 = Integer.parseInt(sc.nextLine());
        double hours = Double.parseDouble(sc.nextLine());

        double pipe1Progress = pipe1 * hours;
        double pipe2Progress = pipe2 * hours;

        double howFullIs = (pipe1Progress + pipe2Progress) / volume * 100;
        double contributionPipe1 = pipe1Progress / (pipe1Progress + pipe2Progress) * 100;
        double contributionPipe2 = pipe2Progress / (pipe1Progress + pipe2Progress) * 100;

        double difference = Math.abs(volume - (pipe1Progress + pipe2Progress));

        if (volume >= pipe1Progress + pipe2Progress) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", howFullIs, contributionPipe1, contributionPipe2);
        } else {
            System.out.printf("For %.2f hours ", hours);
            System.out.printf("the pool overflows with %.2f liters.", difference);
        }
    }
}
