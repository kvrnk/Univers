package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.managers.BookManager;

import java.util.ArrayList;
import java.util.List;

public class BookItemFactory {

    public static List<BookItem> getBookItemList(String[] signatures) {
        List<BookItem> result = new ArrayList<>();
        BookManager bookManager = new BookManager();

        for (String signature : signatures) {
            result.add(buildBookItemFrom(signature, bookManager));
        }

        return result;
    }

    public static BookItem buildBookItemFrom(String signature, BookManager bookManager) {
        String[] values = signature.split(";");

        int parentId = Integer.parseInt(values[0]);
        Book book = bookManager.getBookById(Integer.parseInt(values[1]));
        int quantity = Integer.parseInt(values[2]);
        if(values[3] == null) {
            values[3] = "0.0";
        }
        float price = Float.parseFloat(values[3]);

        return new BookItem(book, parentId, price, quantity);
    }
}
