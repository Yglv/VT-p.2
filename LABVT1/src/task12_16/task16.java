package task12_16;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task16 {
    public static void main(String[] args) {

        var books = getBooks();
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        books.sort(titleComparator);
        System.out.println("Sorted by title:");
        outputBooks(books);

        books = getBooks();
        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle);
        titleAuthorComparator = titleAuthorComparator.thenComparing(Book::getAuthor);
        books.sort(titleAuthorComparator);
        System.out.println("\nSorted by title, then by author name:");
        outputBooks(books);

        books = getBooks();
        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor);
        authorTitleComparator = authorTitleComparator.thenComparing(Book::getTitle);
        books.sort(authorTitleComparator);
        System.out.println("\nSorted by author name, then by title:");
        outputBooks(books);

        books = getBooks();
        Comparator<Book> fullComparator = Comparator.comparing(Book::getAuthor);
        fullComparator = fullComparator.thenComparing(Book::getTitle);
        fullComparator = fullComparator.thenComparingInt(Book::getPrice);
        books.sort(fullComparator);
        System.out.println("\nSorted by author, then by title, then by price:");
        outputBooks(books);
    }

    private static List<Book> getBooks() {
        var book1 = new Book("Robinson Crusoe", "Daniel Defoe", 111);
        var book2 = new Book("Gulliver's Travels", "Jonathan Swift", 167);
        var book3 = new Book("Frankenstein", "Mary Shelley", 120);
        var book4 = new Book("Three men in a boat", "Jerome K Jerome", 219);
        var book5 = new Book("The gold bowl", "Henry James", 343);

        var list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        return list;
    }

    private static void outputBooks(List<Book> books) {
        for (var book : books) {
            System.out.println(book);
        }
    }
}
