package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookItemFactory;
import by.kvrnk.bookshop.factories.OrderFactory;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.order.Order;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders;

    private final static String PATH_TO_FILE = "./src/files/orders.txt";
    private final static String PATH_TO_BOOKS_IN_ORDER = "./src/files/books in orders.txt";

    public OrderManager() {
        orders = getOrderListFromFile();

        fillBooksInOrder();
    }

    public List<Order> getOrderListFromFile() {
        return OrderFactory.getOrderList(TextWorker.readFromFile(PATH_TO_FILE));
    }

    private void fillBooksInOrder() {
        List<BookItem> items = BookItemFactory.getBookItemList(TextWorker.readFromFile(PATH_TO_BOOKS_IN_ORDER));

        for (BookItem item : items) {
            this.getOrderById(item.getParentId()).getOrderBooks().add(item);
        }
    }

    public void saveOrderListInFile() {
        TextWorker.writeToFile(PATH_TO_FILE, getStringListImplementation());
    }

    private String[] getStringListImplementation() {
        List<String> stringOrders = new ArrayList<>();

        for (Order order : orders) {
            stringOrders.add(order.toString());
        }

        return stringOrders.toArray(new String[stringOrders.size()]);
    }

    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        System.out.println("dsfsdf");
        return null;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
