package by.kvrnk.bookshop.generalobjects.book;

import java.util.Date;

public class StockBookItem extends Book {

    private int quantity;
    private float price;
    private Date entranceDate;



    public StockBookItem(Book bookItem, int quantity, float price, Date entranceDate) {
        super(bookItem.getId(), bookItem.getBookName(), bookItem.getAuthorName(), bookItem.getPublicationDate(),
                bookItem.getDescription());

        this.entranceDate = entranceDate;
        this.quantity = quantity;
        this.price = price;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
