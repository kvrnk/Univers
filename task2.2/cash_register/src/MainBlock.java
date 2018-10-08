import CashRegister.CashModules.Scanner;
import CashRegister.CashModules.Searcher;
import CashRegister.CashRegister;

public class MainBlock {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(new Scanner(),new Searcher());
    }
}
