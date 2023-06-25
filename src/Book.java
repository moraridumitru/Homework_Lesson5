/** Cоздать коллекцию Book (id,название ,автор, год издания ,количество страниц ,цена)
        Вывести:
        a)Список книг заданого автора
        b)Список книг выпущенных заданным издательством
        c)списoк книг выпущенных после заданного года **/

import java.util.ArrayList;
import java.util.List;

class Book {
    private int id;
    private String title;
    private String author;
    private String edition;
    private int year;
    private int pageCount;
    private double price;
    // initializam constructorul Book
    public Book(int id, String title, String author, String edition, int year, int pageCount, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class BookCollection {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {       //This method takes a Book object as a parameter and adds it to the books list.
        books.add(book);
    }

    public List<Book> getBooksByAuthor(String author) {       //This method takes an author name as a parameter and returns a list of Book objects that have the specified author.
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBooksByEdition(String edition) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getEdition().equals(edition)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> getBooksPublishedAfterYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book);
            }
        }
        return result;
    }
}