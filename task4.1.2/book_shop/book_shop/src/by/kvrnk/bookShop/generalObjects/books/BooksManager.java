package by.kvrnk.bookShop.generalObjects.books;

import by.kvrnk.bookShop.textManagers.TextBookManager;
import by.kvrnk.bookShop.textManagers.TextManager;

import java.util.ArrayList;

public class BooksManager {
    private ArrayList<Book> books;

    public BooksManager() {

    }

    public void initBooksFromFile(String pathToFile) {
        books = TextBookManager.getBooks(TextManager.textToRead(pathToFile));
    }

    public void saveBooks() {

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook() {

    }

    public Book getBookByIndex(int index) {
        return books.get(index);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
