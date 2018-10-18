package by.kvrnk.bookShop.generalObjects.books;

import by.kvrnk.bookShop.generalObjects.IGeneralObject;

import java.util.Date;

public class Book implements IGeneralObject {
    private int id;
    private String nameBook;
    private String nameAuthor;
    private Date datePublication;
    private float price;
    private Date dateEntranceStock;
    private int quantity;
    private String description;
    private int availability;

    public Book(int id, String nameBook, String nameAuthor, Date datePublication, float price, Date dateEntranceStock, int quantity, String description, int availability) {
        this.id = id;
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.datePublication = datePublication;
        this.price = price;
        this.dateEntranceStock = dateEntranceStock;
        this.quantity = quantity;
        this.description = description;
        this.availability = availability;
    }

    public int getIdBook() {
        return id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDateEntranceStock() {
        return dateEntranceStock;
    }

    public void setDateEntranceStock(Date dateEntranceStock) {
        this.dateEntranceStock = dateEntranceStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}
