package by.kvrnk.bookshop.sortings;



import by.kvrnk.bookshop.generalobjects.book.StockBookItem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StockBookItemSorting {
    public List<StockBookItem> byEntranceDate(List<StockBookItem> objects) {
        Collections.sort(objects, new Comparator<StockBookItem>() {
            public int compare(StockBookItem o1, StockBookItem o2) {
                return o1.getEntranceDate().compareTo(o2.getEntranceDate());
            }
        });
        return objects;
    }

    public List<StockBookItem> byPrice(List<StockBookItem> objects) {
        Collections.sort(objects, new Comparator<StockBookItem>() {
            public int compare(StockBookItem o1, StockBookItem o2) {
                return Float.valueOf(o1.getPrice()).compareTo(Float.valueOf(o2.getPrice()));
            }
        });
        return objects;
    }
}
