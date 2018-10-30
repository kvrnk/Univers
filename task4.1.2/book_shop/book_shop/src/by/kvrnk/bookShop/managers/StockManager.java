package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.StockBookItemFactory;
import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.book.StockBookItem;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockManager {

    List<StockBookItem> stockBookItems;

    private final static String PATH_TO_FILE = "./src/files/stock.txt";

    public StockManager() {
        stockBookItems = getBookListFromFile();
    }

    private List<StockBookItem> getBookListFromFile() {
        return StockBookItemFactory.getStockBookItemList(TextWorker.readFromFile(PATH_TO_FILE));
    }

    public void saveBookListInFile() {
        TextWorker.writeToFile(PATH_TO_FILE, getStringListImplementation());
    }

    private String[] getStringListImplementation() {
        List<String> stingBooks = new ArrayList<>();

        for (StockBookItem stockBookItem : stockBookItems) {
            stingBooks.add(stockBookItem.toString());
        }

        return stingBooks.toArray(new String[stingBooks.size()]);
    }

    public List<StockBookItem> getStaleBook(Date leftBorder, Date rightBorder) {
        List<StockBookItem> result = new ArrayList<StockBookItem>();
        for (StockBookItem bookItem : stockBookItems) {
            if(bookItem.getEntranceDate().after(leftBorder) && bookItem.getEntranceDate().before(rightBorder)){
                result.add(bookItem);
            }
        }
        return result;
    }

    public List<StockBookItem> getStockBookItems() {
        return stockBookItems;
    }

    public Book getStockBookItemById(int id) {
        for (StockBookItem stockBookItem : stockBookItems) {
            if (stockBookItem.getId() == id) {
                return stockBookItem;
            }
        }
        return null;
    }

    public void deleteBookFromStock(StockBookItem book) {
        stockBookItems.remove(book.getId());
    }

}
