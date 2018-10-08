package CashRegister;

import CashRegister.CashModules.IScanner;
import CashRegister.CashModules.ISearcher;
import CashRegister.Handlers.BuyHandler;
import CashRegister.Handlers.IQHandler;
import CashRegister.Handlers.Printer;
import CashRegister.Handlers.QHandler;
import CashRegister.Products.ProductItem;

import java.util.ArrayList;

public class CashRegister {
    private ArrayList<ProductItem> basket;
    private IScanner scanner;
    private ISearcher searcher;
    private BuyHandler buyHandler;
    private float sum = 0;

    public CashRegister(IScanner scanner, ISearcher searcher){
        System.out.println("CashRegister");
        this.scanner = scanner;
        this.searcher = searcher;
        basket = new ArrayList<ProductItem>();
        buyHandler = new BuyHandler(new QHandler(), new Printer());
    }

    public String callScanner(){return scanner.readBarcode(); }

    public ProductItem searchDatabase(String barcode){
        return searcher.searchDatabase(barcode);
    }

    public void addProductInBasket(){
        basket.add(searchDatabase(callScanner()));
    }

    public void reset(){
        sum = 0;
        basket.clear();
    }

    public void makePurchase(){
       buyHandler.writeOffStock(basket);
       buyHandler.countingSum(basket);
       buyHandler.print(basket,sum);
       reset();
    }


}
