package CashRegister.Handlers;

import CashRegister.Products.ProductItem;

import java.util.ArrayList;

public class Printer implements IPrinter {
    @Override
    public void print(ArrayList<ProductItem> basket, float sum) {

    }

    public Printer(){
        System.out.println("Printer");
    }
}
