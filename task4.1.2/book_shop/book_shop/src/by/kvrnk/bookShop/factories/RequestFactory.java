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

    private final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public List<Request> getRequestList(String[] signatures) {
        List<Request> requests = new ArrayList<>();
        for (String signature : signatures) {
            requests.add(buildRequestFrom(signature));
        }

        return requests;
    }

    public Request buildRequestFrom(String signature) {

        try {
            String[] values = signature.split(";");
            Request request = new Request();

            request.setId(Integer.parseInt(values[0]));
            request.setEntranceDate(format.parse(values[1]));
            request.setState(RequestStates.valueOf(values[2]));

            return request;

        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }
}
