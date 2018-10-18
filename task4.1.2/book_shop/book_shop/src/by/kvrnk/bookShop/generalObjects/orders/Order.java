package by.kvrnk.bookShop.generalObjects.orders;

import by.kvrnk.bookShop.generalObjects.IGeneralObject;
import by.kvrnk.bookShop.generalObjects.books.Book;
import java.util.ArrayList;
import java.util.Date;

public class Order implements IGeneralObject {
    private int id;
    private Date dateEntrance;
    private Date dateImplementation;
    private ArrayList<Book> bookArrayList;
    private float cost;
    private int state;

    public Order(int id, Date dateEntrance, Date dateImplementation, ArrayList<Book> bookArrayList, float cost, int state) {
        this.id = id;
        this.dateEntrance = dateEntrance;
        this.bookArrayList = bookArrayList;
        this.cost = cost;
        this.state = state;
    }

    public int getIdOrder() {
        return id;
    }

    public Date getDateEntrance() {
        return dateEntrance;
    }

    public void setDateEntrance(Date dateEntrance) {
        this.dateEntrance = dateEntrance;
    }

    public Date getDateImplementation() {
        return dateImplementation;
    }

    public void setDateImplementation(Date dateImplementation) {
        this.dateImplementation = dateImplementation;
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
