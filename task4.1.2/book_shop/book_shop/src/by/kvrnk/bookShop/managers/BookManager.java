package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookFactory;
import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private BookFactory bookFactory;
    private List<Book> books;
    private final String PATH_TO_FILE ;

    public BookManager(final String PATH_TO_FILE) {
        bookFactory = new BookFactory();
        this.PATH_TO_FILE = PATH_TO_FILE;
        books = getBookListFromFile();
    }

    private List<Book> getBookListFromFile() {

        return bookFactory.getBookList(TextWorker.readFromFile(PATH_TO_FILE));
    }

    public void saveBookListInFile() {
        TextWorker.writeToFile(PATH_TO_FILE, getAsArray());
    }

    private String[] getAsArray() {
        List<String> stringBooks = new ArrayList<>();

        for (Book book : books) {
            stringBooks.add(book.toString());
        }

        return stringBooks.toArray(new String[stringBooks.size()]);
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }
}
