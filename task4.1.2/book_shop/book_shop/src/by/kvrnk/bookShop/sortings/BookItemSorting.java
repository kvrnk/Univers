package by.kvrnk.bookshop.sortings;

import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.BookItem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookItemSorting {
    public List<BookItem> byAlhabet(List<BookItem> objects) {
        Collections.sort(objects, new Comparator<BookItem>() {
            public int compare(BookItem o1, BookItem o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });
        return objects;
    }

    public List<BookItem> byPublicationDate(List<BookItem> objects) {
        Collections.sort(objects, new Comparator<BookItem>() {
            public int compare(BookItem o1, BookItem o2) {
                return o1.getPublicationDate() - o2.getPublicationDate();
            }
        });
        return objects;
    }

    public List<BookItem> byPrice(List<BookItem> objects) {
        Collections.sort(objects, new Comparator<BookItem>() {
            public int compare(BookItem o1, BookItem o2) {
                return Float.valueOf(o1.getPrice()).compareTo(Float.valueOf(o2.getPrice()));
            }
        });
        return objects;
    }

}
