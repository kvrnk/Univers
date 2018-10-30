package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookItemFactory;
import by.kvrnk.bookshop.factories.RequestFactory;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.request.Request;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.List;

public class RequestManager {

    List<Request> requests;

    private final static String PATH_TO_FILE = "./src/files/requests.txt";
    private final static String PATH_TO_BOOKS_IN_REQUEST = "./src/files/books in requests.txt";

    public RequestManager() {
        requests = getRequestsListFromFile();
        fillBooksInRequest();
    }

    public List<Request> getRequestsListFromFile() {
        return RequestFactory.getRequestList(TextWorker.readFromFile(PATH_TO_FILE));
    }

    private void fillBooksInRequest() {
        List<BookItem> items = BookItemFactory.getBookItemList(TextWorker.readFromFile(PATH_TO_BOOKS_IN_REQUEST));

        for (BookItem item : items) {
            this.getRequestById(item.getParentId()).getRequestBooks().add(item);
        }
    }

    public void saveOrderListInFile() {
        TextWorker.writeToFile(PATH_TO_FILE, getStringListImplementation());
    }

    private String[] getStringListImplementation() {
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

    public List<Request> getListRequestForBook(String BookName) {
        List<Request> result = new ArrayList<>();
        for (Request request : requests) {
            for (int i =0; i < request.getRequestBooks().size(); i++){
                if (BookName.equals(request.getRequestBooks().get(i))) {
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
