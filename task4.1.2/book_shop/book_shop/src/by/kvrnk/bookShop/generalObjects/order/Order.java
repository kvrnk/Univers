package by.kvrnk.bookshop.generalobjects.order;

import by.kvrnk.bookshop.generalobjects.book.BookItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private int id;
    private Date entranceDate;
    private Date completeDate;
    private List<BookItem> orderBooks;
    private OrderStates state;
    private float cost;

    public Order() {

    }

    public Order(int id, Date entranceDate, Date completeDate, OrderStates state) {
        this.id = id;
        this.entranceDate = entranceDate;
        this.completeDate = completeDate;
        this.state = state;
        orderBooks = new ArrayList<>();
    }

    public List<BookItem> getOrderBooks() {
        return orderBooks;
    }

    public void setOrderBooks(List<BookItem> orderBooks) {
        this.orderBooks = orderBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public OrderStates getState() {
        return state;
    }

    public void setState(OrderStates state) {
        this.state = state;
    }

    public float getCost() {
        cost = 0;
        for (BookItem bookItem : orderBooks) {
            cost += bookItem.getPrice() * bookItem.getQuantity();
        }
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
