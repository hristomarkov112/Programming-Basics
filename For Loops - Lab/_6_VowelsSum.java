import java.util.Enumeration;
import java.util.Scanner;

public class _6_VowelsSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        //начало:
        //край: text.length
        //инкремент: 1

        int sumOfVowels = 0;


        for(int index = 0; index <text.length(); index++) {
             char letter = text.charAt(index);

             switch (letter) {

                 case 'a':
                     sumOfVowels = sumOfVowels + 1;
                     break;
                 case 'e':
                     sumOfVowels = sumOfVowels + 2;
                     break;
                 case 'i':
                     sumOfVowels = sumOfVowels + 3;
                     break;
                 case 'o':
                     sumOfVowels = sumOfVowels + 4;
                     break;
                 case 'u':
                     sumOfVowels = sumOfVowels + 5;
                     break;
             }
        }
        System.out.println(sumOfVowels);
    }
}
