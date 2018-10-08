package CashRegister.Handlers;

import CashRegister.Products.ProductItem;

import java.util.ArrayList;

public interface IPrinter {
    public void print(ArrayList<ProductItem> basket, float sum);
}
