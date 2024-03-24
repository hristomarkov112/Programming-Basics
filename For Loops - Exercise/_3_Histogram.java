import java.util.Scanner;

public class _3_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        //start: 1
        //end: N
        //step: +1

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for ( int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if(number < 200) {
                p1 += 1;
            } else if (number >= 200 && number <= 399) {
                p2 += 1;
            } else if (number >= 400 && number <= 599) {
                p3 += 1;
            } else if (number >= 600 && number <= 799) {
                p4 += 1;
            } else if (number >= 800) {
                p5 += 1;
            }

        }

        double totalsP = p1 + p2 + p3 + p4 + p5;

        double p1Percent = p1 / totalsP * 100.0;
        double p2Percent = p2 / totalsP * 100.0;
        double p3Percent = p3 / totalsP * 100.0;
        double p4Percent = p4 / totalsP * 100.0;
        double p5Percent = p5 / totalsP * 100.0;



        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%%n", p5Percent);


    }
}
