package by.kvrnk.bookShop.generalObjects.stock;

import by.kvrnk.bookShop.generalObjects.IGeneralObject;

public class Stock implements IGeneralObject {
   private int idBook;
   private int quantity;

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
