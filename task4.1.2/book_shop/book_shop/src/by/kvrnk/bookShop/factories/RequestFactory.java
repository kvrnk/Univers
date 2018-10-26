package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.request.Request;
import by.kvrnk.bookshop.generalobjects.request.RequestStates;
import by.kvrnk.bookshop.managers.BookManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequestFactory {

    private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public static List<Request> getRequestList(String[] signatures) {
        List<Request> requests = new ArrayList<>();
        for (String signature : signatures) {
            requests.add(buildRequestFrom(signature));
        }

        return requests;
    }

    public static Request buildRequestFrom(String signature) {
        String[] values = signature.split(";");

        int id = Integer.parseInt(values[0]);
        Date entranceDate;

        try {
           entranceDate = format.parse(values[1]);
        } catch (ParseException e) {
            e.printStackTrace();
            entranceDate = null;
        }

        RequestStates state = RequestStates.valueOf(values[2]);

        return new Request(id, entranceDate, state);
    }
}
