import java.util.Scanner;

public class problem1Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String title = input.nextLine();
        String author = input.nextLine();
        int page = input.nextInt();

        LibraryBook book = new LibraryBook();
        book.setBookTitle(title);
        book.setAuthor(author);
        book.setPage(page);

        System.out.println(book.isThick());

    }
}
