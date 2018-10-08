package CashRegister.CashModules;

import CashRegister.Products.ProductItem;

public interface ISearcher {
    public ProductItem searchDatabase(String barcode);
}
