package CashRegister.Handlers;

import CashRegister.Products.ProductItem;

import java.util.ArrayList;

public class BuyHandler {
    private IQHandler qHandler;
    private IPrinter printer;

    public BuyHandler(IQHandler qHandler, IPrinter printer){
        System.out.println("BuyHandler");
        this.qHandler = qHandler;
        this.printer = printer;
    }


    public void writeOffStock(ArrayList<ProductItem> basket){
        for(ProductItem p : basket){
            qHandler.writeOffStock(p);
        }
    }

    public float countingSum(ArrayList<ProductItem> basket){
        float sum = 0;
        for(ProductItem p : basket){
            sum += p.getPrice();
        }
        return sum;
    }

    public void print(ArrayList<ProductItem> basket, float sum){
        printer.print(basket, sum);
    }
}
