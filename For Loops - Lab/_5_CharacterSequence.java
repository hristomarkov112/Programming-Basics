import java.util.Scanner;

public class _5_CharacterSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        //начало: 0
        //край: text.length
        //инкремент:

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);
            System.out.println(letter);

        }

    }
}
