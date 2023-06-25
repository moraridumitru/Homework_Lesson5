import java.util.ArrayList;
import java.util.List;
public class BookCollectionDemo {
    public static void main(String[] args) {
        // Create a new book collection
        BookCollection bookCollection = new BookCollection();

        // Add books to the collection
        bookCollection.addBook(new Book(1, "Book 1", "Author 1", "Edition 1", 2000, 320, 12.99));
        bookCollection.addBook(new Book(2, "Book 2", "Author 2", "Edition 2", 2005, 251, 15.99));
        bookCollection.addBook(new Book(3, "Book 3", "Author 1", "Edition 1", 2010, 479, 18.99));
        bookCollection.addBook(new Book(4, "Book 4", "Author 2", "Edition 3", 2011, 500, 19.99));
        // Get the list of books by a given author
        List<Book> booksByAuthor = bookCollection.getBooksByAuthor("Author 1");
        System.out.println("List of books by given author:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Get the list of books published by a given edition
        List<Book> booksByEdition = bookCollection.getBooksByEdition("Edition 1");
        System.out.println("List of books published by given edition:");
        for (Book book : booksByEdition) {
            System.out.println(book.getTitle());
        }

        // Get the list of books published after a given year
        List<Book> booksPublishedAfterYear = bookCollection.getBooksPublishedAfterYear(2005);
        System.out.println("List of books published after given year:");
        for (Book book : booksPublishedAfterYear) {
            System.out.println(book.getTitle());
        }
    }
}