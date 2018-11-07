package by.kvrnk.bookshop;

import by.kvrnk.bookshop.managers.Facade;

public class MainBlock {
    public static void main(String[] args) {
        Facade facade = new Facade(args[0]);

        System.out.println(facade.getBooks().get(0).getBookName());
    }

}
