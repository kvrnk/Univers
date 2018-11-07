package by.kvrnk.bookshop.managers;

import by.kvrnk.bookshop.generalobjects.book.Book;
import by.kvrnk.bookshop.generalobjects.book.BookItem;
import by.kvrnk.bookshop.generalobjects.book.StockBookItem;
import by.kvrnk.bookshop.generalobjects.order.Order;
import by.kvrnk.bookshop.generalobjects.request.Request;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class Facade {
    private RequestManager requestManager;
    private BookManager bookManager;
    private OrderManager orderManager;
    private StockManager stockManager;

    public Facade(String pathToProperties) {
        initializer(pathToProperties);
    }

    private void initializer(String pathToProperties) {
        FileInputStream fis;
        Properties properties = new Properties();

        try {
            fis = new FileInputStream(pathToProperties);
            properties.load(fis);
            bookManager = new BookManager(properties.getProperty("db.books"));
            stockManager = new StockManager(bookManager, properties.getProperty("db.stock"));
            requestManager = new RequestManager(bookManager, properties.getProperty("db.requests"), properties.getProperty("db.booksInRequest"));
            orderManager = new OrderManager(bookManager, stockManager, properties.getProperty("db.orders"), properties.getProperty("db.booksInOrder"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Order> getCompletedOrdersByPeriod(Date leftBorder, Date rightBorder) {
        return orderManager.getCompletedOrdersByPeriod(leftBorder, rightBorder);
    }

    public float getSumCompletedOrdersByPeriod(Date leftBorder, Date rightBorder) {
        return orderManager.getSumCompletedOrdersByPeriod(leftBorder,rightBorder);
    }

    public int getQuantityCompletedOrdersByPeriod(Date leftBorder, Date rightBorder) {
        return orderManager.getQuantityCompletedOrdersByPeriod(leftBorder, rightBorder);
    }

    public List<Order> getOrders() {
        return orderManager.getOrders();
    }

    public void addOrder(Order order) {
        orderManager.addOrder(order);
    }

    public void fulfillOrder(Order order) {
       orderManager.handlerOrder(order);
    }

    public void cancelOrder(Order order) {
        orderManager.cancelOrder(order);
    }

    public List<StockBookItem> getStaleBook(Date leftBorder, Date rightBorder) {
        return stockManager.getStaleBook(leftBorder,rightBorder);
    }

    public List<StockBookItem> getStockBook() {
        return stockManager.getStockBookItems();
    }

    public void deleteBookFromStock(StockBookItem book) {
        stockManager.deleteBookFromStock(book);
    }

    public List<Request> getListRequestForBook(String bookName) {
        return requestManager.getListRequestForBook(bookName);
    }

    public List<Request> getRequests() {
        return requestManager.getRequests();
    }

    public void addRequest(Request request) {
        requestManager.addRequest(request);
    }

    public List<Book> getBooks() {
        return bookManager.getBooks();
    }

}
