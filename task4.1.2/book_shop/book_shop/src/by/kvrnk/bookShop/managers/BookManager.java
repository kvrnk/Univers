package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookFactory;
import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books;

    private final static String PATH_TO_FILE = "./src/by.kvrnk.bookshop.files/books.txt";

    public BookManager() {

        books = getBookListFromFile();

    }

    private List<Book> getBookListFromFile() {

        return BookFactory.getBookList(TextWorker.readFromFile(PATH_TO_FILE));
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
