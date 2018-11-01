package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.StockBookItem;
import by.kvrnk.bookshop.managers.BookManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockBookItemFactory {

    private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public static List<StockBookItem> getStockBookItemList(String[] signatures) {
        List<StockBookItem> stockBookItems = new ArrayList<>();
        BookManager bookManager = new BookManager();
        for (String signature : signatures) {
            stockBookItems.add(buildStockBookItemFrom(signature, bookManager));
        }

        return stockBookItems;
    }

    public static StockBookItem buildStockBookItemFrom(String signature, BookManager bookManager) {
        String[] values = signature.split(";");

        Book book = bookManager.getBookById(Integer.parseInt(values[0]));
        int quantity = Integer.parseInt(values[1]);
        float price = Float.parseFloat(values[2]);
        Date entranceDate;

        try {
            entranceDate = format.parse(values[3]);
        } catch (ParseException e) {
            e.printStackTrace();
            entranceDate = null;
        }

        return new StockBookItem(book, quantity, price, entranceDate);
    }
}
