package by.kvrnk.bookshop.generalobjects.request;

import by.kvrnk.bookshop.generalobjects.book.BookItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Request {

    private int id;
    private Date entranceDate;
    private List<BookItem> requestBooks;
    private RequestStates state;

    public Request(int id, Date entranceDate, RequestStates state) {
        this.id = id;
        this.entranceDate = entranceDate;
        this.requestBooks = new ArrayList<>();
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BookItem> getRequestBooks() {
        return requestBooks;
    }

    public void setRequestBooks(List<BookItem> requestBooks) {
        this.requestBooks = requestBooks;
    }

    public RequestStates getState() {
        return state;
    }

    public void setState(RequestStates state) {
        this.state = state;
    }
}
