import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bookSearched = sc.nextLine();

        String search = "0";
        int countSearchedBooks = 0;

        while (!search.equals(bookSearched)) {
            String currentSearch = sc.nextLine();

            if (currentSearch.equals(bookSearched)) {
                System.out.printf("You checked %d books and found it.", countSearchedBooks);
                break;
            }

            if(currentSearch.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", countSearchedBooks);
                break;
            }
            countSearchedBooks++;
        }
    }
}
