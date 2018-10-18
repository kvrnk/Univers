package by.kvrnk.bookShop.textManagers;

import by.kvrnk.bookShop.generalObjects.books.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TextBookManager {

    private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public static ArrayList<Book> getBooks(String[] stringList) {
        ArrayList<Book> books = new ArrayList<Book>();

        try {
            String[] words = null;
            for (String line : stringList) {
                words = line.split(";");
                books.add(new Book(1, words[1], words[2], format.parse(words[3]), Float.parseFloat(words[4]), format.parse(words[5]), Integer.parseInt(words[6]), words[7], Integer.parseInt(words[8])));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return books;
    }
}
