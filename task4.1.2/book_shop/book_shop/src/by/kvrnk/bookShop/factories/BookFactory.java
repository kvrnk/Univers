package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    public static List<Book> getBookList(String[] signatures) {
        List<Book> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildBookFrom(signature));
        }

        return result;
    }

    private static Book buildBookFrom(String signature) {
        String[] values = signature.split(";");

        int id = Integer.parseInt(values[0]);
        String bookName = values[1];
        String authorName = values[2];
        int publicationDate = Integer.parseInt(values[3]);
        String description = values[4];

        return new Book(id, bookName, authorName, publicationDate, description);
    }

}
