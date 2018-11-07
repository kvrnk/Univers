package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookItemFactory;
import by.kvrnk.bookshop.factories.RequestFactory;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.request.Request;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.List;

public class RequestManager {

    private List<Request> requests;
    private RequestFactory requestFactory;
    private BookItemFactory bookItemFactory;
    private BookManager bookManager;
    private final String PATH_TO_FILE;
    private final String PATH_TO_BOOKS_IN_REQUEST;

    public RequestManager(BookManager bookManager, final String PATH_TO_FILE, final String PATH_TO_BOOKS_IN_REQUEST) {
        this.PATH_TO_FILE = PATH_TO_FILE;
        this.PATH_TO_BOOKS_IN_REQUEST = PATH_TO_BOOKS_IN_REQUEST;
        this.bookManager = bookManager;
        requestFactory = new RequestFactory();
        bookItemFactory = new BookItemFactory(bookManager);
        requests = getRequestsListFromFile();
        fillBooksInRequest();
    }

    public List<Request> getRequestsListFromFile() {
        return requestFactory.getRequestList(TextWorker.readFromFile(PATH_TO_FILE));
    }

    private void fillBooksInRequest() {
        List<BookItem> items = bookItemFactory.getBookItemList(TextWorker.readFromFile(PATH_TO_BOOKS_IN_REQUEST));

        for (BookItem item : items) {
            this.getRequestById(item.getParentId()).getRequestBooks().add(item);
        }
    }

    public void saveOrderListInFile() {
        TextWorker.writeToFile(PATH_TO_FILE, getAsArray());
    }

    private String[] getAsArray() {
        List<String> stringRequests = new ArrayList<>();

        for (Request request : requests) {
            stringRequests.add(request.toString());
        }

        return stringRequests.toArray(new String[stringRequests.size()]);
    }

    public Request getRequestById(int id) {
        for (Request request : requests) {
            if (request.getId() == id) {
                return request;
            }
        }
        return null;
    }

    public List<Request> getListRequestForBook(String bookName) {
        List<Request> result = new ArrayList<>();
        for (Request request : requests) {
            for (BookItem inRequestBook : request.getRequestBooks()) {
                if (bookName.equals(inRequestBook.getBookName())) {
                    result.add(request);
                }
            }
        }
        return result;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void addRequest(Request request) {
        requests.add(request);
    }
}
