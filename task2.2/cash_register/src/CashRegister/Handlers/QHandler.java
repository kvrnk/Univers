package CashRegister.Handlers;

import CashRegister.Products.ProductItem;

public class QHandler implements IQHandler {

    @Override
    public void writeOffStock(ProductItem productItem) {

    }

    public QHandler(){
        System.out.println("QHandler");
    }

    public void errorGeneration(){}
}
