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
        bookCollection.addBook(new Book(5, "Book 5", "Author 3", "Edition 1", 2012, 511, 31.99));
        bookCollection.addBook(new Book(6, "Book 6", "Author 1", "Edition 1", 2015, 210, 11.99));
        // Get the list of books by a given author
        List<Book> booksByAuthor = bookCollection.getBooksByAuthor("Author 1");
        System.out.println("Список книг автора 'Author 1':");
        for (Book book : booksByAuthor) {                      //In this loop, each element of the books list is assigned to the variable book in each iteration. The loop will execute the code block for each element in the books list.
            System.out.println(book.getTitle());
        }

        // Get the list of books published by a given edition
        List<Book> booksByEdition = bookCollection.getBooksByEdition("Edition 1");
        System.out.println("Список книг выпущенных издательством 'Edition 1':");
        for (Book book : booksByEdition) {
            System.out.println(book.getTitle());
        }

        // Get the list of books published after a given year
        List<Book> booksPublishedAfterYear = bookCollection.getBooksPublishedAfterYear(2005);
        System.out.println("Списoк книг выпущенных после '2005' года:");
        for (Book book : booksPublishedAfterYear) {
            System.out.println(book.getTitle());
        }
    }
}