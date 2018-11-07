package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    public List<Book> getBookList(String[] signatures) {
        List<Book> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildBookFrom(signature));
        }

        return result;
    }

    private Book buildBookFrom(String signature) {
        String[] values = signature.split(";");
        Book book = new Book();
        book.setId(Integer.parseInt(values[0]));
        book.setBookName(values[1]);
        book.setAuthorName(values[2]);
        book.setPublicationDate(Integer.parseInt(values[3]));
        book.setDescription(values[4]);

        return book;
    }

}
