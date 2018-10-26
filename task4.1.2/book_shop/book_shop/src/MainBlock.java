import by.kvrnk.bookshop.generalobjects.book.StockBookItem;
import by.kvrnk.bookshop.managers.StockManager;

public class MainBlock {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();

        for (StockBookItem stockBookItem : stockManager.getStockBookItems()) {
            System.out.println(stockBookItem.getBookName());
        }

    }
}

