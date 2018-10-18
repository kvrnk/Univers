package by.kvrnk.bookShop.generalObjects.requests;

import by.kvrnk.bookShop.generalObjects.IGeneralObject;

import java.util.Date;

public class Request implements IGeneralObject {
    private int id;
    private String nameaBook;
    private int quantity;
    private Date dateRequest;

    public Request(int id, String nameaBook, int quantity, Date dateRequest) {
        this.id = id;
        this.nameaBook = nameaBook;
        this.quantity = quantity;
        this.dateRequest = dateRequest;
    }

    public int getId() {
        return id;
    }

    public String getNameaBook() {
        return nameaBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDateRequest() {
        return dateRequest;
    }
}
