package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.managers.BookManager;

import java.util.ArrayList;
import java.util.List;

public class BookItemFactory {

    private BookManager bookManager;

    public BookItemFactory(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    public List<BookItem> getBookItemList(String[] signatures) {
        List<BookItem> result = new ArrayList<>();
        for (String signature : signatures) {
            result.add(buildBookItemFrom(signature, bookManager));
        }

        return result;
    }

    public BookItem buildBookItemFrom(String signature, BookManager bookManager) {
        String[] values = signature.split(";");

        int parentId = Integer.parseInt(values[0]);
        Book book = bookManager.getBookById(Integer.parseInt(values[1]));
        int quantity = Integer.parseInt(values[2]);

        float price;

        if(values.length == 4) {
            price = Float.parseFloat(values[3]);
        } else {
            price = Float.parseFloat("0.0");
        }

        return new BookItem(book, parentId, price, quantity);
    }
}
