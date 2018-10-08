package CashRegister.CashModules;

import CashRegister.Products.ProductItem;

public class Searcher implements ISearcher {
    @Override
    public ProductItem searchDatabase(String barcode) {
        return null;
    }

    public Searcher (){
        System.out.println("Seacher");
    }

    public void errorGeneration(){}
}
