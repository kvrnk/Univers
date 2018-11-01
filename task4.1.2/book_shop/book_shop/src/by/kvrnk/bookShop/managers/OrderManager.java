package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.factories.BookItemFactory;
import by.kvrnk.bookshop.factories.OrderFactory;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.book.StockBookItem;
import by.kvrnk.bookshop.generalobjects.order.Order;
import by.kvrnk.bookshop.generalobjects.order.OrderStates;
import by.kvrnk.bookshop.textworkers.TextWorker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderManager {

    private List<Order> orders;

    private final static String PATH_TO_FILE = "./src/by.kvrnk.bookshop.files/orders.txt";
    private final static String PATH_TO_BOOKS_IN_ORDER = "./src/by.kvrnk.bookshop.files/books in orders.txt";

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
        TextWorker.writeToFile(PATH_TO_FILE, getAsArray());
    }

    private String[] getAsArray() {
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
        return null;
    }


    public List<Order> getCompletedOrdersByPeriod(Date leftBorder, Date rightBorder) {
        List<Order> result = new ArrayList<Order>();
        for (Order order : orders) {
            if (order.getState() == OrderStates.done) {
                if (order.getCompleteDate().after(leftBorder) && order.getCompleteDate().before(rightBorder)) {
                    result.add(order);
                }
            }
        }
        return result;
    }

    public float getSumCompletedOrdersByPeriod(Date leftBorder, Date rightBorder) {
        float sum = 0;
        for (Order order : getCompletedOrdersByPeriod(leftBorder,rightBorder )) {
            sum += order.getCost();
        }
        return sum;
    }

    public int getQuantityCompletedOrdersByPeriod(Date leftBorder, Date rightBorder) {
        return getCompletedOrdersByPeriod(leftBorder, rightBorder).size();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void handlerOrder(Order order) {
        StockManager stockManager = new StockManager();
        for (int i = 0; i < order.getOrderBooks().size(); i++) {
            for (int j = 0; j < stockManager.getStockBookItems().size(); j++) {
                if (stockManager.getStockBookItems().get(i).getId() == order.getOrderBooks().get(i).getId()) {
                    stockManager.getStockBookItems().get(i).setQuantity(stockManager.getStockBookItems().get(i).getQuantity() - order.getOrderBooks().get(i).getQuantity());
                    if (stockManager.getStockBookItems().get(i).getQuantity() - order.getOrderBooks().get(i).getQuantity() == 0) {
                        stockManager.deleteBookFromStock(stockManager.getStockBookItems().get(i));
                    }
                }
            }
            if (i == order.getOrderBooks().size() - 1) {
                order.setState(OrderStates.done);
            }
        }
    }

    public void cancelOrder(Order order) {
        order.setState(OrderStates.canceled);
    }

}
