package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookFactory;
import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books;

    private final static String PATH_TO_FILE = "./src/files/books.txt";

    public BookManager() {

        books = getBookListFromFile();

    }

    private List<Book> getBookListFromFile() {

        return BookFactory.getBookList(TextWorker.readFromFile(PATH_TO_FILE));
    }

    public void saveBookListInFile() {
        TextWorker.writeToFile(PATH_TO_FILE, getStringListImplementation());
    }

    private String[] getStringListImplementation() {
        List<String> stingBooks = new ArrayList<>();

        for (Book book : books) {
            stingBooks.add(book.toString());
        }

        return stingBooks.toArray(new String[stingBooks.size()]);
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
